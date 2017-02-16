package dayOne;

import java.util.Scanner;

/**
 * Created by student on 13/02/2017.
 */
public class TaskTwo {

    public static void main (String[] args) {

        // Getting user input string
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a character:");

        char result = input.next().charAt(0);

        if(Character.isUpperCase(result)) {
            System.out.println("The character inputted is a upper case character.");
        }else if(Character.isLowerCase(result)) {
            System.out.println("The character inputted is a lower case character.");
        }else if (Character.isDigit(result)) {
            System.out.println("The character inputted is a number.");
        }else
            System.out.println("The character inputted is not a letter or a number.");

    }


}
