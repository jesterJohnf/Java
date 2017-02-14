package dayTwo.gui;

import dayTwo.models.Employee;
import dayTwo.processor.TaskProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 14/02/2017.
 */
public class CommandInterface {
    static Scanner input = new Scanner(System.in);
    static boolean edit = false;

    public static void display() {

        // temp int data to store user's choice
        int choice;
        boolean keep_running = true;

        // give user 6 options
        while(keep_running) {
            do {
                // choices
                System.out.println("Welcome to Employee Program");
                System.out.println("1. List all Employees");
                System.out.println("2. Add New Employee");
                System.out.println("3. Edit an Employee");
                System.out.println("4. Remove an Employee");
                System.out.println("5. Search");
                System.out.println("6. Terminate");
                System.out.print("Please input option between 1-6");

                choice = input.nextInt();
            } while(choice < 1 || choice > 6); // doWhile loop, program will keep on running if user inputs < 1 or > 6

            // switch
            switch(choice) {
                case 1:
                    TaskProcessing.listAllEmployees();
                    break;
                case 2:
                    System.out.println(TaskProcessing.createNew(inputDetails(null)));
                    break;
                case 3:
                    edit = true;
                    break;
                case 5:
                    System.out.print("Enter first name to search: ");
                    input.nextLine();
                    System.out.println(TaskProcessing.searchByFirstName(input.nextLine()));
                    break;
                case 6:
                    keep_running = false;


            }
        }
    }

    static List<String> inputDetails(Employee e) { // specify's what is returning

        // local temp employee string data
        List<String> tempEmployee = new ArrayList<>();
        input.nextLine();

        System.out.print("ID: " + (edit ? e.getId() + "\nChange: " : "")); // : what comes after if the condition is false
        tempEmployee.add(input.nextLine());

        System.out.print("First Name: " + (edit ? e.getFirstName() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());

        System.out.print("Last Name: " + (edit ? e.getLastName() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());

        System.out.print("DOB (YYYY/MM/DD): " + (edit ? e.getDob().toString() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());

        System.out.print("HireDate: (YYYY/MM/DD) " + (edit ? e.getHireDate() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());

        System.out.print("Job Role: " + (edit ? e.getJobRole() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());

        edit = false;
        return tempEmployee;

    }
}
