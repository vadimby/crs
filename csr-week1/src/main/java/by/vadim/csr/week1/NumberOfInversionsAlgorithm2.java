package by.vadim.csr.week1;

import java.util.Arrays;

public class NumberOfInversionsAlgorithm2 implements NumberOfInversionsAlgorithm {

	@Override
	public NumberOfInversionsAlgorithmResult2 calc(int[] array) {
		if (array.length == 1) {
			return new NumberOfInversionsAlgorithmResult2(array, 0);
		}

		int[] half1 = Arrays.copyOfRange(array, 0, array.length / 2);
		NumberOfInversionsAlgorithmResult2 half1Result = calc(half1);
		int[] half2 = Arrays.copyOfRange(array, array.length / 2, array.length);
		NumberOfInversionsAlgorithmResult2 half2Result = calc(half2);
		NumberOfInversionsAlgorithmResult2 splitResult = calcSplitInversions(half1Result.getSortedArray(), half2Result.getSortedArray());
		return new NumberOfInversionsAlgorithmResult2(splitResult.getSortedArray(),
				half1Result.getInversionsCount() + half2Result.getInversionsCount() + splitResult.getInversionsCount());

	}

	private NumberOfInversionsAlgorithmResult2 calcSplitInversions(int[] b, int[] c) {
		int i = 0, j = 0, inversions = 0, length = b.length + c.length;
		int[] d = new int[length];
		for (int k = 0; k < length; k++) {
			if (i >= b.length) {
				d[k] = c[j];
				j++;
			} else if (j >= c.length) {
				d[k] = b[i];
				i++;
			} else if (b[i] <= c[j]) {
				d[k] = b[i];
				i++;
			} else {
				d[k] = c[j];
				j++;
				int delta = b.length - i;
				inversions += delta;
			}
		}
		return new NumberOfInversionsAlgorithmResult2(d, inversions);
	}

	private long calcSplitInversions2(int[] array) {
		long result = 0;
		for (int i = 0, j = array.length / 2; i < array.length / 2 && j < array.length;) {
			if (array[i] <= array[j]) {
				i++;
			} else {
				j++;
				result++;
			}
		}
		return result;
	}
}