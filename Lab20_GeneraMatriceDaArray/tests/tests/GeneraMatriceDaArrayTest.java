package tests;

import org.junit.Assert;
import org.junit.Test;
import javamm.GeneraMatriceDaArray;

public class GeneraMatriceDaArrayTest {
	@SuppressWarnings("deprecation")
	
	@Test
	public void test1() {
		
		int[] arr = {4,2,1,3};
		int[][] ris = { 	{1,2,3,4,17,18,21,22,23,24},
							{5,6,7,8,19,20,0,25,26,27},
							{9,10,11,12,0,0,0,28,29,30},
							{13,14,15,16,0,0,0,0,0,0}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
	
	@Test
	public void test2() {
		
		int[] arr = {4,1,2};
		int[][] ris = { 	{1,2,3,4,17,18,19},
							{5,6,7,8,0,20,21},
							{9,10,11,12,0,0,0},
							{13,14,15,16,0,0,0}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}

	@Test
	public void test3() {
		
		int[] arr = {1,4,2,3};
		int[][] ris = { 	{1,2,3,4,5,18,19,22,23,24},
							{0,6,7,8,9,20,21,25,26,27},
							{0,10,11,12,13,0,0,28,29,30},
							{0,14,15,16,17,0,0,0,0,0}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
	
	@Test
	public void test4() {
		
		int[] arr = {1,2,4};
		int[][] ris = { 	{1,2,3,6,7,8,9},
							{0,4,5,10,11,12,13},
							{0,0,0,14,15,16,17},
							{0,0,0,18,19,20,21}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
	
	@Test
	public void test5() {
		
		int[] arr = {1,1,1};
		int[][] ris = {{1,2,3}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
	
	@Test
	public void test6() {
		
		int[] arr = {1,1};
		int[][] ris = {{1,2}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
	
	@Test
	public void test7() {
		
		int[] arr = {1};
		int[][] ris = { {1}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
	
	@Test
	public void test8() {
		
		int[] arr = {3};
		int[][] ris = { 	{1,2,3},
							{4,5,6},
							{7,8,9}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
	
	@Test
	public void test9() {
		
		int[] arr = {2};
		int[][] ris = { 	{1,2},
							{3,4}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
	
	@Test
	public void test10() {
		
		int[] arr = {3,2,1};
		int[][] ris = { 	{1,2,3,10,11,14},
							{4,5,6,12,13,0},
							{7,8,9,0,0,0}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
	
	@Test
	public void test11() {
		
		int[] arr = {4,2,1,3,5,1};
		int[][] ris = { 	{1,2,3,4,17,18,21,22,23,24,31,32,33,34,35,56},
							{5,6,7,8,19,20,0,25,26,27,36,37,38,39,40,0},
							{9,10,11,12,0,0,0,28,29,30,41,42,43,44,45,0},
							{13,14,15,16,0,0,0,0,0,0,46,47,48,49,50,0},
							{0,0,0,0,0,0,0,0,0,0,51,52,53,54,55,0}};
		
		Assert.assertEquals(GeneraMatriceDaArray.generaMatriceDaArray(arr), ris);
	}
}
 