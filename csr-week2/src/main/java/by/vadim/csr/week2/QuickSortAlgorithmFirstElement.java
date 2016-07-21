package by.vadim.csr.week2;

public class QuickSortAlgorithmFirstElement implements SortAlgorithm {
  
  private ChoosePivotStrategy pivotStrategy;
  
  public QuickSortAlgorithmFirstElement(ChoosePivotStrategy pivotStrategy) {
    this.pivotStrategy = pivotStrategy;
  }
  
  @Override
  public SortAlgorithmResult sortAndCalc(int[] a) {
    return sortAndCalc(a, 0, a.length);
  }
  
  public SortAlgorithmResult sortAndCalc(int[] a, int start, int end) {
    
    if (end - start <= 1) {
      return new QuickSortAlgorithmResult(0, a);
    }
    
    int pivotIndex = pivotStrategy.getPivot(a, start, end);
    pivotIndex = partition(a, pivotIndex, start, end);
    SortAlgorithmResult sortAndCalc = sortAndCalc(a, start, pivotIndex);
    SortAlgorithmResult sortAndCalc2 = sortAndCalc(a, pivotIndex, end);
    
    return new QuickSortAlgorithmResult(0, a);
  }
  
  private int partition(int[] a, int pivotIndex, int start, int end) {
    if (a.length < 2) {
      return pivotIndex;
    }
    int i = start + 1;
    for (int j = start + 1; j < end; j++) {
      if (a[j] < a[pivotIndex]) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
        i++;
      }
    }
    int t = a[i - 1];
    a[i - 1] = a[pivotIndex];
    a[pivotIndex] = t;
    return i;
  }
  
}
