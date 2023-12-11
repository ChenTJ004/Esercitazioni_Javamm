package tests;

import org.junit.Assert;
import org.junit.Test;

import javamm.Intero;

@SuppressWarnings("deprecation")

public class InteroBilanciatoTest {

	@Test
	public void test1() {
		
		int n=2334;
		boolean ris = true;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}
	
	@Test
	public void test2() {
		
		int n=223344;
		boolean ris = true;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}
	
	@Test
	public void test3() {
		
		int n=44;
		boolean ris = true;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}

	@Test
	public void test4() {
		
		int n=43;
		boolean ris = false;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}
	
	@Test
	public void test5() {
		
		int n=6330;
		boolean ris = true;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}
	
	@Test
	public void test6() {
		
		int n=3031;
		boolean ris = false;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}
	
	@Test
	public void test7() {
		
		int n=111222;
		boolean ris = true;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}
	
	@Test
	public void test8() {
		
		int n=101242;
		boolean ris = false;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}

	@Test
	public void test9() {
		
		int n=11231233;
		boolean ris = true;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}

	@Test
	public void test10() {
		
		int n=41231231;
		boolean ris = false;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}
	
	@Test
	public void test11() {
		
		int n=41134123;
		boolean ris = false;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}
	
	@Test
	public void test12() {
		
		int n=31332353;
		boolean ris = false;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}

	@Test
	public void test13() {
		
		int n=4220;
		boolean ris = true;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}

	@Test
	public void test14() {
		
		int n=14240203;
		boolean ris = true;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}
	
	@Test
	public void test15() {
		
		int n=14242031;
		boolean ris = false;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}

	@Test
	public void test16() {
		
		int n=14240213;
		boolean ris = false;
		
		Assert.assertEquals(Intero.bilanciato(n),ris);
	}

}