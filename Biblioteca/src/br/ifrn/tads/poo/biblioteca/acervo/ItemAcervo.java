package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.Date;
import br.ifrn.tads.poo.biblioteca.usuario.Usuario;
import java.time.Clock;


public class ItemAcervo {
	
	protected double custo;
	protected Date dataAluguel , dataDevolucao;
	protected String codigoitem;
	protected boolean pago;
	
	public ItemAcervo(){
	}
        
        ItemAcervo(int a, Date b, String c){
            custo = a;
            dataAluguel = b;
            codigoitem = c;
            
        }
        
        ItemAcervo(int a, Date b, String c, boolean d){
            custo = a;
            dataAluguel = b;
            codigoitem = c;
            pago = d;
            
        }
	
	
	void alugar(){
           
	}
	
	double devolver(){
              
		return custo;
		
	}
	
	boolean estaPago(){
            this.pago = true;
		return pago;
		
	}
	
	void reservar(Usuario u ){
		
	}
	
	
	
}
