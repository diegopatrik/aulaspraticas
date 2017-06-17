package br.ufrpe.social_network.negocio;

import java.util.ArrayList;

import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;

public class Fachada {
	
	private PersonController pessoas;
	private PostController posts;
    
    // ok Implementar Fachada que usa métodos do controlador de pessoas e posts
    // Todos os métodos devem ser do tipo delegate e podem ser gerados 
    // automaticamente pelo Eclipse se não houver conflito de nomes
    
    // ok implementar singleton
	
	private static Fachada instance;
	
	private Fachada(){
		
		this.pessoas = PersonController.getInstance();
		this.posts = PostController.getInstance();
		
	}
	
	public static Fachada getInstance(){
		if(instance == null){
			instance = new Fachada();
		}
		
		return instance;
	}

	public void salvaPessoa(Person p) {
		pessoas.savePerson(p);
	}

	public void atualizaPessoa(Person newPerson) {
		pessoas.update(newPerson);
	}

	public void apagarPessoa(Person p) {
		pessoas.deletePerson(p);
	}

	public void postar(Post p) {
		posts.posta(p);
	}

	public Post procurarPost(long postId) {
		return posts.procurar(postId);
	}
	
	public Person procurarPessoa(long pessoaId) {
		return pessoas.find(pessoaId);
	}

	public void apagarPost(Post p) {
		posts.deletePost(p);
	}

	public ArrayList<Post> listarPessoas(Person p) {
		return posts.listar(p);
	}
	
}
