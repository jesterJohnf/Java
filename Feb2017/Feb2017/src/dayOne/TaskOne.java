package dayOne;

import java.util.Scanner;

/**
 * Created by student on 13/02/2017.
 */
public class TaskOne {

    public static void main (String[] args) {

        // Getting user input string
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a number:");

        int result = input.nextInt();

        if (result <= 100) {
            System.out.println("The number inputted is less than or equal to 100.");
        }else if (result <= 500) {
            System.out.println("The number inputted is less than or equal to 500.");
        }else if (result <= 1000) {
            System.out.println("The number inputted is less than or equal to 1000.");
        }else if (result >= 1000) {
            System.out.println("The number inputted is more that 1000 or beyond our scope.");
        }


    }
}
