import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String outputFile = "wynik.txt";
        String testCode = "#include <iostream.h>\n" +
                "\n" +
                "using namespace std;\n" +
                "\n" +
                "int fun(int a,int b){\n" +
                "  for(x=0;x<=3;x++){\n" +
                "   cout<<\"Hello world\"<<endl;\n" +
                "  }\n" +
                "  return 0;\n" +
                " }\n" +
                "\n" +
                " int main(int x){\n" +
                "   cin>>x>>endl;\n" +
                "   cout<<x<<endl;\n" +
                "   \n" +
                "   return x;\n" +
                "   \n" +
                "}";
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
