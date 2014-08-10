package br.ifrn.tads.poo.biblioteca.acervo;

import java.util.Date;

public class Livro extends ItemAcervo {
	
	private String titulo, autor, ISBN;
	private Integer edicao; 

	public Livro(int custo, String cod, String tit, String aut, String ISBN, int edic){
        super (custo, cod);
        titulo = tit;
        autor = aut;
        this.ISBN = ISBN;
        edicao = edic;
        
        
    }

}
