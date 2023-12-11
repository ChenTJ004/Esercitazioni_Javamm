package tests;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertArrayEquals;

//import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import javamm.VisitaSerpentina;

public class VisitaSerpentinaStandardTest {

	@Test
	public void test1() {
		
		int[][] M = {{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}};
		int[] ris = {12,3,2,1,4,5,6,9,8,7,10,11};
		int riga=3, colonna=2;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test2() {
		
		int[][] M = {{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}};
		int[] ris = {10,11,12,3,2,1,4,5,6,9,8,7};
		int riga=3, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test3() {
		
		int[][] M = {{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}};
		int[] ris = {3,6,5,4,7,8,9,12,11,10,1,2};
		int riga=0, colonna=2;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test4() {
		
		int[][] M = {{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}};
		int[] ris = {8,9,12,11,10,1,2,3,6,5,4,7};
		int riga=2, colonna=1;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test5() {
		
		int[][] M = {{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}};
		int[] ris = {1,2,3,6,5,4,7,8,9,12,11,10};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test6() {
		
		int[][] M = {{1},
					{4}};
		int[] ris = {1,4};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test7() {
		
		int[][] M = {{1,2,3,4},
					{5,6,7,8}};
		int[] ris = {1,2,3,4,8,7,6,5};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test8() {
		
		int[][] M = {{1,2,3,4},
					{5,6,7,8}};
		int[] ris = {7,8,4,3,2,1,5,6};
		int riga=1, colonna=2;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test9() {
		
		int[][] M = {{1},
					{4}};
		int[] ris = {4,1};
		int riga=1, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test10() {
		
		int[][] M = {{1},
					{2},
					{3},
					{4},
					{5},
					{6}};
		int[] ris = {1,2,3,4,5,6};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test11() {
		
		int[][] M = {{1},
					{2},
					{3},
					{4},
					{5},
					{6}};
		int[] ris = {3,4,5,6,1,2};
		int riga=2, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test12() {
		
		int[][] M = {{1},
					{2},
					{3},
					{4},
					{5},
					{6}};
		int[] ris = {6,1,2,3,4,5};
		int riga=5, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test13() {
		
		int[][] M = {{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25},
					{26,27,28,29,30}};
		int[] ris = {1,2,3,4,5,10,9,8,7,6,11,12,13,14,15,20,19,18,17,16,21,22,23,24,25,30,29,28,27,26};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test14() {
		
		int[][] M = {{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25},
					{26,27,28,29,30}};
		int[] ris = {3,4,5,10,9,8,7,6,11,12,13,14,15,20,19,18,17,16,21,22,23,24,25,30,29,28,27,26,1,2};
		int riga=0, colonna=2;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test15() {
		
		int[][] M = {{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25},
					{26,27,28,29,30}};
		int[] ris = {7,8,9,10,15,14,13,12,11,16,17,18,19,20,25,24,23,22,21,26,27,28,29,30,5,4,3,2,1,6};
		int riga=1, colonna=1;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test16() {
		
		int[][] M = {{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25},
					{26,27,28,29,30}};
		int[] ris = {28,29,30,5,4,3,2,1,6,7,8,9,10,15,14,13,12,11,16,17,18,19,20,25,24,23,22,21,26,27};
		int riga=5, colonna=2;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}

	@Test
	public void test17() {
		
		int[][] M = {{1,2},
					{3,4}};
		int[] ris = {1,2,4,3};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test18() {
		
		int[][] M = {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		int[] ris = {1,2,3,4,8,7,6,5,9,10,11,12,16,15,14,13};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
}