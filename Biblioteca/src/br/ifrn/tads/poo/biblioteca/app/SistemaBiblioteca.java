package br.ifrn.tads.poo.biblioteca.app;

import java.util.Date;
import java.util.Scanner;

import br.ifrn.tads.poo.biblioteca.acervo.Apostila;
import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;
import br.ifrn.tads.poo.biblioteca.acervo.Livro;
import br.ifrn.tads.poo.biblioteca.acervo.Texto;


public class SistemaBiblioteca {

	static ItemAcervo criarItem(int tipo,int a,String c){
		Scanner input = new Scanner(System.in);
		
		// Passar a parte interativa pro main
		
		if (tipo == 1){
			System.out.println("Livro selecionado. \n");
			System.out.println(" Digite o titulo \n");
			String tit = input.nextLine();
			System.out.println(" Digite o nome do autor \n");
			String aut = input.nextLine();
			System.out.println(" Digite o codigo ISBN \n");
			String ISBN = input.nextLine();
			System.out.println(" Digite a edicao \n");
			int edic = input.nextInt();
			
			input.close();
			return new Livro(a, c, tit, aut, ISBN, edic);
		}
		if (tipo == 2){
			String tit = input.nextLine();
			String aut = input.nextLine();
			
			input.close();
			return new Apostila(a, c, tit, aut);
		}
		if (tipo == 3){
			String aut = input.nextLine();
			
			input.close();
			return new Texto(a, c, aut);
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
	
	public static void main(String[] args) {
		// Biblioteca bib = new Biblioteca();
		
	//	bib.setItemAcervo(criarItem(1,3,"Livro Tal" ));
		
		Date dataDoDia = new Date(System.currentTimeMillis());
		Date dataDevolucao = new Date(2014, 8 ,14);
		
		System.out.println();

	}

}
