package tests;

import org.junit.Assert;
import org.junit.Test;

import javamm.Serpentina;

public class SerpentinaRidottaTest {

	@Test
	public void test4() {
		
		int[][] M = {{1,2,3,4,5,6,7},
			   	     {8,9,10,11,12,13,14},
				     {15,16,17,18,19,20,21},
				     {22,23,24,25,26,27,28}};
		
		int[] serpentina = {1,9,17,25,19,13,7};
		
		Assert.assertArrayEquals(Serpentina.visitaSerpentina(M),serpentina);
	}
	
	@Test
	public void test5() {
		
		int[][] M = {{1,2,3,4,5},
			   	     {6,7,8,9,10},
				     {11,12,13,14,15}};
		
		int[] serpentina = {1,7,13,9,5};
		
		Assert.assertArrayEquals(Serpentina.visitaSerpentina(M),serpentina);
	}
	
	@Test
	public void test6() {
		
		int[][] M = {{1,2,3},
			   	     {4,5,6}};
		
		int[] serpentina = {1,5,3};
		
		Assert.assertArrayEquals(Serpentina.visitaSerpentina(M),serpentina);
	}
	
	@Test
	public void test9() {
		
		int[][] M = {{1,2,3,4,5,6,7,8,9},
			   	     {10,11,12,13,14,15,16,17,18},
				     {19,20,21,22,23,24,25,26,27},
				     {28,29,30,31,32,33,34,35,36},
				     {37,38,39,40,41,42,43,44,45}};
		
		int[] serpentina = {1,11,21,31,41,33,25,17,9};
		
		Assert.assertArrayEquals(Serpentina.visitaSerpentina(M),serpentina);
	}


	
}
