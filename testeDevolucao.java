package biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class testeDevolucao {

	@Test
	public void testDevolucao() {
		
		Date dt = new Date();
		
		Emprestimo e = new Emprestimo();

		Livro l1 = new Livro(1);
		Item i1 = new Item(l1);
		e.i.add(i1);
		
		assertEquals("20-11-2022", e.CalculaDataDevolucao());
		
		fail("Not yet implemented");
	}

}
