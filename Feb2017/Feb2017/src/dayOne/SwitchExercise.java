package dayOne;

import java.util.Scanner;

/**
 * Created by student on 13/02/2017.
 */
public class SwitchExercise {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input 2 numbers and one operator" + "(+,-,*,/) with space between those:");

        String[] result = input.nextLine().split(" ");

        System.out.println(compute(result));
     }

     // Using Integer class
     static int compute(String[] result) {
         int op1 = Integer.parseInt(result[0]);
         int op2 = Integer.parseInt(result[1]);

         int outcome = 0;

         // Using a Switch statement
         switch(result[2]) {
             case "+":
                 outcome = op1 + op2;
                 break;
             case "-":
                 outcome = op1 - op2;
                 break;
             case "*":
                 outcome = op1 * op2;
                 break;
             case "/":
                 outcome = op1 / op2;
                 break;
         }
         return outcome;

     }

}
