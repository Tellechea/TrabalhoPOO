package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.Date;
import br.ifrn.tads.poo.biblioteca.usuario.Usuario;
import java.time.Clock;


public class itemAcervo {
	
	protected double custo;
	protected Date dataAluguel , dataDevolucao;
	protected String codigoitem;
	protected boolean pago;
        protected int quantidade;
        Aluga aluguel[] = new Aluga[2];
        private int qnt = 0;
	
	itemAcervo(){
	}
        
        itemAcervo(int a, Date b, String c){
            custo = a;
            dataAluguel = b;
            codigoitem = c;
            pago = false;
            
        }
        
        itemAcervo(int a, Date b, String c, boolean d){
            custo = a;
            dataAluguel = b;
            codigoitem = c;
            pago = d;
            
        }
	
	
	void alugar(){
            if (pago == true){
               if(quantidade >= 1){
                quantidade -= 1;
                Aluga aluguel = new Aluga();
               }
               else{
                  System.out.println("Sem unidades no acervo.");
               }
            }     
            else{
                System.out.println("Há um débito anterior nesse registro, aluguel não autorizado.");
            }
	}
	
	double devolver(){
            if ( aluguel[].getAlugado() == true ){
                
            }
            
		return custo;
		
	}
	
	boolean estaPago(){
            this.pago = true;
		return pago;
		
	}
	
	void reservar(Usuario u ){
		
	}
	
	
	
}
