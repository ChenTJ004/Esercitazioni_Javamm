package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.SpiralPath;
import javamm.SpiralPathSolution;

@RunWith(Parameterized.class)
public class SpiralPathTest {

	@Parameters(name = "(n = {0}; i = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 200; ++i) {
			int x = (int) (Math.random() * 10);
			x = 2 * x + 1;
			m[i][0] = x;
			m[i][1] = 1;
		}
		for (int i = 200; i < 500; ++i) {
			int x = (int) (Math.random() * 10);
			x = 2 * x + 1;
			m[i][0] = x;
			m[i][1] = x*x;
		}
		for (int i = 500; i < 1000; ++i) {
			int x = (int) (Math.random() * 10);
			x = 2 * x + 1;
			int y = 1 + (int) (Math.random() * (x * x));
			m[i][0] = x;
			m[i][1] = y;
		}
		return Arrays.asList(m);
	}

	private int x;
	private int y;

	public SpiralPathTest(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(SpiralPathSolution.spiralPath(x, y), SpiralPath.spiralPath(x, y));
	}
}
