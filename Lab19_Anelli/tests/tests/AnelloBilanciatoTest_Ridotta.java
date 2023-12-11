package tests;

import org.junit.Assert;
import org.junit.Test;
import javamm.Anelli;

public class AnelloBilanciatoTest_Ridotta {

	@Test
	public void test1() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
			   	     {3,7,2, 5, 6, 0,0},
				     {3,10,2,3,-5,1,0},
				     {3,0,-1,3,4,4,0},
				     {3,2,8,0,1,-7,0},
				     {3,3,5,-2,1,-4,0},
				     {3,6,5,4,0,1,2} };
		int k = 1;
		boolean ris = true;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test2() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
			   	     {3,7,2, 5, 6, 0,0},
				     {3,10,2,3,5,1,0},
				     {3,0,-1,3,4,4,0},
				     {3,2,8,0,1,-7,0},
				     {3,3,5,-2,1,-4,0},
				     {3,6,5,4,0,1,2} };
		int k = 1;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test3() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
			   	     {3,7,2, 5, 6, 0,0},
				     {3,10,2,3,-5,1,0},
				     {3,0,1,3,4,4,0},
				     {3,2,8,0,1,-7,0},
				     {3,3,5,-2,1,-4,0},
				     {3,6,5,4,0,1,2} };
		int k = 1;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test4() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
			   	     {3,7,2, 5, 6, 0,0},
				     {3,10,2,3,-5,1,0},
				     {3,0,-1,3,4,4,0},
				     {3,2,8,0,2,-7,0},
				     {3,3,5,-2,1,-4,0},
				     {3,6,5,4,0,1,2} };
		int k = 1;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}

	@Test
	public void test5() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
			   	     {3,7,2, 5, 6, 0,0},
				     {3,10,2,3,-5,1,0},
				     {3,0,-1,3,4,4,0},
				     {3,2,9,0,1,-7,0},
				     {3,3,5,-2,1,-4,0},
				     {3,6,5,4,0,1,2} };
		int k = 1;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test6() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
			   	     {3,7,2, 5, 6, 0,0},
				     {3,10,2,3,-5,1,0},
				     {3,0,-1,3,4,4,0},
				     {3,2,8,0,1,-7,0},
				     {3,3,5,-2,1,-4,0},
				     {3,6,5,4,0,1,2} };
		int k = 2;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test7() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
			   	     {3,7,2, 5, 6, 0,0},
				     {3,10,2,3,-5,1,0},
				     {3,-1,-1,3,4,4,0},
				     {3,2,8,0,1,-7,0},
				     {3,3,5,-2,1,-4,0},
				     {3,6,5,4,0,1,2} };
		int k = 2;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test8() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
			   	     {3,7,2, 5, 6, 0,0},
				     {3,10,2,3,-5,1,0},
				     {3,-1,-1,3,4,4,0},
				     {3,2,8,0,1,-7,0},
				     {3,3,-3,-2,1,-4,0},
				     {3,6,5,4,0,1,2} };
		int k = 2;
		boolean ris = true;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test9() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
			   	     {3,7,2, 5, 6, 0,0},
				     {3,10,2,3,-5,1,0},
				     {3,-1,-1,3,4,4,0},
				     {3,2,8,0,1,-7,0},
				     {3,4,-3,-2,1,-4,0},
				     {3,6,5,4,0,1,2} };
		int k = 2;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test10() {
		
		int[][] T = {{1,2,3,-1,-2,-3,0},
		   	     {3,7,2, 5, 6, 1,0},
			     {3,10,2,3,-5,1,0},
			     {3,-1,-1,3,4,4,0},
			     {3,2,8,0,1,-7,0},
			     {3,3,-3,-2,1,-4,0},
			     {3,6,5,4,0,1,2} };
		int k = 2;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test11() {
		
		int[][] T = {{7,2, 5, 6, 0},
			     {10,2,3,-5,1},
			     {-1,-1,3,4,4},
			     {2,8,0,1,-7},
			     {3,-3,-2,1,-4} };
		int k = 2;
		boolean ris = true;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test12() {
		
		int[][] T = {{7,2, 5, 6, 0},
			     {10,2,3,-5,1},
			     {-1,-1,3,4,4},
			     {3,8,0,1,-7},
			     {3,-3,-2,1,-4} };
		int k = 2;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test13() {
		
		int[][] T = {{2,3,-5},
			     {-1,3,4},
			     {8,0,1}  };
		int k = 1;
		boolean ris = true;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test14() {
		
		int[][] T = {{2,3,-5},
			     {-1,3,4},
			     {8,1,1}  };
		int k = 1;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}
	
	@Test
	public void test15() {
		
		int[][] T = {{2,3,-5},
			     {-1,3,4},
			     {5,0,1}  };
		int k = 1;
		boolean ris = false;
		Assert.assertEquals(Anelli.anelloBilanciato(T,k),ris);
	}

}
