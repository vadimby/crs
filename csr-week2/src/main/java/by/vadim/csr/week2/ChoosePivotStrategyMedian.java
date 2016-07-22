package by.vadim.csr.week2;

public class ChoosePivotStrategyMedian implements ChoosePivotStrategy {
	@Override
	public int getPivot(int[] a, int start, int end) {
		int mid = (start + end) / 2;

		int midValue = a[mid];
		int startValue = a[start];
		int endValue = a[end];

		if (startValue >= midValue && midValue >= endValue) {
			return mid;
		} else if (endValue >= startValue && startValue >= midValue) {
			return start;
		} else if (midValue >= endValue && endValue >= startValue) {
			return end;
		} else if (startValue <= midValue && midValue <= endValue) {
			return mid;
		} else if (endValue <= startValue && startValue <= midValue) {
			return start;
		} else if (midValue <= endValue && endValue <= startValue) {
			return end;
		} else {
			System.err.println(startValue + ", " + midValue + ", " + endValue);
		}
		return -1;
	}

	// public int getPivot(int[] a, int start, int end) {
	// int mid = (start + end) / 2;
	//
	// int midValue = a[mid];
	// int startValue = a[start];
	// int endValue = a[end];
	//
	// if (startValue > midValue) {
	// if (midValue > endValue) {
	// return mid;
	// } else {
	// return end - 1;
	// }
	// } else {
	// if (midValue < endValue) {
	// return mid;
	// } else {
	// return start;
	// }
	// }
	// }
}