package br.ufrpe.social_network.dao;
import java.time.LocalDate;

import br.ufrpe.social_network.negocio.beans.Person;

public class PersonDAO {
	
	private Person[] pessoas;
	private int proxima;
	
	public PersonDAO(){
		this.pessoas = new Person[1000];
		this.proxima = 0;
	}
    
    //ok implementar singleton para esta classe - PersonDAO
	
	public static PersonDAO instance;
	
	public static PersonDAO getInstance(){
		if(instance == null){
			instance = new PersonDAO();
		}
		
		return instance;
	}
    
    //ok Implementar CRUD para classe básica Person usando array
    
    /*
     * Antes de implementar os métodos, pense bem na assinatura dos mesmos
     */
	
	public void cadastrar(Person p){
		
		if(p != null){
			
			pessoas[proxima] = p;
			proxima++;
			
		}
		
	}
	
	public void cadastrar(String name, String country, LocalDate birthDate){
		
			Person p = new Person(name, country, birthDate);
			cadastrar(p);
		
	}
	
	public Person procurar(long num){
		
		for(Person ps : pessoas){
			if(ps.getId() == num){
				return ps;
			}
		}
		return null;
	}
	
	public void remover(Person p){
		
		for(int i=0; i<1000; i++){
			if(pessoas[i].getId() == p.getId()){
				pessoas[i] = null;
			}
		}
		
	}
	
	public void atualizar(Person p){
		
		for(int i=0; i<1000; i++){
			if(pessoas[i].getId() == p.getId()){
				pessoas[i] = p;
			}
		}
		
	}
	
}
