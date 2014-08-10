package br.ifrn.tads.poo.biblioteca.app;



import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

import br.ifrn.tads.poo.biblioteca.acervo.Apostila;
import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;
import br.ifrn.tads.poo.biblioteca.acervo.Livro;
import br.ifrn.tads.poo.biblioteca.acervo.Texto;
import br.ifrn.tads.poo.biblioteca.exceptions.DataInvalidaException;
import br.ifrn.tads.poo.biblioteca.usuario.Administrador;
import br.ifrn.tads.poo.biblioteca.usuario.Usuario;
import br.ifrn.tads.poo.biblioteca.exceptions.*;


public class Biblioteca {
	
	String nomeBiblioteca;
	private ArrayList<ItemAcervo> itens = new ArrayList<ItemAcervo>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	Biblioteca(){
		
	}
	
   void cadastrarLivro (int custo, String cod, String tit, String aut, String ISBN, int edic){
		ItemAcervo ial = new Livro(custo, cod, tit, aut, ISBN, edic);
		itens.add(ial);
		
	}
   
   void cadastrarLivro (Livro l){
		itens.add(l);
		
	}
   void cadastrarTexto(int custo,String cod,String aut){
	   ItemAcervo iat = new Texto(custo, cod, aut);
	   itens.add(iat);
	   
   }
   void cadastrarApostila(int custo, String cod, String tit, String aut){
	   ItemAcervo iaa = new Apostila(custo, cod, tit, aut);
	   itens.add(iaa);
	   
   }
	
	void cadastrarUsuario (String nome,String endereco,String cpf){
		
		Usuario u = new Usuario(nome, endereco, cpf );
		usuarios.add(u);
		
	}

	void cadastrarAdministrador (String nome, String endereco, String cpf){
		
		Usuario u = new Administrador(nome, endereco, cpf);
		usuarios.add(u);
	}

	
	public void setItemAcervo(ItemAcervo ia) {
		itens.add(ia);
	}
	
	
	double calcularValorMultas(Date dataDevolucao) throws DataInvalidaException{
		
		Date dataDoDia = new Date(); 
		int j = -1;
		int multa = j * 2;
		
		// converter a diferença de dias para int e multiplicar por 2 (multa de 2 reais por dia de atraso);

		
		if ( dataDoDia.compareTo(dataDevolucao) == -1 ) {
			
			Date dataTeste = new Date();
			
			for (int i = 0 ; i == j ; i++ ){
				
				Calendar calendar= Calendar.getInstance();
				calendar.setTime(dataDoDia);
				calendar.add(Calendar.DAY_OF_MONTH, i);
				dataTeste = calendar.getTime();
				
				
				if ( dataTeste.compareTo(dataDevolucao)	== 0){
					j = i;
				}
			}
			return multa;
		}
		
		
		
		if ( dataDoDia.compareTo(dataDevolucao) >= 0 ){
			
			throw new DataInvalidaException();
		
		}
		
		
		return 0;
		
	}
	
}
