package by.vadim.csr.week2;

import org.junit.Before;
import org.junit.Test;

public class QuickSortAlgorithmMidElementTest {
  
  private static final String SOURCE_FILENAME = "QuickSort.txt";
  
  private Task task;
  
  @Before
  public void setup() {
    task = new Task(new QuickSortAlgorithmMidElement());
  }
  
  @Test
  public void test1() {
    
    test(new TestDataProviderFromConstant(new int[] { 1 }));
    
  }
  
  @Test
  public void test2() {
    
    test(new TestDataProviderFromConstant(new int[] { 1, 2 }));
    
  }
  
  @Test
  public void test3() {
    
    test(new TestDataProviderFromConstant(new int[] { 1, 2, 3 }));
    
  }
  
  @Test
  public void test4() {
    
    test(new TestDataProviderFromConstant(new int[] { 1, 3, 2 }));
    
  }
  
  @Test
  public void test5() {
    
    test(new TestDataProviderFromConstant(new int[] { 1, 2, 3, 4 }));
    
  }
  
  @Test
  public void test6() {
    
    test(new TestDataProviderFromConstant(new int[] { 2, 1, 4, 1 }));
    
  }
  
  @Test
  public void test7() {
    
    test(new TestDataProviderFromConstant(new int[] { 1, 3, 5, 2, 4, 6 }));
    
  }
  
  @Test
  public void test8() {
    
    test(new TestDataProviderFromConstant(new int[] { 8, 2, 4, 5, 7, 1 }));
    
  }
  
  @Test
  public void test9() {
    
    test(new TestDataProviderFromFile(SOURCE_FILENAME, new IntergerFileReader()));
    
  }
  
  @Test
  public void test10() {
    
    test(new TestDataProviderFromFile(SOURCE_FILENAME, new IntergerFileReader()));
    
  }
  
  private void test(TestDataProvider data) {
    
    long result = task.calc(data.getData().clone());
    
    System.out.println(String.format("The result is:\t %s.", result));
  }
  
}
