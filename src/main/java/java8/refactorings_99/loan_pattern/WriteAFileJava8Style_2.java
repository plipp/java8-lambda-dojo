package java8.refactorings_99.loan_pattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.function.Consumer;

/**
 * Java code for writing a file before Java7
 */
public class WriteAFileJava8Style_2 {
  public static void use (String file, Consumer<FileWriter> writer) {
    // TODO
  }

  public static void writeTo(File tmpFile) throws IOException {
    // refactor to java8-style with loan-pattern (aka lender-lendee pattern)
  }

  public static void main(String[] args) throws IOException {
    File tmpFile = Files.createTempFile("fct", ".txt").toFile();
    writeTo(tmpFile);

    System.out.printf("File %s created", tmpFile);
    assert (tmpFile.isFile() && tmpFile.length()>0);
  }
}
