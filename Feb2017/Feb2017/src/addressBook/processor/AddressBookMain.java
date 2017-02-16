package addressBook.processor;

import addressBook.gui.CommInterface;
import addressBook.models.Contact;
import addressBook.models.GeneratedAddressBook;

import static addressBook.models.GeneratedAddressBook.contacts;

/**
 * Created by student on 14/02/2017.
 */
public class AddressBookMain {
    public static void main(String [] args) {

        GeneratedAddressBook.createContacts();

        CommInterface.display();

    }

}
