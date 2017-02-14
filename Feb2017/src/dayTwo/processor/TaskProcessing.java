package dayTwo.processor;

import dayTwo.models.Employee;

import java.time.LocalDate;
import java.util.List;

import static dayTwo.models.GeneratedEmployees.employees;

/**
 * Created by student on 14/02/2017.
 */
public class TaskProcessing {
    public static void listAllEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }


    // createNew employee method
    public static String createNew(List<String> data) {
        try {
            String[] dob = data.get(3).split("/");
            String[] hd = data.get(4).split("/");

            Employee temp = new Employee(
                    Integer.parseInt(data.get(0)),
                    data.get(1),
                    data.get(2),
                    LocalDate.of(Integer.parseInt(dob[0]), //year
                            Integer.parseInt(dob[1]), //month
                            Integer.parseInt(dob[2])), // day
                    LocalDate.of(Integer.parseInt(hd[0]), //year
                            Integer.parseInt(hd[1]), //month
                            Integer.parseInt(hd[2])), // day
                    data.get(5)
            );

            employees.add(temp);
            return "SUCCESSFULLY created: " + temp.getFirstName();
        } catch (Exception e) {
            return "FAILURE caused by: " + e;
        }
    }

    // searchByFirstName method
    public static String searchByFirstName(String fn) {
        String result = "";
        for(int i = 0; i < employees.size(); i++) {
            //compare
            if(employees.get(i).getFirstName().equalsIgnoreCase(fn))
                result += employees.get(i).toString() + "\n";
        }
        if(result != "")
            return result;

        return "NOT FOUND!";
    }
}
