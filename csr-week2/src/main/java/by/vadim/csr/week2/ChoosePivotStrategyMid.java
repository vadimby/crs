package by.vadim.csr.week2;

class ChoosePivotStrategyMid implements ChoosePivotStrategy {
	@Override
	public int getPivot(int[] a, int start, int end) {
		return (end + start) / 2;
	}
}