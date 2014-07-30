package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.Calendar;
import java.util.Date;
import br.ifrn.tads.poo.biblioteca.usuario.Usuario;

import java.text.SimpleDateFormat;
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
		
		
		Date data1 = new Date();
		
		SimpleDateFormat formatDataAl = new SimpleDateFormat("yyyy-MM-dd");
		dataAluguel = data1;
		
		Calendar calendar= Calendar.getInstance();
		calendar.setTime(data1);
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		Date data2 = calendar.getTime();
		SimpleDateFormat formatDataDev = new SimpleDateFormat("yyyy-MM-dd");
		dataDevolucao = data2;
		
           
	}
	
	double devolver(){
		
		// se dataDoDia <= dataDevolucao && pago == true {
		// }
		// se dataDoDia <= dataDevolucao && pago == false{
		// }
		// se dataDoDia >= dataDevolucao && pago == false{
		// }
		// se dataDoDia >= dataDevolucao && pago == true{
		// }
		
              
		return custo;
		
	}
	
	boolean estaPago(){
            this.pago = true;
		return pago;
		
	}
	
	void reservar(Usuario u ){
		
	}
	
	
	
}
