package java8.refactorings_99.loan_pattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Java code for writing a file before Java7
 */
public class WriteAFileJava7Style_1 {
  public static void writeTo(File tmpFile) throws IOException {

    // TODO refactor to java7-style: Automatic Resource Management

    FileWriter fileWriter = new FileWriter(tmpFile);
    try {
      fileWriter.write("Bla"); // ....
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fileWriter.close();
      } catch (IOException ignore) {
        // ignore
      }
    }
  }

  public static void main(String[] args) throws IOException {
    File tmpFile = File.createTempFile("fct", ".txt");
    writeTo(tmpFile);

    System.out.printf("File %s created", tmpFile);
    assert (tmpFile.isFile() && tmpFile.length()>0);
  }
}
