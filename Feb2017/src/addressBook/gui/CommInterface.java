package addressBook.gui;

import addressBook.processor.TaskPro;


import java.util.Scanner;

/**
 * Created by student on 14/02/2017.
 */
public class CommInterface {
    static Scanner input = new Scanner(System.in);

    public static void display() {

        // temp int data to store user's choice
        int choice;
        boolean keep_running = true;

        // give user 6 options
        while(keep_running) {
            do {
                // choices
                System.out.println("Welcome to the Address Book");
                System.out.println("1. List all Contacts");
                System.out.println("2. Add New Contact");
                System.out.println("3. Edit a Contact");
                System.out.println("4. Remove a Contact");
                System.out.println("5. Search");
                System.out.println("6. Terminate");
                System.out.print("Please input option between 1-6");

                choice = input.nextInt();
            } while(choice < 1 || choice > 6); // doWhile loop, program will keep on running if user inputs < 1 or > 6

            // switch
            switch(choice) {
                case 1:
                    TaskPro.listAllContacts();
                    break;
                case 6:
                    keep_running = false;


            }
        }
    }
}

