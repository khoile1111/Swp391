/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;
/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
   public static Connection makeConnection() throws Exception {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=ProjectPRJ;User=sa;Password=nguyen2104";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(connectionUrl);
        return con;
    }
}

