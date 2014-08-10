package br.ifrn.tads.poo.biblioteca.app;

import java.util.Date;
import java.util.Scanner;

import br.ifrn.tads.poo.biblioteca.acervo.Apostila;
import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;
import br.ifrn.tads.poo.biblioteca.acervo.Livro;
import br.ifrn.tads.poo.biblioteca.acervo.Texto;


public class SistemaBiblioteca {	
	
	public static void main(String[] args) {
		
		Biblioteca bib = new Biblioteca();
		Date dataDoDia = new Date();
		Date dataDevolucao = new Date(2014, 8 ,14);
		
		System.out.println(dataDoDia.compareTo(dataDevolucao));
		

	}

}
