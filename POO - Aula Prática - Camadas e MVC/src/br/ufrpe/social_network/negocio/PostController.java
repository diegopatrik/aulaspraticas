package br.ufrpe.social_network.negocio;

import java.util.ArrayList;

import br.ufrpe.social_network.dao.PostDAO;
import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;

public class PostController {
    
    private PostDAO postsRepository;
    private static PostController instance;
    
    // ok implementar corpo dos métodos CRUD deste controlador
    
    public void posta(Post p) {
        
    	if(p != null){
    		postsRepository.postar(p);
    	}
    }
    
    public Post procurar(long postId) {
        
        return postsRepository.procurar(postId);
    }
    
    public void update(Post newPost) {
        
    	if(newPost != null){
    		postsRepository.atualizar(newPost);
    	}
    }
    
    public void deletePost(Post p) {
      
    	if(p != null){
    		postsRepository.remover(p);
    	}
    }

    // ok Implementar singleton para este controlador
    
    public static PostController getInstance(){
    	if(instance == null){
    		instance = new PostController();
    	}
    	
    	return instance;
    }
    
    
    // ok Implementar método que lista todos os posts de uma determinada pessoa
    
    public ArrayList<Post> listar(Person p){
    	
    	return postsRepository.listar(p);
    	
    }
    
    // TODO DESAFIO Implementar método que busque todos comentários que uma dada pessoa realizou em posts de terceiros
    // Para implementar este método, você deve fazer uma buscar em todos os 
    // comentários de todos os posts, verificando quem realizou aqueele comentário.
    // Lembre-se que é possível realizar comentários de comentários e busca 
    // precisaria ser feita em profundidade
}
