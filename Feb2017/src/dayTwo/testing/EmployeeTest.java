package dayTwo.testing;

import dayTwo.database.ConnectDb;
import dayTwo.database.OperateDb;
import dayTwo.models.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by student on 17/02/2017.
 */
public class EmployeeTest {

    //set the environment (prepare)
    public List<Employee> testEmployees = new ArrayList<>();

    //database connection variables
    private ConnectDb connectDb;
    private OperateDb db;

    //general search method in List testEmployees using Predicate
    public List<Employee> search(Predicate<Employee> p) {
        List<Employee> result = new ArrayList<>();
        for(Employee e : testEmployees) {
            if(p.test(e))
                result.add(e);
        }
        return result;
    }

    @Before //always execute before any TEST CASE
    public void setUpDbConnection() throws Exception {
        connectDb = new ConnectDb();
        db = new OperateDb(connectDb.getCon());
    }

    //TEST CASES
    @Test
    public void canRetrieveFromDb() {
        //GIVEN
        if(testEmployees.isEmpty())
            System.out.println("Collection is ready to collect from DB");

        //WHEN
        try {
            testEmployees = db.queryAll();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        List<Employee> result;
        result = search(employee -> employee.getFirstName().equalsIgnoreCase("shar"));

        //THEN

        //test whether records have been retrieved from db
        Assert.assertTrue("TestEmployee is empty!", !testEmployees.isEmpty());

        //test whether shar exists
        Assert.assertEquals("Shar does not exist!", "Shar", result.get(0).getFirstName());
    }


    @After
    public void finale() {
        System.out.println("Thank you for testing...");
    }
}
