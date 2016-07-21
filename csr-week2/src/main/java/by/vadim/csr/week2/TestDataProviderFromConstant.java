package by.vadim.csr.week2;

public class TestDataProviderFromConstant implements TestDataProvider {
  
  private final int[] is;

  public TestDataProviderFromConstant(int[] is) {
    this.is = is;
  }

  @Override
  public int[] getData() {
    return is;
  }
  
}
