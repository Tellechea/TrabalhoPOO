package br.ifrn.tads.poo.biblioteca.acervo;
import br.ifrn.tads.poo.biblioteca.usuario.Usuario;

public class Aluga {
    private boolean alugado;
    
    Aluga(){
        alugado = true;
    }
    
    public boolean getAlugado(){
        return alugado;
    }
    
}
