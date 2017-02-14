package addressBook.models;

/**
 * Created by student on 14/02/2017.
 */
public class Contact {

    private Person person;
    private Address address;
    private String mobileNumber;
    private String emailAddress;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Contact(int i, Person person, Address address, String mobileNumber, String emailAddress) {
        this.person = person;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "person=" + person +
                ", address=" + address +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
