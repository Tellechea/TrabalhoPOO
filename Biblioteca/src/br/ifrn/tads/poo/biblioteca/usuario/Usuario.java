package br.ifrn.tads.poo.biblioteca.usuario;
import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;


public class Usuario {
	
	int codUsuario;
	public static int  cont = 1;
	String nome, endereco, cpf;
	
	Usuario (){
		
	}
	
	public Usuario (String a, String b, String c){
		this.nome = a;
		this.endereco = b;
		this.cpf = c;
		
		cont ++;
		codUsuario = cont;
			
	}
	
	void pagar(){
		
	}
	
	ItemAcervo escolheritemAcervo(){
		
		
		return null;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
