package by.vadim.csr.week2;

class ChoosePivotStrategyEnd implements ChoosePivotStrategy {
	@Override
	public int getPivot(int[] a, int start, int end) {
		return end;
	}
}