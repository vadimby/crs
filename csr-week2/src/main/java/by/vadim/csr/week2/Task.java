package by.vadim.csr.week2;

public class Task {
  
  private static final String FILENAME = "QuickSort.txt";
  
  private SortAlgorithm algorithm;
  
  public Task(SortAlgorithm algorithm) {
    this.algorithm = algorithm;
  }
  
  public static void main(String[] args) throws Exception {
    
    test(new TestDataProviderFromConstant(new int[] { 1 }));
    
    test(new TestDataProviderFromConstant(new int[] { 1, 2 }));
    
    test(new TestDataProviderFromConstant(new int[] { 1, 2, 3 }));
    
    test(new TestDataProviderFromConstant(new int[] { 1, 3, 2 }));
    
    test(new TestDataProviderFromConstant(new int[] { 1, 2, 3, 4 }));
    
    test(new TestDataProviderFromConstant(new int[] { 2, 1, 4, 1 }));
    
    test(new TestDataProviderFromConstant(new int[] { 1, 3, 5, 2, 4, 6 }));
    
    test(new TestDataProviderFromConstant(new int[] { 8, 2, 4, 5, 7, 1 }));
    
    test(new TestDataProviderFromFile(FILENAME, new IntergerFileReader()));
    
    test(new TestDataProviderFromFile(FILENAME, new IntergerFileReader()));
    
  }
  
  private static void test(TestDataProvider data) {
    Task task = new Task(new QuickSortAlgorithmFirstElement(new ChoosePivotStrategy() {
      @Override
      public int getPivot(int[] a, int start, int end) {
        return start;
      }
    }));
    
    int[] array = data.getData();
    
    long result = task.calc(array);
    
    System.out.println(String.format("The result is:\t %s.", result));
  }
  
  public long calc(int[] array) {
    long numberOfComparisons = algorithm.sortAndCalc(array).getNumberOfComparisons();
    int p = 0;
    for (int i : array) {
      if (p != i - 1) {
        System.out.print(i + ", ");
      } else {
        p = i;
      }
    }
    
    return numberOfComparisons;
  }
  
  private int[] getArray2(String fileName) {
    return new int[] { 1, 3, 5, 2, 4, 6 };
  }
  
  private int[] getArray3(String fileName) {
    // return new int[] { 2, 1, 4, 3, 6, 5, 8, 7, 10, 9 };
    return new int[] { 54044, 14108, 79294, 29649, 25260, 60660, 2995, 53777, 49689, 9083, 16122, 90436, 4615, 40660,
        25675, 58943, 92904, 9900, 95588, 46120, 29390, 91323, 85363, 45738, 80717, 57415, 7637, 8540, 6336, 45434,
        65895, 61811, 8959, 9139, 31027, 87662, 2484, 65550, 23260, 15616, 3490, 49568, 5979, 44737, 52808, 72122,
        37957, 34826, 21419, 73531, 94323, 52910, 84496, 71799, 50162, 1692, 1565, 59279, 56864, 20141, 13893, 63942,
        6055, 33424, 44771, 25678, 33639, 27793, 41268, 1857, 63388, 32976, 46195, 61291, 61740, 61680, 45264, 76361,
        49243, 73250, 67432, 29124, 15198, 30626, 18950, 13857, 32569, 45179, 47696, 21283, 77169, 26357, 97885, 54741,
        57246, 61929, 25997, 45859, 3353, 32204, 97451, 60550, 49516, 38558, 57674, 36443, 666, 32486, 54910, 24666,
        45119, 40779, 3441, 83779, 60645, 63003, 59616, 7364, 69058, 41651, 12201, 13234, 19717, 11536, 70350, 15611,
        74484, 96153, 4127, 60035, 19418, 58613, 28590, 32917, 97780, 17644, 15836, 88046, 26489, 38410, 54618, 16967,
        81604, 60064, 5833, 80689, 43137, 57274, 8002, 4445, 42933, 75378, 15130, 10689, 98579, 42780, 38379, 76394,
        66337, 15126, 59535, 53639, 43182, 88220, 5506, 21939, 26719, 32919, 78383, 62297, 30677, 15301, 35277, 2240,
        37292, 11269, 92554, 12813, 63131, 25964, 15618, 11318, 72799, 43976, 4698, 32984, 5 };
  }
  
}
