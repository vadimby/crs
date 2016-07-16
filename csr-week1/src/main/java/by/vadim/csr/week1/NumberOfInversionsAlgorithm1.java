package by.vadim.csr.week1;

public class NumberOfInversionsAlgorithm1 implements NumberOfInversionsAlgorithm {

	@Override
	public NumberOfInversionsAlgorithmResult calc(int[] array) {
		long result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					result++;
				}
			}
		}
		return new NumberOfInversionsAlgorithmResult1(result);
	}

}
