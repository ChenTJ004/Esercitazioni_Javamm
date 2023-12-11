package tests;

import org.junit.Assert;

import org.junit.Test;

import javamm.InteroNascosto;

public class InteroNascostoTest {

		@Test
		public void test1() {
			
			int a = 999999;
			int b = 919191;
			int c = 111111;
			int r = 919191; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
		
		@Test
		public void test2() {
			
			int a = 1234;
			int b = 1234;
			int c = 1234;
			int r = 1234; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
		
		@Test
		public void test3() {
			
			int a = 1234;
			int b = 4321;
			int c = 5555;
			int r = 0; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
		
		@Test
		public void test4() {
			
			int a = 1;
			int b = 1;
			int c = 1;
			int r = 1; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
		
		@Test
		public void test5() {
			
			int a = 1;
			int b = 2;
			int c = 1;
			int r = 1; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
		
		@Test
		public void test6() {
			
			int a = 1;
			int b = 0;
			int c = 2;
			int r = 0; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
		
		@Test
		public void test7() {
			
			int a = 0;
			int b = 0;
			int c = 0;
			int r = 0; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
		
		@Test
		public void test8() {
			
			int a = 120000;
			int b = 230000;
			int c = 450000;
			int r = 0; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
		
		@Test
		public void test9() {
			
			int a = 120000;
			int b = 230000;
			int c = 150000;
			int r = 10000; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
		
		@Test
		public void test10() {
			
			int a = 121130;
			int b = 230141;
			int c = 451051;
			int r = 111; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
						
		@Test
		public void test11() {
			
			int a = 937829; 
			int b = 913803;
			int c = 212801;
			int r = 9180; 
			Assert.assertEquals(InteroNascosto.interoNascosto(a,b,c), r);
		}
}