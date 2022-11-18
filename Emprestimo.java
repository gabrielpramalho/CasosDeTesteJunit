package biblioteca;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Emprestimo {
	
	Date dataEmprestimo = new Date();
	/*metodo para gegar a variavel dataEmprestimo*/
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	/*metodo para setar a variavel dataEmprestimo*/
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	/*utilize essas váriaveis para calcular a data final de devolução*/
	
    Date dataPrevista = new Date();
	Date data_aux = new Date();
	String nome;

        /*Cada Emprestimo é composto de vários itens*/
	List<Item> i = new ArrayList<Item>();
	
        //Metodo responsável por calcular a data de devolução
	public String CalculaDataDevolucao()
	{   
		Date date = new Date();
		/*Você precisa implementar as regras do cálculo da devolução dentro deste método*/

                /*Não esqueça de chamar o método para calcular a data de devolução de cada item*/
		
		int tamanho = i.size();
		
		
		Date maior = data_aux;
		
		for(int j=0; j < i.size(); j++) {
			Date dt = i.get(j).calculaDataDevolucao(date);
			
			if(dt.compareTo(maior) == 1) {
				maior = dt;
			}
		
		}
		
		Calendar calendar = Calendar.getInstance();
		
		if(tamanho > 2) {
			int dias = (tamanho - 2) * 2;
			
			
		 	
			calendar.setTime(maior);
	        /*precisa acessar o método de livro que retorna o prazo*/
			calendar.add(Calendar.DATE, dias);
			dataPrevista = calendar.getTime();
		}else {
			dataPrevista = maior;
		}	
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
		String dataPrevistaStr = format1.format(dataPrevista);
		
		return dataPrevistaStr;
	}

}
