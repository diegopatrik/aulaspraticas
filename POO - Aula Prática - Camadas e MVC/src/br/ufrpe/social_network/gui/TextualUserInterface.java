package br.ufrpe.social_network.gui;

import java.time.LocalDate;

import br.ufrpe.social_network.dao.PersonDAO;
import br.ufrpe.social_network.negocio.Fachada;
import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;

public class TextualUserInterface {
    
    public void showUserInterface() {
        // TODO implementar código que usa a Fachada. Detalhamento:
        
        /*
         * 
     
        
        1.  Crie quatro pessoas e salve-as
        2.  Apague uma das pessoas
        3.  Atualize o nome de uma das pessoas
        4.  Busque por um objeto do tipo pessoa que tenha um ID qualquer.
        5.  Crie 15 posts aleatórios, 5 para cada uma das pessoas criadas anteriormente
        6.  Crie 2 comentários de resposta de uma das pessoas em cada um dos posts de outra pessoa
        7.  Liste todos os posts de todas as pessoas
        8.  (DESAFIO) Liste somente os comentários que cada uma das pessoas fez em outros posts de outras pessoas

        */
    	
    	Fachada redesocial = Fachada.getInstance();
    	
    	LocalDate ln = LocalDate.of(2017,06,16);
    	
    	Person p = new Person("Tamires","Brasil",ln);
    	Person p2 = new Person("Tarcisio","Portugal",LocalDate.of(1990, 12, 12));

    	redesocial.salvaPessoa(p);
    	redesocial.salvaPessoa(p2);
    	redesocial.salvaPessoa(new Person("Lucas","EUA",LocalDate.of(1997, 02, 15)));
    	redesocial.salvaPessoa(new Person("Arthur","Brasil",LocalDate.of(2016, 06, 16)));
    	
    	redesocial.apagarPessoa(p);
    	
    	p2 = new Person("Tarcisio","Portugal",LocalDate.of(1998, 07, 12));
    	
    	redesocial.atualizaPessoa(p2);
    	
    	long t = 3L;
    	redesocial.procurarPessoa(t);
    	
    	Post tst = new Post("Oi zap", p2);
    	Post b = new Post("Bom dia", p2);
    	Post c = new Post("Fora Temer", p2);
    	Post d = new Post("Tchau", p2);
    	Post e = new Post("Oi face", p2);
    	redesocial.postar(tst);
    	redesocial.postar(b);
    	redesocial.postar(c);
    	redesocial.postar(d);
    	redesocial.postar(e);
    	
    	redesocial.apagarPost(e);
    	
    	tst.addComment(new Post("Ola rs", p2));
    	
    	// *listarposts
    	redesocial.listarPessoas(p2);
    	
        
    }

}
