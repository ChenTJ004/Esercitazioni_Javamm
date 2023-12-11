package tests;

import org.junit.Assert;
import org.junit.Test;

import javamm.AzzeraNonUnici;

@SuppressWarnings("deprecation")

public class AzzeraNonUnici_Test {

		
	@Test
	public void test1() {
		
		int[][] M = new int[][] 		{{1,2,3,4},
								 		 {1,2,3,4},
								 		 {1,2,3,4} };
		
		int r=0, c=1;
		int[][] azzerata = new int[][] {{1,0,3,4},
								 		 {1,0,3,4},
								 		 {1,0,3,4} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}

	@Test
	public void test2() {
		
		int[][] M = new int[][] 		{{1,2,3,1},
								 		 {1,2,3,4},
								 		 {1,2,1,4} };
		
		int r=0, c=0;
		int[][] azzerata = new int[][] {{0,2,3,0},
								 		 {0,2,3,4},
								 		 {0,2,0,4} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test3() {
		
		int[][] M = new int[][] 		{{1,2,3,1},
								 		 {1,2,3,4},
								 		 {1,2,1,4} };
		
		int r=2, c=3;
		int[][] azzerata = new int[][] {{1,2,3,1},
								 		 {1,2,3,4},
								 		 {1,2,1,4} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test4() {
		
		int[][] M = new int[][] 		{{1,2,3,1},
								 		 {1,2,3,4},
								 		 {1,2,1,4} };
		
		int r=1, c=3;
		int[][] azzerata = new int[][] {{1,2,3,1},
								 		 {1,2,3,0},
								 		 {1,2,1,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test5() {
		
		int[][] M = new int[][] 		{{1,1,1,1}};
		
		int r=0, c=1;
		int[][] azzerata = new int[][] {{1,0,0,0}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test6() {
		
		int[][] M = new int[][] 		{{1,1,1,1}};
		
		int r=0, c=3;
		int[][] azzerata = new int[][] {{1,1,1,1}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test7() {
		
		int[][] M = new int[][] 		{{1},
										 {1},
										 {1},
										 {1}};
		
		int r=2, c=0;
		int[][] azzerata = new int[][] {{1},
										 {1},
										 {0},
										 {0}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test8() {
		
		int[][] M = new int[][] 		{{1}};
		
		int r=0, c=0;
		int[][] azzerata = new int[][] {{1}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test9() {
		
		int[][] M = new int[][] 		{{1,1},
										 {1,1}};
		
		int r=0, c=0;
		int[][] azzerata = new int[][] {{0,0},
			 							{0,0}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}

	@Test
	public void test10() {
		
		int[][] M = new int[][] 		{{2,2,3,1},
								 		 {1,2,3,4},
								 		 {1,2,2,4},
								 		 {1,3,3,2}};
		
		int r=1, c=1;
		int[][] azzerata = new int[][] {{2,2,3,1},
								 		 {1,0,3,4},
								 		 {1,0,0,4},
								 		 {1,3,3,0}};
	 		 
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test11() {
		
		int[][] M = new int[][] 		{{1,2,0,4},
								 		 {1,2,0,4},
								 		 {1,2,0,0} };
		
		int r=0, c=1;
		int[][] azzerata = new int[][] {{1,0,0,4},
								 		 {1,0,0,4},
								 		 {1,0,0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test12() {
		
		int[][] M = new int[][] 		{{0,0,0,0}};
		
		int r=0, c=1;
		int[][] azzerata = new int[][] {{0,0,0,0}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test13() {
		
		int[][] M = new int[][] 		{{0}};
		
		int r=0, c=0;
		int[][] azzerata = new int[][] {{0}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test14() {
		
		int[][] M = new int[][] 		{{0,0},
										 {0,0}};
		
		int r=0, c=0;
		int[][] azzerata = new int[][] {{0,0},
			 							{0,0}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test15() {
		
		int[][] M = new int[][] 		{{2,0,3,1},
								 		 {1,2,3,4},
								 		 {1,2,2,4},
								 		 {1,0,0,2}};
		
		int r=1, c=1;
		int[][] azzerata = new int[][] {{2,0,3,1},
								 		 {1,0,3,4},
								 		 {1,0,0,4},
								 		 {1,0,0,0}};
	 		 
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test16() {
		
		int[][] M = new int[][] 		{{5,0,17,8},
								 		 {9,10,11,12},
								 		 {10,9,10,12}, 
								 		 {9,17,9,0}};
		
		int r=1, c=0;
		int[][] azzerata = new int[][] {{5,0,17,8},
								 		 {0,10,11,12},
								 		 {10,0,10,12}, 
								 		 {0,17,0,0}};
								 		 
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
	@Test
	public void test17() {
		
		int[][] M = new int[][] 		{{5,0,17,8},
								 		 {9,10,11,12},
								 		 {10,9,10,12}, 
								 		 {9,17,9,0}};
		
		int r=0, c=2;
		int[][] azzerata = new int[][] {{5,0,17,8},
								 		 {9,10,11,12},
								 		 {10,9,10,12}, 
								 		 {9,17,9,0}};
								 		 
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUnici(M,r,c),azzerata);
	}
	
}