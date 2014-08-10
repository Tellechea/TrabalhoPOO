package br.ifrn.tads.poo.biblioteca.acervo;

import java.util.Date;

public class Texto extends ItemAcervo {
	
	private String autor;

	public Texto(int custo, String cod, String aut){
        super (custo, cod);
        autor = aut;
    }
	
}
