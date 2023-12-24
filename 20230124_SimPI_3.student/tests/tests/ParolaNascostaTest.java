package tests;

import org.junit.Assert;

import org.junit.Test;

import javamm.ParolaNascosta;

public class ParolaNascostaTest {

	@Test
	public void test1() {
		
		char[][] testo = {{'B','B','A'},{'U','T','T'},{'A','B','T'}};
		char[] parolaNascosta = {'B','T'};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test2() {
		
		char[][] testo = {{'A','B','D'},{'U','T','B'},{'A','B','T'}};
		char[] parolaNascosta = {' '};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}

	@Test
	public void test3() {
		
		char[][] testo = {{'A','B','D','U','T','B','A','B','A'}};
		char[] parolaNascosta = {'A'};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test4() {
		
		char[][] testo = {{'A','A','A','A','A','A','A','A','A'}};
		char[] parolaNascosta = {'A'};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test5() {
		
		char[][] testo = {{'B','B','D','U','T','A','A','A','A'}};
		char[] parolaNascosta = {'A'};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test6() {
		
		char[][] testo = {{'X'}};
		char[] parolaNascosta = {' '};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}

	@Test
	public void test7() {
		
		char[][] testo = {{'A'},
						  {'B'},
						  {'C'},
						  {'C'},
						  {'B'},
						  {'A'}};
		char[] parolaNascosta = {' '};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}

	@Test
	public void test8() {
		
		char[][] testo = {{'A'},
						  {'A'},
						  {'C'},
						  {'C'},
						  {'B'},
						  {'C'}};
		char[] parolaNascosta = {' '};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test9() {
		
		char[][] testo = {{'A'},
						  {'B'},
						  {'C'},
						  {'D'},
						  {'E'},
						  {'F'}};
		char[] parolaNascosta = {' '};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test10() {
		
		char[][] testo = {{'A'},
						  {'A'},
						  {'A'},
						  {'A'},
						  {'A'},
						  {'A'}};
		char[] parolaNascosta = {' '};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test11() {
		
		char[][] testo = {{'A','B','C','D','E'},
						  {'A','B','C','D','E'},
						  {'A','B','C','D','E'},
						  {'A','B','C','D','E'},
						  {'A','B','C','D','E'},
						  {'A','B','C','D','E'}};
		char[] parolaNascosta = {' '};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test12() {
		
		char[][] testo = {{'A','B','B','D','E'},
						  {'A','B','C','D','A'},
						  {'D','B','C','D','D'},
						  {'A','B','C','D','E'},
						  {'A','B','C','D','E'},
						  {'A','B','C','D','E'}};
		char[] parolaNascosta = {'B','A','D'};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}

	@Test
	public void test13() {
		
		char[][] testo = {{'A','B','B','D','E'},
						  {'A','B','C','D','A'},
						  {'D','B','C','D','D'},
						  {'G','G','G','G','G'},
						  {'A','B','U','D','U'},
						  {'Y','B','C','D','Y'}};
		char[] parolaNascosta = {'B','A','D','G','U','Y'};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test14() {
		
		char[][] testo = {{'C','U','C','C','I','A'},
						  {'M','E','G','L','I','O'},
						  {'P','A','T','A','T','E'}};
		char[] parolaNascosta = {'C','A'};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	@Test
	public void test15() {
		
		char[][] testo = {{'A','B','C','D','E','F'},
						  {'C','U','C','C','I','A'},
						  {'A','B','C','D','E','F'},
						  {'M','E','G','L','I','O'},
						  {'A','B','C','D','E','F'},
						  {'P','A','T','A','T','E'},
						  {'A','B','C','D','E','F'}};
		char[] parolaNascosta = {'C','A'};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}

	@Test
	public void test16() {
		
		char[][] testo = {{'A','B','B'},
						  {'R','R','C'},
						  {'A','A','A'},
						  {'G','V','V'},
						  {'A','B','U'},
						  {'I','I','I'}};
		char[] parolaNascosta = {'B','R','A','V','I'};
		Assert.assertArrayEquals(ParolaNascosta.cercaParolaNascosta(testo),parolaNascosta);
	}
	
	
	
}