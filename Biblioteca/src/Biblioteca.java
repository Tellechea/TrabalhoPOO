
import java.util.Date;

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
	
	double calcularValorMultas(Date dia){
		return 0;
		
	}
	
}
