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
            if(employees.get(i).getFirstName().equalsIgnoreCase(fn)) //this method uses a string comparison method from java library (equalsIgnoreCase)

                result += String.format("[%s] %s", i, employees.get(i).toString()) + "\n"; //result for getFirstName modified so that when removeEmployee method called employees are shown by index
        }
        if(result != "")
            return result;

        return " EMPLOYEE NOT FOUND!";
    }

    //removeEmployee method
    public static String removeEmployee(int index) {
        try {
            employees.remove(index);
            return "EMPLOYEE SUCCESSFULLY REMOVED!";
        } catch (Exception e) {
            return "FAILED to remove caused by: " + e;
        }
    }

    //editEmployee method
    public static String editEmployee(int index, List<String> data) {
        try {
            String[] dob = data.get(3).split("/");
            String[] hd = data.get(4).split("/");

            //check data to map whether to change or not
            if(!("".equals(data.get(0))))
                employees.get(index).setId(Integer.parseInt(data.get(0)));
            if(!("".equals(data.get(1))))
                employees.get(index).setFirstName(data.get(1));
            if(!("".equals(data.get(2))))
                employees.get(index).setLastName(data.get(0));
            if(!("".equals(data.get(3))))
                employees.get(index).setDob(
                        LocalDate.of(Integer.parseInt(dob[0]), //year
                                Integer.parseInt(dob[1]), //month
                                Integer.parseInt(dob[2])) // day
                );
            if(!("".equals(data.get(4))))
                employees.get(index).setHireDate(
                        LocalDate.of(Integer.parseInt(hd[0]), //year
                                Integer.parseInt(hd[1]), //month
                                Integer.parseInt(hd[2])) // day
                );
            if(!("".equals(data.get(5))))
                employees.get(index).setJobRole(data.get(5));

            return "EMPLOYEE SUCCESSFULLY EDITED!";
        } catch (Exception e) {
            return "FAIL caused by: " + e;
        }
    }


}
