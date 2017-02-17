package dayTwo.gui;

import dayTwo.models.Employee;
import dayTwo.processor.TaskProcessing;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static dayTwo.models.GeneratedEmployees.employees;

/**
 * Created by student on 14/02/2017.
 */
public class CommandInterface {
    static Scanner input = new Scanner(System.in);
    static boolean edit = false; //setting a flag for choice 3

    public static void display() {

        // temp int data to store user's choice
        int choice;
        boolean keep_running = true; //infinite loop in case user enters anything other than 1-6

        // give 6 options
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
                    try {
                        TaskProcessing.listAllEmployees();
                    } catch (SQLException ex1) {
                        System.out.println("Cannot query any record: " + ex1);
                    }
                    break;
                case 2:
                    System.out.println(TaskProcessing.createNew(inputDetails(null)));
                    break;
                case 3:
                    edit = true;
                    System.out.println("Enter search by first name: ");
                    input.nextLine();
                    try {
                        System.out.println(TaskProcessing.searchByFirstName(input.nextLine()));
                    } catch (SQLException ex2) {
                        System.out.print("Error search: " + ex2);
                    }
                    int index = input.nextInt();
                    System.out.println(TaskProcessing.editEmployee(index, inputDetails(employees.get(index))));
                    break;
                case 4:
                    System.out.print("Enter first name to search: ");
                    input.nextLine();
                    try {
                        System.out.println(TaskProcessing.searchByFirstName(input.nextLine()));
                    } catch (SQLException ex3) {
                        System.out.print("Error search: " + ex3);
                    }
                    System.out.print("Enter index to remove");
                    System.out.println(TaskProcessing.removeEmployee(input.nextInt()));
                    break;
                case 5:
                    System.out.print("Enter first name to search: ");
                    input.nextLine();
                    try {
                        System.out.println(TaskProcessing.searchByFirstName(input.nextLine()));
                    } catch (SQLException ex4) {
                        System.out.print("Enter index to edit");
                    }
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

        /*System.out.print("ID: " + (edit ? e.getId() + "\nChange: " : "")); // : what comes after if the condition is false
        tempEmployee.add(input.nextLine());*/

        tempEmployee.add("");
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
