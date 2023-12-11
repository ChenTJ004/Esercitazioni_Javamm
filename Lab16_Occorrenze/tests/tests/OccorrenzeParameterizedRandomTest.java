package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Occorrenze;
import javamm.OccorrenzeSolution;

@RunWith(Parameterized.class)
public class OccorrenzeParameterizedRandomTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[100][2];
		for (int i = 0; i < 100; ++i) {
			int len = 1 + (int) (Math.random() * 10);
			int[] arr = new int[len];
			for (int j = 0; j < len; j++) {
				arr[j] = (int) (Math.random() * 10);
			}
			m[i][0] = arr;
			m[i][1] = Arrays.toString(arr);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	@SuppressWarnings("unused")
	private String y;

	public OccorrenzeParameterizedRandomTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(Arrays.toString(OccorrenzeSolution.occorrenzeCompresso(x)),
				Arrays.toString(Occorrenze.occorrenzeCompresso(x)));
	}

}
