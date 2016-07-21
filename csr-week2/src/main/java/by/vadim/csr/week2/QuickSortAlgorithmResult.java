package by.vadim.csr.week2;

public class QuickSortAlgorithmResult implements SortAlgorithmResult {
  
  private long numberOfComparisons;
  private int[] sortedArray;
  
  public QuickSortAlgorithmResult(long numberOfComparisons, int[] sortedArray) {
    this.numberOfComparisons = numberOfComparisons;
    this.sortedArray = sortedArray;
  }
  
  @Override
  public long getNumberOfComparisons() {
    return numberOfComparisons;
  }
  
  public int[] getSortedArray() {
    return sortedArray;
  }
  
}
