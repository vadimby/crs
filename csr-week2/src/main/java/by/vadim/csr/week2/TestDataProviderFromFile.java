package by.vadim.csr.week2;

public class TestDataProviderFromFile implements TestDataProvider {
  
  private final String filename;
  private final IntergerFileReader intergerFileReader;
  
  public TestDataProviderFromFile(String filename, IntergerFileReader intergerFileReader) {
    this.filename = filename;
    this.intergerFileReader = intergerFileReader;
  }
  
  @Override
  public int[] getData() {
    return intergerFileReader.read(filename);
  }
  
}
