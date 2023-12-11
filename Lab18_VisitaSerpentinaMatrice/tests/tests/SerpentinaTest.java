package tests;

import org.junit.Assert;
import org.junit.Test;

import javamm.Serpentina;


public class SerpentinaTest {

	@Test
	public void test1() {
		
		int[][] M = {{1,2,3,4,5,6,7,8},
			   	     {9,10,11,12,13,14,15,16},
				     {17,18,19,20,21,22,23,24},
				     {25,26,27,28,29,30,31,32}};
		
		int[] serpentina = {1,10,19,28,21,14,7,16};
		
		Assert.assertArrayEquals(Serpentina.visitaSerpentina(M),serpentina);
	}
	
	@Test
	public void test2() {
		
		int[][] M = {{1,2,3},
			   	     {4,5,6},
				     {7,8,9},
				     {10,11,12},
				     {13,14,15}};
		
		int[] serpentina = {1,5,9};
		
		Assert.assertArrayEquals(Serpentina.visitaSerpentina(M),serpentina);
	}
	
	@Test
	public void test3() {
		
		int[][] M = {{1,2,3,4,5,6,7},
			   	     {8,9,10,11,12,13,14}};
		
		int[] serpentina = {1,9,3,11,5,13,7};
		
		Assert.assertArrayEquals(Serpentina.visitaSerpentina(M),serpentina);
	}
	
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
	public void test7() {
		
		int[][] M = {{1},
				     {2},
				     {3}};
		
		int[] serpentina = {1};
		
		Assert.assertArrayEquals(Serpentina.visitaSerpentina(M),serpentina);
	}
	
	@Test
	public void test8() {
		
		int[][] M = {{1,2,3},
				     {4,5,6},
				     {7,8,9}};
		
		int[] serpentina = {1,5,9};
		
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
	
	@Test
	public void test10() {
		
		int[][] M = {{1,2,3,4,5,6,7,8,9,46,47,48,61},
			   	     {10,11,12,13,14,15,16,17,18,49,50,51,62},
				     {19,20,21,22,23,24,25,26,27,52,53,54,63},
				     {28,29,30,31,32,33,34,35,36,55,56,57,64},
				     {37,38,39,40,41,42,43,44,45,58,59,60,65}};
		
		int[] serpentina = {1,11,21,31,41,33,25,17,9,49,53,57,65};
		
		Assert.assertArrayEquals(Serpentina.visitaSerpentina(M),serpentina);
	}

	
	
}
