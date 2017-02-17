package dayTwo.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by student on 14/02/2017.
 */
public class Person {
    // members: fields, properties, methods, constructors

    // fields
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int NOT_BORN = 0;

    // properties (getters and setters)
    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }

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
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // constructors (new...)


    // overloaded constructor
    public Person(int id, String fn, String ln, LocalDate dob) {
        this.firstName = fn;
        this.lastName = ln;
        this.dob = dob;
    }

    public Person(LocalDate dob) {
        this.dob = dob;
    }

    // methods
    public long getAge() {
        if(dob == null)
            return NOT_BORN; // no need for else statement here!

        long years = ChronoUnit.YEARS.between(dob, LocalDate.now());
        return years;
    }

    @Override // annotation - this method defined in Object class (basic example of polymorphism)
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", NOT_BORN=" + NOT_BORN +
                '}';
    }
}
