package by.vadim.csr.week2;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ChoosePivotStrategyMedianTest {

	private ChoosePivotStrategy choosePivotStrategy;
	private int[] array;

	@Before
	public void setup() {
		choosePivotStrategy = new ChoosePivotStrategyMedian();
		array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	}

	@Test
	public void test1() {

		int result = choosePivotStrategy.getPivot(array, 0, 1);

		assertThat(result, is(equalTo(0)));
	}

	@Test
	public void test2() {
		int result = choosePivotStrategy.getPivot(array, 0, 2);

		assertThat(result, is(equalTo(1)));
	}

	@Test
	public void test3() {
		int result = choosePivotStrategy.getPivot(array, 0, 3);

		assertThat(result, is(equalTo(1)));
	}

	@Test
	public void test4() {
		int result = choosePivotStrategy.getPivot(array, 0, 4);

		assertThat(result, is(equalTo(2)));
	}

	@Test
	public void test5() {
		int result = choosePivotStrategy.getPivot(array, 1, 4);

		assertThat(result, is(equalTo(2)));
	}

	@Test
	public void test6() {
		int result = choosePivotStrategy.getPivot(array, 2, 4);

		assertThat(result, is(equalTo(3)));
	}
}
