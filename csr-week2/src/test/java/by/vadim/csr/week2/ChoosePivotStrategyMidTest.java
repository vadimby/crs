package by.vadim.csr.week2;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ChoosePivotStrategyMidTest {

	private ChoosePivotStrategyMid choosePivotStrategy;

	@Before
	public void setup() {
		choosePivotStrategy = new ChoosePivotStrategyMid();
	}

	@Test
	public void test1() {

		int result = choosePivotStrategy.getPivot(null, 0, 1);

		assertThat(result, is(equalTo(0)));
	}

	@Test
	public void test2() {
		int result = choosePivotStrategy.getPivot(null, 0, 2);

		assertThat(result, is(equalTo(1)));
	}

	@Test
	public void test3() {
		int result = choosePivotStrategy.getPivot(null, 0, 3);

		assertThat(result, is(equalTo(1)));
	}

	@Test
	public void test4() {
		int result = choosePivotStrategy.getPivot(null, 0, 4);

		assertThat(result, is(equalTo(2)));
	}

	@Test
	public void test5() {
		int result = choosePivotStrategy.getPivot(null, 1, 4);

		assertThat(result, is(equalTo(2)));
	}

	@Test
	public void test6() {
		int result = choosePivotStrategy.getPivot(null, 2, 4);

		assertThat(result, is(equalTo(3)));
	}
}
