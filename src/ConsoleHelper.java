import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleHelper {

    public static String readInputText() {
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

    public static void writeMessage(String message) {
        System.out.println(message);
    }
}
