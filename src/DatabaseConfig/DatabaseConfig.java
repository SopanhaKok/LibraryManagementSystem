package DatabaseConfig;

import java.sql.*;

public class DatabaseConfig {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/library?useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";

    //static method that creates a connection to the database and return the connection object
    public static Connection Connection(){
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        }catch (ClassNotFoundException ex){
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }catch(SQLException ex){
            System.out.println("Error: unable to connect to database");
            System.exit(1);
        }
        return conn;
    }

    //close connection
    public static void closeConnection(Connection conn){
        try{
            conn.close();
        }catch(SQLException ex){
            System.out.println("Error: unable to close connection");
            System.exit(1);
        }
    }
}
