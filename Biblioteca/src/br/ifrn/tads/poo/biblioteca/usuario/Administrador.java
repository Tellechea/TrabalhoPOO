package br.ifrn.tads.poo.biblioteca.usuario;


public class Administrador extends Usuario {
	
	public static int admCont = 1;

	public Administrador(String a, String b, String c){
		
		super (a, b, c);
		codUsuario = admCont;
		admCont ++;
		
	}
	
}
