package dayTwo.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by student on 16/02/2017.
 */
public class ConnectDb {
    private Connection con;

    //connection strings variables
    private String userName = "awesome";
    private String password = "Password100";
    private String url = "jdbc:mysql://localhost:3306/boom?UseSSL=false";

    public ConnectDb() throws Exception {
        //load the driver before connecting to the db
        Class.forName("com.mysql.jdbc.Driver");

        //connect to database
        con = DriverManager.getConnection(url,userName,password);
    }

    public Connection getCon() {
        return con;
    }
}
