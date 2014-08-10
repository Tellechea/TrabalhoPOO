package br.ifrn.tads.poo.biblioteca.app;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

import br.ifrn.tads.poo.biblioteca.acervo.Apostila;
import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;
import br.ifrn.tads.poo.biblioteca.acervo.Livro;
import br.ifrn.tads.poo.biblioteca.acervo.Texto;
import br.ifrn.tads.poo.biblioteca.usuario.Administrador;
import br.ifrn.tads.poo.biblioteca.usuario.Usuario;


public class Biblioteca {
	
	String nomeBiblioteca;
	private ArrayList<ItemAcervo> itens = new ArrayList<ItemAcervo>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	Biblioteca(){
		
	}
	
	Usuario criarUsuario (String nome,String endereco,String cpf){
		
		return new Usuario(nome, endereco, cpf );
		
	}

	Administrador criarAdministrador (String nome, String endereco, String cpf){
		
		return new Administrador(nome, endereco, cpf);
	}
	
	public void setUsuario(Usuario u){
		usuarios.add(u);
	}
	
	public void setItemAcervo(ItemAcervo ia) {
		itens.add(ia);
	}
	
	
	double calcularValorMultas(Date dataDevolucao) throws DataInvalidaException{
		
		Date dataDoDia = new Date(System.currentTimeMillis());
		
		dataDoDia.compareTo(dataDevolucao);
		
		// converter a diferença de dias para int e multiplicar por 2 (multa de 2 reais por dia de atraso);
		// }
		//
		
		//http://joda-time.sourceforge.net/apidocs/org/joda/time/Days.html#daysBetween(org.joda.time.ReadableInstant, org.joda.time.ReadableInstant)

		// EXCEPTION (dataDoDia.before(dataDevolucao) == true) {
		//System.out.println("Item devolvido na data correta");
		//}
		
		
		return 0;
		
	}
	
}
