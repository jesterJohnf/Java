package computerShop.models;

/**
 * Created by student on 17/02/2017.
 */
public class Person {
    // Fields
    private String firstName;
    private String lastName;



    public Person() {
        firstName = "";
        lastName = "";
    }

    // Constructor
    public Person (String fn, String ln) {
        fullName(fn, ln);

    }

    // To string
    public String toString () {
        return (firstName + " " + lastName);
    }

    public void fullName (String first, String last) {
        firstName = first;
        lastName = last;

    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
