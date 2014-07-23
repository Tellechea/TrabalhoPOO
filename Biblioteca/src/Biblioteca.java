
import java.util.Date;

import br.ifrn.tads.poo.biblioteca.acervo.Apostila;
import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;
import br.ifrn.tads.poo.biblioteca.acervo.Livro;
import br.ifrn.tads.poo.biblioteca.acervo.Texto;
import br.ifrn.tads.poo.biblioteca.usuario.Administrador;
import br.ifrn.tads.poo.biblioteca.usuario.Usuario;


public class Biblioteca {
	
	String nomeBiblioteca;
	
	Biblioteca(){
		
	}
	
	Usuario criarUsuario (String nome,String endereco,String cpf){
		
		return new Usuario(nome, endereco, cpf );
	}

	Administrador criarAdministrador (String nome, String endereco, String cpf){
		
		return new Administrador(nome, endereco, cpf);
	}
	
	ItemAcervo criarItem(int tipo){
		
		if (tipo == 1){
			return new Livro();
		}
		if (tipo == 2){
			return new Apostila();
		}
		if (tipo == 3){
			return new Texto();
		}
		else {
			System.out.println("Tipo inserido e invalido, favor digitar \n");
			System.out.println("1- Para Livro \n");
			System.out.println("2- Para Apostila \n");
			System.out.println("3- Para Texto \n");
			
			return null;
		}
		
	}
	
	
	double calcularValorMultas(Date dia){
		return 0;
		
	}
	
}
