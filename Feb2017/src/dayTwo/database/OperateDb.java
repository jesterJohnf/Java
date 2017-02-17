package dayTwo.database;

import dayTwo.models.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 16/02/2017.
 */
public class OperateDb {
    private Connection con;

    public OperateDb(Connection con) {
        this.con = con;
    }

    public void createEmployeeTable() throws SQLException {
        Statement statement = con.createStatement();

        //create table
        statement.executeUpdate(
          "CREATE TABLE employee (" +
                  "id INTEGER NOT NULL AUTO_INCREMENT KEY," +
                  "first_name VARCHAR(50) NOT NULL," +
                  "last_name VARCHAR(100) NOT NULL," +
                  "dob DATE NOT NULL," +
                  "hire_date DATE NOT NULL," +
                  "job_role VARCHAR(50) NOT NULL)"
        );
    }

    public List<Employee> queryAll() throws SQLException {
        return query("SELECT * FROM employee");

    }

    public List<Employee> queryByFirstName(String fn) throws SQLException {
        return query("SELECT * FROM employee WHERE first_name='" + fn + "'");
    }

    public List<Employee> query(String query) throws SQLException {
        Statement statement = con.createStatement();
        //Reference to the result object from queries
        ResultSet rs;

        Employee temp; //represents each role retrieved from result

        //our local temporary list of employees retrieved
        List<Employee> tempEmployees = new ArrayList<>();

        //***** get the result from DB
        rs = statement.executeQuery(query);

        //retrieve...from ResultSet object
        while(rs.next()) {
            temp = new Employee(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDate(4).toLocalDate(),
                    rs.getDate(5).toLocalDate(),
                    rs.getString(6));

            //add to our temp collection
            tempEmployees.add(temp);
        }

        return tempEmployees;
    }

    public void addEmployee(Employee temp) throws SQLException {
        PreparedStatement statement = con.prepareStatement(
                "INSERT INTO employee" +
                        "(first_name,last_name,dob,hire_date,job_role)" +
                        "VALUES (?,?,?,?,?)");

        statement.setString(1, temp.getFirstName());
        statement.setString(2, temp.getLastName());
        statement.setDate(3, Date.valueOf(temp.getDob()));
        statement.setDate(4, Date.valueOf(temp.getHireDate()));
        statement.setString(5, temp.getJobRole());

        //send to the DB to create new record!
        statement.executeUpdate();
        statement.close();
    }
}
