package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.SpiralMatrix;
import javamm.SpiralMatrixSolution;

@RunWith(Parameterized.class)
public class SpiralMatrixTest {

	@Parameters(name = "(n = {0}; x = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 1000; ++i) {
			int n = 1 + (int) (Math.random() * 10);
			int x = 1 + (int) (Math.random() * (n*n));
			m[i][0] = n;
			m[i][1] = x;
		}
		return Arrays.asList(m);
	}

	private int x;
	private int y;

	public SpiralMatrixTest(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		String t = Arrays.toString(SpiralMatrixSolution.spiralMatrix(x, y));
		String s = Arrays.toString(SpiralMatrix.spiralMatrix(x, y));
		assertEquals(t, s);
	}

}
