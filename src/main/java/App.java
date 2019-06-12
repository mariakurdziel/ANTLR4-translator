import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {
  public static void main(String[] args) {
    String outputFile = "wynik.txt";
    String testCode =
        "#include <iostream.h>\n"
            + "\n"
            + "using namespace std;\n"
            + "\n"
            + "int fun(int a,int b){\n"
            + "  for(x=0;x<=3;x++){\n"
            + "   cout<<\"Hello world\"<<endl;\n"
            + "  }\n"
            + "  return 0;\n"
            + " }\n"
            + "\n"
            + " int main(int x){\n"
            + "   cin>>x>>endl;\n"
            + "   cout<<x<<endl;\n"
            + "   \n"
            + "   return x;\n"
            + "   \n"
            + "}";
    String testCodeFromFile = readFromFile("F:\\example2.txt");
    BufferedWriter bufferedWriter;
    BufferedWriter buf2;
    try {
      bufferedWriter = prepareOutput(outputFile);
      buf2 = prepareOutput("wynik_z_pliku.txt");
    } catch (IOException ex) {
      System.out.println("Problem z plikiem wyjsciowym");
      return;
    }

    Compiler.compileCode(testCode, bufferedWriter);
    Compiler.compileCode(testCodeFromFile, buf2);

    try {
      bufferedWriter.close();
      buf2.close();
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
