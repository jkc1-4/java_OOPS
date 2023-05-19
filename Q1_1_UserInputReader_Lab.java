import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1_1_UserInputReader_Lab {
    public static void main(String[] args) throws IOException {
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(isReader);
        String name = bReader.readLine();
        System.out.println("Hello " + name + " this is input using InputstreamReader and BufferedReader class.");
    }
}
