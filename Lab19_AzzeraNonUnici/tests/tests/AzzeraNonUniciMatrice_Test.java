package tests;

import org.junit.Assert;
import org.junit.Test;

import javamm.AzzeraNonUnici;

@SuppressWarnings("deprecation")

public class AzzeraNonUniciMatrice_Test {

		
	@Test
	public void test1() {
		
		int[][] M = new int[][] 		{{1,2,3,4},
								 		 {1,2,3,4},
								 		 {1,2,3,4} };

		int[][] azzerata = new int[][] {{0,0,0,0},
								 		 {0,0,0,0},
								 		 {0,0,0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}

	@Test
	public void test2() {
		
		int[][] M = new int[][] 		{{1,2,3,4},
								 		 {2,3,4,1},
								 		 {3,4,1,2} };

		int[][] azzerata = new int[][] { {0,0,3,4},
								 		 {2,3,4,1},
								 		 {3,4,0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}

	@Test
	public void test3() {
		
		int[][] M = new int[][] 		{{1,2,3,4},
								 		 {3,4,1,2},
								 		 {1,2,3,4} };

		int[][] azzerata = new int[][] { {0,0,0,0},
								 		 {3,4,1,2},
								 		 {0,0,0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}

	@Test
	public void test4() {
		
		int[][] M = new int[][] 		{{1,2,1,4},
								 		 {2,3,4,2},
								 		 {1,2,1,2} };

		int[][] azzerata = new int[][] { {0,0,0,4},
								 		 {0,3,4,0},
								 		 {0,0,0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test5() {
		
		int[][] M = new int[][] 		{{1,2},
								 		 {2,1},
								 		 {1,1} };

		int[][] azzerata = new int[][] { {0,2},
								 		 {2,0},
								 		 {0,1} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test6() {
		
		int[][] M = new int[][] 		{{1},
								 		 {2},
								 		 {1},
								 		 {2}};

		int[][] azzerata = new int[][] { {0},
								 		 {0},
								 		 {0},
								 		 {0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test7() {
		
		int[][] M = new int[][] 		{{1,2,1},
								 		 {4,5,4},
								 		 {1,1,1}};

		int[][] azzerata = new int[][] { {0,2,0},
								 		 {0,5,0},
								 		 {0,1,0}};

		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test8() {
		
		int[][] M = new int[][] 		{{1,2,1},
								 		 {1,3,1},
								 		 {1,1,2}};

		int[][] azzerata = new int[][] { {0,2,0},
								 		 {0,3,1},
								 		 {0,1,2}};

		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test9() {
		
		int[][] M = new int[][] 		{{1,2,3},
								 		 {3,2,1},
								 		 {2,1,3}};

		int[][] azzerata = new int[][] { {1,0,0},
								 		 {3,0,1},
								 		 {2,1,0}};

		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test10() {
		
		int[][] M = new int[][] 		{{1,2,2},
								 		 {2,3,1},
								 		 {2,1,3}};

		int[][] azzerata = new int[][] { {1,0,0},
								 		 {0,0,1},
								 		 {0,1,0}};

		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test11() {
		
		int[][] M = new int[][] 		{{1,2,2,4,4}};

		int[][] azzerata = new int[][] 	{{1,0,0,0,0}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test12() {
		
		int[][] M = new int[][] 		{{7,2,2},
								 		 {8,1,8},
								 		 {2,8,7}};

		int[][] azzerata = new int[][] { {0,0,0},
								 		 {0,1,0},
								 		 {2,0,0}};

		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test13() {
		
		int[][] M = new int[][] 		{{1,1,1,1},
								 		 {2,2,2,2},
								 		 {3,3,3,3} };

		int[][] azzerata = new int[][] {{0,0,0,0},
								 		 {0,0,0,0},
								 		 {0,0,0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test14() {
		
		int[][] M = new int[][] 		{{1,2,3,4},
								 		 {4,1,2,3},
								 		 {5,4,1,2} };

		int[][] azzerata = new int[][] {{0,0,0,4},
								 		 {0,0,0,0},
								 		 {5,0,0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test15() {
		
		int[][] M = new int[][] 		{{1,2,1},
								 		 {2,1,2},
								 		 {2,2,1}};

		int[][] azzerata = new int[][] { {0,0,0},
								 		 {0,0,0},
								 		 {0,0,0}};

		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test16() {
		
		int[][] M = new int[][] 		{{1,2,3,4},
								 		 {2,3,0,0},
								 		 {0,0,1,2} };

		int[][] azzerata = new int[][] { {0,0,3,4},
								 		 {2,3,0,0},
								 		 {0,0,0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test17() {
		
		int[][] M = new int[][] 		{{1,0},
								 		 {0,1},
								 		 {1,0} };

		int[][] azzerata = new int[][] { {0,0},
								 		 {0,0},
								 		 {0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test18() {
		
		int[][] M = new int[][] 		{{0,0,0,0,0}};

		int[][] azzerata = new int[][] 	{{0,0,0,0,0}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test19() {
		
		int[][] M = new int[][] 		{{1,2,3,0},
								 		 {4,1,2,3},
								 		 {0,4,1,2} };

		int[][] azzerata = new int[][] {{0,0,0,0},
								 		 {0,0,0,0},
								 		 {0,0,0,0} };
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test20() {
		
		int[][] M = new int[][] 		{{0}};

		int[][] azzerata = new int[][] 	{{0}};
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}
	
	@Test
	public void test21() {
		
		int[][] M = new int[][] 		{{5,0,17,8},
								 		 {9,10,11,12},
								 		 {10,9,10,12}, 
								 		 {9,17,9,0}};
		
		int[][] azzerata = new int[][] {{5,0,17,8},
								 		 {0,0,11,0},
								 		 {10,0,0,0}, 
								 		 {0,17,0,0}};
								 		 
		Assert.assertArrayEquals(AzzeraNonUnici.azzeraNonUniciMatrice(M),azzerata);
	}

	
}