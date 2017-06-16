package br.ufrpe.social_network.dao;
import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;
import java.util.ArrayList;

public class PostDAO {
	
	private ArrayList<Post> posts;
	
	public PostDAO(){
		this.posts = new ArrayList<>();
	}
    
    //ok implementar singleton para esta classe - PostDAO
	
	public static PostDAO instance;
	
	public static PostDAO getInstance(){
		if(instance == null){
			instance = new PostDAO();
		}
		
		return instance;
	}
    
    //ok Implementar CRUD para classe básica Post usando ArrayList
	/*
     * Antes de implementar os métodos, pense bem na assinatura dos mesmos
     */
	
	public void postar(Post p){
		posts.add(p);
	}
	
	public void postar(String texto, Person author){
		Post p = new Post(texto,author);
		postar(p);
	}
	
	public Post procurar(long id){
		
		for(Post pp : posts){
			if(pp.getId() == id){
				return pp;
			}
		}
		
		return null;
	}
	
	public void remover(Post p){
		int n = (int) p.getId();
		
		if(posts.get(n) != null){
				posts.remove(n);
			}
		}
	
	public void atualizar(Post p){
		int m = (int) p.getId();
		
		if(posts.get(m) != null){
			posts.set(m,p);
		}
	}
	
	public ArrayList<Post> listar(Person p){
		ArrayList<Post> postsPessoa = new ArrayList<>();
		
		for(Post pt : posts){
			if(pt.getAuthor().equals(p)){
				postsPessoa.add(pt);
			}
		}
		
		return postsPessoa;
	}
	
}
