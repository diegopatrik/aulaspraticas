package br.ufrpe.social_network.negocio;

import br.ufrpe.social_network.dao.PersonDAO;
import br.ufrpe.social_network.negocio.beans.Person;

public class PersonController {
    
    private PersonDAO personsRepository;
    private static PersonController instance;
    
    private PersonController() {
        // Construtor privado para implementação de singleton
    }

    public static PersonController getInstance() {
        if (instance == null) {
            instance = new PersonController();
        }
        return instance;
    }
    
    public void savePerson(Person p) {
        // ok Método que salva pessoa no repositório
    	if(p != null){
    		personsRepository.cadastrar(p);
    	}
    }
    
    public Person find(long personId) {
        // ok Retorna o objeto do tipo Person que contenha aquele ID
    	
        return personsRepository.procurar(personId);
    }
    
    public void update(Person newPerson) {
        //ok Encontra no repositório obj que tenha id igual a newPerson.id e atualiza objeto
    	
    	if(newPerson != null){
    		personsRepository.atualizar(newPerson);
    	}
    }
    
    public void delete(Person p) {
        // ok apaga do repositório objeto que contenha o id igual a p.id 
    	
    	if(p != null){
    		personsRepository.remover(p);
    	}
    }
}
