
import java.util.Date;
import java.util.Scanner;

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
	
	ItemAcervo criarItem(int tipo,int a,Date b,String c){
		Scanner input = new Scanner(System.in);
		if (tipo == 1){
			String tit = input.nextLine();
			String aut = input.nextLine();
			String ISBN = input.nextLine();
			int edic = input.nextInt();
			
			input.close();
			return new Livro(a, b, c, tit, aut, ISBN, edic);
		}
		if (tipo == 2){
			String tit = input.nextLine();
			String aut = input.nextLine();
			
			input.close();
			return new Apostila(a, b, c, tit, aut);
		}
		if (tipo == 3){
			String aut = input.nextLine();
			
			input.close();
			return new Texto(a, b, c, aut);
		}
		else {
			System.out.println("Tipo inserido e invalido, favor digitar \n");
			System.out.println("1- Para Livro \n");
			System.out.println("2- Para Apostila \n");
			System.out.println("3- Para Texto \n");
			
			input.close();
			return null;
		}
		
	}
	
	
	double calcularValorMultas(Date dia){
		return 0;
		
	}
	
}
