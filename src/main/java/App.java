import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String outputFile = "wynik.cpp";
        String testCode = "cout<<Eloszki<<endl;";
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = prepareOutput(outputFile);
        }catch (IOException ex){
            System.out.println("Problem z plikiem wyjsciowym");
            return;
        }

        Compiler.compileCode(testCode,bufferedWriter);

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
}
