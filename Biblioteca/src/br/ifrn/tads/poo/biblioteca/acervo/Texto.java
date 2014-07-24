package br.ifrn.tads.poo.biblioteca.acervo;

import java.util.Date;

public class Texto extends ItemAcervo {
	
	private String autor;

	public Texto(int a, Date b, String c, String aut){
        super (a, b, c);
        autor = aut;
    }
	
}
