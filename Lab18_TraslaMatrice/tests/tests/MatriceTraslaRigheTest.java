package tests;

import org.junit.Assert;
import org.junit.Test;

import javamm.TraslaMatrice;

import javamm.OccorrenzeSolution;

public class MatriceTraslaRigheTest {

	@Test
	public void test1() {
		
		int[][] M = {{1,2,3,4,5,6,7},
			   	     {8,9,10,11,12,13,14},
				     {15,16,17,18,19,20,21}};
		
		int[][] R = {{7,1,2,3,4,5,6},
		   	     	 {9,10,11,12,13,14,8},
			         {21,15,16,17,18,19,20}};
		
		Assert.assertEquals(TraslaMatrice.scorrimentoRighe(M),R);
	}
	
	@Test
	public void test2() {
		
		int[][] M = {{1,2,3,4,5,6,7},
			   	     {8,9,10,11,12,13,14}};
		
		int[][] R = {{7,1,2,3,4,5,6},
		   	     	 {9,10,11,12,13,14,8}};
		
		Assert.assertEquals(TraslaMatrice.scorrimentoRighe(M),R);
	}
	
	@Test
	public void test3() {
		
		int[][] M = {{1,2,3,4,5,6,7}};
		
		int[][] R = {{7,1,2,3,4,5,6}};
		
		Assert.assertEquals(TraslaMatrice.scorrimentoRighe(M),R);
	}
	
	@Test
	public void test4() {
		
		int[][] M = {{1,2}};
		
		int[][] R = {{2,1}};
		
		Assert.assertEquals(TraslaMatrice.scorrimentoRighe(M),R);
	}
	
	@Test
	public void test5() {
		
		int[][] M = {{1}};
		
		int[][] R = {{1}};
		
		Assert.assertEquals(TraslaMatrice.scorrimentoRighe(M),R);
	}
	
	@Test
	public void test6() {
		
		int[][] M = {{1,2,3,4,5,6,7},
			   	     {8,9,10,11,12,13,14},
				     {15,16,17,18,19,20,21},
			   	     {22,23,24,25,26,27,28}};
		
		int[][] R = {{7,1,2,3,4,5,6},
		   	     	 {9,10,11,12,13,14,8},
			         {21,15,16,17,18,19,20},
			         {23,24,25,26,27,28,22}};
		
		Assert.assertEquals(TraslaMatrice.scorrimentoRighe(M),R);
	}
	
	@Test
	public void test7() {
		
		int[][] M = {{1},
			   	     {2},
				     {3},
			   	     {4},
			   	     {5}};
		
		int[][] R = {{1},
			   	     {2},
				     {3},
			   	     {4},
			   	     {5}};
			
		Assert.assertEquals(TraslaMatrice.scorrimentoRighe(M),R);
	}
	
	
}
