package javamm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import javamm.traslaMatrice;

public class TraslaMatriceTest {


	@Test
	public void test1() {
		int y=1;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{ {9,10,11,12},
									  {1,2,3,4},
									  {5,6,7,8}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test2() {
		int y=4;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{ {9,10,11,12},
									  {1,2,3,4},
									  {5,6,7,8}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}

	@Test
	public void test3() {
		int y=7;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{ {9,10,11,12},
									  {1,2,3,4},
									  {5,6,7,8}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test4() {
		int y=-2;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{ {9,10,11,12},
									  {1,2,3,4},
									  {5,6,7,8}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test5() {
		int y=-5;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{ {9,10,11,12},
									  {1,2,3,4},
									  {5,6,7,8}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test6() {
		int y=-8;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{ {9,10,11,12},
									  {1,2,3,4},
									  {5,6,7,8}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test7() {
		int y=10;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{ {9,10,11,12},
									  {1,2,3,4},
									  {5,6,7,8}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test8() {
		int y=0;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{{1,2,3,4},
		     						 {5,6,7,8},
		     						 {9,10,11,12}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test21() {
		int y=3;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{{1,2,3,4},
		     						 {5,6,7,8},
		     						 {9,10,11,12}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test9() {
		int y=-3;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{{1,2,3,4},
		     						 {5,6,7,8},
		     						 {9,10,11,12}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test10() {
		int y=-1;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{{5,6,7,8},
		     						 {9,10,11,12},
		     						 {1,2,3,4}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test11() {
		int y=-4;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{{5,6,7,8},
		     						 {9,10,11,12},
		     						 {1,2,3,4}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test12() {
		int y=2;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{{5,6,7,8},
		     						 {9,10,11,12},
		     						 {1,2,3,4}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test13() {
		int y=5;
		int[][] input = new int[][]{ {1,2,3,4},
								     {5,6,7,8},
								     {9,10,11,12}};
		int[][] output = new int[][]{{5,6,7,8},
		     						 {9,10,11,12},
		     						 {1,2,3,4}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test14() {
		int y=0;
		int[][] input = new int[][]{ {1},
								     {5},
								     {9}};
		int[][] output = new int[][]{{1},
		     						 {5},
		     						 {9}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test15() {
		int y=1;
		int[][] input = new int[][]{ {1},
								     {5},
								     {9}};
		int[][] output = new int[][]{{9},
		     						 {1},
		     						 {5}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}

	@Test
	public void test16() {
		int y=-10;
		int[][] input = new int[][]{ {1},
								     {5},
								     {9}};
		int[][] output = new int[][]{{5},
		     						 {9},
		     						 {1}};								 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test17() {
		int y=10;
		int[][] input = new int[][]{ {1},{2},{3}};
		int[][] output = new int[][]{ {3},{1},{2}};						 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test18() {
		int y=22;
		int[][] input = new int[][]{ {1}};
		int[][] output = new int[][]{ {1}};						 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test19() {
		int y=-4;
		int[][] input = new int[][]{ {1}};
		int[][] output = new int[][]{ {1}};						 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
	
	@Test
	public void test20() {
		int y=0;
		int[][] input = new int[][]{ {1}};
		int[][] output = new int[][]{ {1}};						 
		Assert.assertArrayEquals(traslaMatrice.traslaMatrice(input, y),output);
	}
}
