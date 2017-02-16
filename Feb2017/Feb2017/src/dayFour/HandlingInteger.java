package dayFour;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by student on 16/02/2017.
 */
public class HandlingInteger {
    public static void main (String[] args) {
        System.out.println("Enter a number between 1 and 10: ");

        while(true) {
            try {
                Scanner input = new Scanner(System.in);
                int yourNum = input.nextInt();

                if(yourNum < 1 || yourNum > 10)
                    throw new Exception("Number must be between 1 and 10.");

                System.out.println("Your number is valid: " + yourNum);
                break;
            } catch (InputMismatchException inputMis) {
                System.out.println("Please input a number");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Thank you for playing!");
            }

        }
    }
}
