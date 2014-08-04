package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.Calendar;
import java.util.Date;
import br.ifrn.tads.poo.biblioteca.usuario.Usuario;

import java.text.SimpleDateFormat;
//import java.time.Clock;


public class ItemAcervo {
	
	protected double custo;
	protected Date dataAluguel , dataDevolucao;
	protected String codigoitem;
	protected boolean pago , reservado;
	
	public ItemAcervo(){
	}
        
        ItemAcervo(int custo, String cod){
            this.custo = custo;
            codigoitem = cod;
            
        }
        
        ItemAcervo(int custo, String cod, boolean pago){
            this.custo = custo;
            codigoitem = cod;
            this.pago = pago;
            
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
		// se dataDoDia > dataDevolucao && pago == false{
		// }
		// se dataDoDia > dataDevolucao && pago == true{
		// }
		
              
		return custo;
		
	}
	
	boolean estaPago(){
            this.pago = true;
		return pago;
		
	}
	
	void reservar(Usuario u ){
		this.reservado = true;
		
		
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	
}
