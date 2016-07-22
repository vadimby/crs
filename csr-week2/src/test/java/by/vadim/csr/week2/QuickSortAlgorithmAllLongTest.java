package by.vadim.csr.week2;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class QuickSortAlgorithmAllLongTest {

	private static final String SOURCE_FILENAME = "QuickSort.txt";

	private Task taskMid;
	private Task taskMedian;
	private Task taskFirst;
	private Task taskLast;

	private TestDataProviderFromFile data;

	@Before
	public void setup() {
		data = new TestDataProviderFromFile(SOURCE_FILENAME, new IntergerFileReader());
		taskMid = new Task(new QuickSortAlgorithmFirstElement(new ChoosePivotStrategyMid()));
		taskMedian = new Task(new QuickSortAlgorithmFirstElement(new ChoosePivotStrategyMedian()));
		taskFirst = new Task(new QuickSortAlgorithmFirstElement(new ChoosePivotStrategy() {
			@Override
			public int getPivot(int[] a, int start, int end) {
				return start;
			}
		}));
		taskLast = new Task(new QuickSortAlgorithmFirstElement(new ChoosePivotStrategyEnd()));
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
		assertThat(result, is(equalTo(162085L)));
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

		assertThat(result, is(equalTo(164123L)));
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

		assertThat(result, is(equalTo(150657l)));
	}
	
	@Test
	public void testMedian() {

		int[] array = data.getData().clone();
		long result = taskMedian.calc(array);

		System.out.println(String.format("Median: Size: %s and the result is:\t %s.", array.length, result));

		int p = 0;
		for (int i : array) {
			assertThat(i, is(equalTo(p + 1)));
			assertThat(i, is(equalTo(p + 1)));
			p = i;
		}

		assertThat(result, not(equalTo(152234l)));
		assertThat(result, not(equalTo(150488l)));
		assertThat(result, is(equalTo(138382l)));
	}

}
