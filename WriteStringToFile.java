import java.io.*;
import java.nio.*;
import java.nio.file.*;
//import java.util.ArrayList;

class WriteStringToFile {
  public static void main(String[] args) {
    File output = new File("output.txt");
    try {
      //Try writing 2 lines to the file in StandardOpenOption.CREATE mode
      Files.writeString(output.toPath(), "Hello ya'll", StandardOpenOption.CREATE);
      Files.writeString(output.toPath(), "bargin chow butt bombs", StandardOpenOption.CREATE);
    }
    catch(IOException ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}