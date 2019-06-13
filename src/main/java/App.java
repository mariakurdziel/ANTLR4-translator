import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {
  public static void main(String[] args) {

    String testCodeFromFile = readFromFile("example1.txt");
    BufferedWriter bufferedWriter;
    try {
      bufferedWriter = prepareOutput("wynik_z_pliku.txt");
    } catch (IOException ex) {
      System.out.println("Problem z plikiem wyjsciowym");
      return;
    }

    /*Compiler.compileCode(testCode, bufferedWriter);*/
    Compiler.compileCode(testCodeFromFile, bufferedWriter);

    try {
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static BufferedWriter prepareOutput(String path) throws IOException {
    FileWriter writer = new FileWriter(path);
    return new BufferedWriter(writer);
  }

  private static String readFromFile(String fileName) {
    final StringBuilder builder = new StringBuilder();
    try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)) {
      stream.forEach(s -> builder.append(s).append("\n"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return builder.toString();
  }
}
