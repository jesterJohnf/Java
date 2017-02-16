package dayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Created by student on 13/02/2017.
 */
public class BasicInputOutput {

    public static void main (String[] args) {
        // Getting user input string
        Scanner input = new Scanner(System.in);

        // Read a line and return a value to result String object
        System.out.println("Using Scanner: " + input.nextLine());

        // BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result2 = "";
        try {
            result2 = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Using BufferedReader: " + result2);

    }
}
