package dayTwo.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 14/02/2017.
 */
public class GeneratedEmployees {

    // List - sequence of objects stored with index
    public static List<Employee> employees = new ArrayList<>();

    public static void createEmployees() {
        Employee jester = new Employee(1, "Jester", "Facunla", LocalDate.of(1987,1,4), LocalDate.of(2017,1,1), "Design Consultant");

        Employee dominic = new Employee(2, "Dominic", "Facunla", LocalDate.of(1991,3,23), LocalDate.of(2016,12,1), "Design Consultant");

        employees.add(jester); // index 0
        employees.add(dominic); // index 1

    }
}
