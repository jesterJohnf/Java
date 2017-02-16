package addressBook.processor;

import addressBook.models.Contact;

import static addressBook.models.GeneratedAddressBook.contacts;

/**
 * Created by student on 14/02/2017.
 */
public class TaskPro {
    public static void listAllContacts() {
        for(Contact c : contacts) {
            System.out.println(c);
        }
    }
}
