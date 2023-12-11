package tests;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertArrayEquals;

//import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import javamm.EspandiArray;

public class EspandiArrayTest {

	@Test
	public void test1() {
		
		int[] V = {1,4,7,2};
		int[][] M = {{1,4,7,2},
					 {0,4,7,2},
					 {0,4,7,0},
					 {0,4,7,0},
					 {0,0,7,0},
					 {0,0,7,0},
					 {0,0,7,0}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
	@Test
	public void test2() {
		
		int[] V = {1,1,1,1};
		int[][] M = {{1,1,1,1}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
	@Test
	public void test3() {
		
		int[] V = {4,3,2,1};
		int[][] M = {{4,3,2,1},
					 {4,3,2,0},
					 {4,3,0,0},
					 {4,0,0,0}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
	@Test
	public void test4() {
		
		int[] V = {2,2};
		int[][] M = {{2,2},
					 {2,2}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
	@Test
	public void test5() {
		
		int[] V = {1};
		int[][] M = {{1}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
	@Test
	public void test6() {
		
		int[] V = {3};
		int[][] M = {{3},
					 {3},
					 {3}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
	@Test
	public void test7() {
		
		int[] V = {1,3,1};
		int[][] M = {{1,3,1},
					 {0,3,0},
					 {0,3,0}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
	@Test
	public void test8() {
		
		int[] V = {3,1,3};
		int[][] M = {{3,1,3},
					 {3,0,3},
					 {3,0,3}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
	@Test
	public void test9() {
		
		int[] V = {1,5,1};
		int[][] M = {{1,5,1},
					 {0,5,0},
					 {0,5,0},
					 {0,5,0},
					 {0,5,0}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
	@Test
	public void test10() {
		
		int[] V = {4,2,3,3,1,4};
		int[][] M = {{4,2,3,3,1,4},
					 {4,2,3,3,0,4},
					 {4,0,3,3,0,4},
					 {4,0,0,0,0,4}};
		Assert.assertEquals(EspandiArray.espandiArray(V), M);
	}
	
}
