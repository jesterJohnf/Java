package dayTwo.models;

import java.time.LocalDate;

/**
 * Created by student on 14/02/2017.
 */

// Employee is A Person
public class Employee extends Person{
    private LocalDate hireDate;
    private String jobRole;

    //getters and setters
    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    //constructor
    public Employee(int id, String fn, String ln, LocalDate dob, LocalDate hireDate, String jobRole) {
        super(id,fn,ln,dob); // calls the person class constructor to create an employee
        this.hireDate = hireDate;
        this.jobRole = jobRole;

    }

    // to print output on cmd line
    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "hireDate=" + hireDate +
                ", jobRole='" + jobRole + '\'' +
                '}';
    }
}

