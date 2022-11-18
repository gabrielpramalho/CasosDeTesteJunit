package biblioteca;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		Date dt = new Date();
		
		Emprestimo e = new Emprestimo();

		Livro l1 = new Livro(1);
		
//		Livro l2 = new Livro(2);
//		
//		Livro l3 = new Livro(3); 
//		
//		Livro l4 = new Livro(2); 
//		
		Item i1 = new Item(l1);
//		Item i2 = new Item(l2);
//		Item i3 = new Item(l3);
//		Item i4 = new Item(l4);
//		
//		
		e.i.add(i1);
//		e.i.add(i2);
//		e.i.add(i3);
//		e.i.add(i4);


		System.out.println("Data de Empréstimo: " + e.getDataEmprestimo());
		System.out.println("\nData de Devolução: " + e.CalculaDataDevolucao());
		
		
//	
//		
//		Date d2 = i3.calculaDataDevolucao(dt);
//		
//		
//		
//		System.out.println(dt.compareTo(d2));

	}

}
