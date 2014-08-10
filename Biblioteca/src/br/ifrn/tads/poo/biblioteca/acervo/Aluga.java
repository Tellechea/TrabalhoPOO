package br.ifrn.tads.poo.biblioteca.acervo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.ifrn.tads.poo.biblioteca.usuario.Usuario;

public class Aluga {
    private boolean alugado;
    Date dataAluguel , dataDevolucao;
    
    Aluga(){
    	
    	Date data1 = new Date();
		
		SimpleDateFormat formatDataAl = new SimpleDateFormat("yyyy-MM-dd");
		dataAluguel = data1;
		
		Calendar calendar= Calendar.getInstance();
		calendar.setTime(data1);
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		Date data2 = calendar.getTime();
		SimpleDateFormat formatDataDev = new SimpleDateFormat("yyyy-MM-dd");
		dataDevolucao = data2;
    	
    	
        alugado = true;
    }
    
    public boolean getAlugado(){
        return alugado;
    }
    
}
