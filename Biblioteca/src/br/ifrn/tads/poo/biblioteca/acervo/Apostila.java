package br.ifrn.tads.poo.biblioteca.acervo;

import java.util.Date;

public class Apostila extends ItemAcervo {
	
	private String titulo, autor;

	public Apostila(int a, Date b, String c,String tit,String aut){
        super (a, b, c);
        titulo = tit;
        autor = aut;
        
        
    }
	
}
