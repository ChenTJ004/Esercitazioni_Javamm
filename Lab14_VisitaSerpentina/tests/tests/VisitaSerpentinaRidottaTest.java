package tests;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertArrayEquals;

//import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import javamm.VisitaSerpentina;

public class VisitaSerpentinaRidottaTest {

	
	@Test
	public void test1() {
		
		int[][] M = {{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}};
		int[] ris = {1,2,3,6,5,4,7,8,9,12,11,10};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test2() {
		
		int[][] M = {{1},
					{4}};
		int[] ris = {1,4};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test3() {
		
		int[][] M = {{1,2,3,4},
					{5,6,7,8}};
		int[] ris = {1,2,3,4,8,7,6,5};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test4() {
		
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
	public void test5() {
		
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
	public void test6() {
		
		int[][] M = {{1,2},
					{3,4}};
		int[] ris = {1,2,4,3};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
	@Test
	public void test7() {
		
		int[][] M = {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		int[] ris = {1,2,3,4,8,7,6,5,9,10,11,12,16,15,14,13};
		int riga=0, colonna=0;		
		Assert.assertArrayEquals(VisitaSerpentina.visitaSerpentina(M, riga, colonna),ris);
	}
	
		
	
}