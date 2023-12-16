package tests;

import org.junit.Assert;
import org.junit.Test;

import javamm.TrovaParola;


public class TrovaParolaMediaTest {
	
	@Test
	public void test1() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'a','p','e'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test2() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'p','o','l','l','o'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}

	@Test
	public void test3() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'f','o','r','o'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test4() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'a','l','t'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test5() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'e','r','a'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test6() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'m','a','r','e'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test7() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'l','o','t','o'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test8() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'o','l','i','o'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test9() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'p','e','r','a'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test10() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'o','p','e','r','a'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test11() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'o','r','i'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test12() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'a','p','i'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test13() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'z'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test14() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'p','e','r','a','c','c','i','a'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test15() {
		
		char[][] M = {  {'a','f','t','p','l'},
						{'p','o','l','l','o'},
						{'e','r','a','m','t'},
						{'a','o','i','l','o'},
						{'o','p','e','r','a'},};
		char[] p = {'a','l','t','i','t','u','d','i','n','e'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test16() {
		
		char[][] M = { {'h'} };
		char[] p = {'h'};
		boolean ris = true;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test17() {
		
		char[][] M = { {'h'} };
		char[] p = {'q'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test18() {
		
		char[][] M = { {'h'} };
		char[] p = {'h','k'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test19() {
		
		char[][] M = { {'f','o','r','m','a','g','g','i','o'} };
		char[] p = {'f','o','r','m','a'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test20() {
		
		char[][] M = { {'f','o','r','m','a','g','g','i','o'} };
		char[] p = {'m','a','g','g','i','o'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test21() {
		
		char[][] M = { {'f'},{'o'},{'r'},{'m'},{'a'},{'g'},{'g'},{'i'},{'o'} };
		char[] p = {'m','a','g','g','i','o'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test22() {
		
		char[][] M = { {'f'},{'o'},{'r'},{'m'},{'a'},{'g'},{'g'},{'i'},{'o'} };
		char[] p = {'f','o','r','m','a'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test23() {
		
		char[][] M = { {'f'},{'o'},{'r'},{'m'},{'a'},{'g'},{'g'},{'i'},{'o'} };
		char[] p = {'m','a','g','g','i','o','r','e'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test24() {
		
		char[][] M = { {'f'},{'o'},{'r'},{'m'},{'a'},{'g'},{'g'},{'i'},{'o'} };
		char[] p = {'m','a','a','g','i','o'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
	
	@Test
	public void test25() {
		
		char[][] M = {  {'a','b'},
						{'c','d'} };
		char[] p = {'e'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}
		
	@Test
	public void test26() {
			
		char[][] M = {  {'a','b'},
						{'c','d'} };
		char[] p = {'a','b','d'};
		boolean ris = false;

		Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
	}		
		
		@Test
		public void test27() {
				
			char[][] M = {  {'a','b'},
							{'c','d'} };
			char[] p = {'c','a','c'};
			boolean ris = false;

			Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
		}		
			
			@Test
			public void test28() {
					
				char[][] M = {  {'a','b'},
								{'c','d'} };
				char[] p = {'c','d'};
				boolean ris = false;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}		
			
			@Test
			public void test29() {
					
				char[][] M = {  {'a','b'},
								{'c','d'} };
				char[] p = {'b','d'};
				boolean ris = false;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}		
			
			@Test
			public void test30() {
					
				char[][] M = {  {'a','b'},
								{'c','d'} };
				char[] p = {'c','a'};
				boolean ris = false;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}		
					
			@Test
			public void test31() {
					
				char[][] M = {  {'a','b','c'},
								{'d','e','f'},
								{'g','h','i'}};
				char[] p = {'g','d','a'};
				boolean ris = false;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}	
			
			@Test
			public void test32() {
					
				char[][] M = {  {'a','b','c'},
								{'d','e','f'},
								{'g','h','i'}};
				char[] p = {'g','d','a','g'};
				boolean ris = false;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}	
	
			@Test
			public void test33() {
					
				char[][] M = {  {'a','a','a'},
								{'a','a','a'},
								{'a','a','a'}};
				char[] p = {'a','a','a'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}	
			
			@Test
			public void test34() {
					
				char[][] M = {  {'a','a','a'},
								{'a','a','a'},
								{'a','a','a'}};
				char[] p = {'a','a'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}
			
			@Test
			public void test35() {
					
				char[][] M = {  {'a','a','a'},
								{'a','a','a'},
								{'a','a','a'}};
				char[] p = {'a','a','a','a'};
				boolean ris = false;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}	
			
			@Test
			public void test36() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'a','l','f','i','o'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}	
			
			@Test
			public void test37() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'f','i','o'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}	
			
//			@Test
//			public void test38() {
//					
//				char[][] M = {  {'a','b','a','f','i'},
//								{'e','l','r','o','m'},
//								{'t','l','f','o','a'},
//								{'g','u','o','i','z'},
//								{'e','z','u','s','o'}};
//				char[] p = {'a','l','t'};
//				boolean ris = false;
//
//				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
//			}
			
			@Test
			public void test39() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'s','o','l','e'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}
			
//			@Test
//			public void test40() {
//					
//				char[][] M = {  {'a','b','a','f','i'},
//								{'e','l','r','o','m'},
//								{'t','l','f','o','a'},
//								{'g','u','o','i','z'},
//								{'e','z','u','s','o'}};
//				char[] p = {'z','o','o'};
//				boolean ris = false;
//
//				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
//			}
			
			@Test
			public void test41() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'b','r','o'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}
			
			@Test
			public void test42() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'g','z'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}
			
			@Test
			public void test43() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'f','m'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}
			
//			@Test
//			public void test44() {
//					
//				char[][] M = {  {'a','b','a','f','i'},
//								{'e','l','r','o','m'},
//								{'t','l','f','o','a'},
//								{'g','u','o','i','z'},
//								{'e','z','u','s','o'}};
//				char[] p = {'a','i'};
//				boolean ris = false;
//
//				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
//			}	
			
//			@Test
//			public void test45() {
//					
//				char[][] M = {  {'a','b','a','f','i'},
//								{'e','l','r','o','m'},
//								{'t','l','f','o','a'},
//								{'g','u','o','i','z'},
//								{'e','z','u','s','o'}};
//				char[] p = {'b','e'};
//				boolean ris = false;
//
//				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
//			}
			
			@Test
			public void test46() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'t','u'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}
			
//			@Test
//			public void test47() {
//					
//				char[][] M = {  {'a','b','a','f','i'},
//								{'e','l','r','o','m'},
//								{'t','l','f','o','a'},
//								{'g','u','o','i','z'},
//								{'e','z','u','s','o'}};
//				char[] p = {'o','z'};
//				boolean ris = false;
//
//				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
//			}
			
//			@Test
//			public void test48() {
//					
//				char[][] M = {  {'a','b','a','f','i'},
//								{'e','l','r','o','m'},
//								{'t','l','f','o','a'},
//								{'g','u','o','i','z'},
//								{'e','z','u','s','o'}};
//				char[] p = {'e','u','f','o','i'};
//				boolean ris = false;
//
//				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
//			}
			
			@Test
			public void test49() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'o','r','b'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}
			
			@Test
			public void test50() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'u','u','t'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}
			
			@Test
			public void test51() {
					
				char[][] M = {  {'a','b','a','f','i'},
								{'e','l','r','o','m'},
								{'t','l','f','o','a'},
								{'g','u','o','i','z'},
								{'e','z','u','s','o'}};
				char[] p = {'m','f'};
				boolean ris = true;

				Assert.assertEquals(TrovaParola.trovaParolaDiagonale(M, p), ris);
			}
			
}
 