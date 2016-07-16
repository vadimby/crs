package by.vadim.csr.week1;

public class NumberOfInversionsAlgorithmResult2 implements NumberOfInversionsAlgorithmResult {

	private final int[] sortedArray;
	private final long inversionsCount;

	public NumberOfInversionsAlgorithmResult2(int[] sortedArray, long inversionsCount) {
		this.sortedArray = sortedArray;
		this.inversionsCount = inversionsCount;
	}

	public int[] getSortedArray() {
		return sortedArray;
	}

	@Override
	public long getInversionsCount() {
		return inversionsCount;
	}

}
