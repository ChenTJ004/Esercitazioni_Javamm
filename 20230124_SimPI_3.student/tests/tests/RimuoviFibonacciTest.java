package tests;

import org.junit.Assert;

import org.junit.Test;

import javamm.RimuoviFibonacciDaIntero;

public class RimuoviFibonacciTest {

	@Test
	public void test1() {
		
		int n = 123;
		int ris = 123;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test2() {
		
		int n = 321;
		int ris = 0;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test3() {
		
		int n = 321321321;
		int ris = 0;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test4() {
		
		int n = 211232102;
		int ris = 202;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test5() {
		
		int n = 232102725;
		int ris = 202;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test6() {
		
		int n = 532202725;
		int ris = 0;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test7() {
		
		int n = 0;
		int ris = 0;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test8() {
		
		int n = 21;
		int ris = 21;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test9() {
		
		int n = 9618;
		int ris = 9618;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test10() {
		
		int n = 11196181;
		int ris = 11196181;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
		
	@Test
	public void test11() {
		
		int n = 21196181;
		int ris = 96181;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test12() {
		
		int n = 11176181;
		int ris = 11181;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test13() {
		
		int n = 21196981;
		int ris = 96;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
		
	@Test
	public void test14() {
		
		int n = 211963817;
		int ris = 0;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test15() {
		
		int n = 29211181;
		int ris = 29181;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test16() {
		
		int n = 292111810;
		int ris = 291810;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test17() {
		
		int n = 192111810;
		int ris = 191810;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test18() {
		
		int n = 2110211;
		int ris = 2;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test19() {
		
		int n = 21100211;
		int ris = 20;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test20() {
		
		int n = 21100;
		int ris = 20;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test21() {
		
		int n = 2110000000;
		int ris = 2;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
	
	@Test
	public void test22() {
		
		int n = 51400211;
		int ris = 0;
		Assert.assertEquals(RimuoviFibonacciDaIntero.rimuoviFibonacci(n),ris);
	}
}