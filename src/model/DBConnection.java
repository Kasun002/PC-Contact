/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kasun
 */
public class DBConnection {

    private String url="jdbc:mysql://localhost/address_book";
    private String user="root";
    private String pass="";
    
    private static Connection con=null;
    private static DBConnection dbc=null;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url, user, pass);
    }
    private static DBConnection createConnection() throws ClassNotFoundException, SQLException{
        if (con==null) {
            dbc=new DBConnection();
        } 
        return dbc;
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        return createConnection().con;
    }

}
