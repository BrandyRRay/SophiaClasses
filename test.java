import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class test {
  public static void main(String[] args) {
    File logsFile = new File("logs.txt");
    boolean fileDeleted = false;
    try {
      fileDeleted = Files.deleteIfExists(logsFile.toPath());
    }
    catch(IOException ex) {
      System.out.println("Error deleting file: " + logsFile.getName());
    }
    if(fileDeleted) {
      System.out.println(logsFile.getName() + " deleted.");
    }
    else {
      System.out.println(logsFile.getName() + " not deleted.");
    }
  }
}