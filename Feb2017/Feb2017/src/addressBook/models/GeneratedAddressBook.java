package addressBook.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 14/02/2017.
 */
public class GeneratedAddressBook {

    // List
    public static List<Contact> contacts = new ArrayList<>();

    public static void createContacts() {
        Contact con1 = new Contact(1, new Person("Jester", "Facunla"), new Address("115 Brodick House", "Saxon Road", "London", "E35HJ"), "07889395094", "thefastfili@hotmail.com");

        contacts.add(con1);

    }
}
