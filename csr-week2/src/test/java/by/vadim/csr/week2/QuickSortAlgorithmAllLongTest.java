package by.vadim.csr.week2;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.Is.*;

import org.junit.Before;
import org.junit.Test;

public class QuickSortAlgorithmAllLongTest {

	private static final String SOURCE_FILENAME = "QuickSort.txt";

	private Task taskMid;
	private Task taskFirst;
	private Task taskLast;

	private TestDataProviderFromFile data;

	@Before
	public void setup() {
		data = new TestDataProviderFromFile(SOURCE_FILENAME, new IntergerFileReader());
		taskMid = new Task(new QuickSortAlgorithmFirstElement(new ChoosePivotStrategyMid()));
		taskFirst = new Task(new QuickSortAlgorithmFirstElement(new ChoosePivotStrategy() {
			@Override
			public int getPivot(int[] a, int start, int end) {
				return start;
			}
		}));
		taskLast = new Task(new QuickSortAlgorithmFirstElement(new ChoosePivotStrategy() {
			@Override
			public int getPivot(int[] a, int start, int end) {
				return end - 1;
			}
		}));
	}

	@Test
	public void testFirst() {

		int[] array = data.getData().clone();
		long result = taskFirst.calc(array);

		System.out.println(String.format("First: Size: %s and the result is:\t %s.", array.length, result));

		int p = 0;
		for (int i : array) {
			assertThat(i, is(equalTo(p + 1)));
			assertThat(i, is(equalTo(p + 1)));
			p = i;
		}

	}

	@Test
	public void testLast() {

		int[] array = data.getData().clone();
		long result = taskLast.calc(array);

		System.out.println(String.format("Last: Size: %s and the result is:\t %s.", array.length, result));

		int p = 0;
		for (int i : array) {
			assertThat(i, is(equalTo(p + 1)));
			assertThat(i, is(equalTo(p + 1)));
			p = i;
		}
	}

	@Test
	public void testMid() {

		int[] array = data.getData().clone();
		long result = taskMid.calc(array);

		System.out.println(String.format("Mid: Size: %s and the result is:\t %s.", array.length, result));

		int p = 0;
		for (int i : array) {
			assertThat(i, is(equalTo(p + 1)));
			assertThat(i, is(equalTo(p + 1)));
			p = i;
		}
	}

}
