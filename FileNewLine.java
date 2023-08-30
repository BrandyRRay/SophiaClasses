import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class FileNewLine {
  public static void main(String[] args) {
    File flowerFile = new File("flowers.txt");
    try {
      //Write each line without added new line
      Files.writeString(flowerFile.toPath(), "Roses are red\n", StandardOpenOption.CREATE);
      Files.writeString(flowerFile.toPath(), "Daisys are yellow\n", StandardOpenOption.APPEND);
    }
    catch(IOException ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}