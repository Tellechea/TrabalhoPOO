package br.ifrn.tads.poo.biblioteca.acervo;

import java.util.Date;

public class Apostila extends ItemAcervo {
	
	private String titulo, autor;

	public Apostila(int custo, String cod,String tit,String aut){
        super (custo, cod);
        titulo = tit;
        autor = aut;
        
        
    }
	
}
