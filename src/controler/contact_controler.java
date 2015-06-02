/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DBConnection;
import model.DBHandel;
import model.contact_model;

/**
 *
 * @author Kasun
 */
public class contact_controler {

    public static void add_contact(contact_model a) {
        try {

            Connection connection = DBConnection.getConnection();
            String add_contact_quary = "INSERT INTO contact VALUES ('" + a.getId() + "','" + a.getName() + "','" + a.getAddress() + "','" + a.getMobile() + "','" + a.getHome() + "','" + a.getEmail() + "','" + a.getOther() + "')";
            int res = DBHandel.setData(connection, add_contact_quary);

            if (res != 0) {
                JOptionPane.showMessageDialog(null, "New Contact Created");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Create contact fail");
        }
    }

    public static ArrayList<contact_model> getContactByName(String Name) throws ClassNotFoundException, SQLException, Exception { 
        String qry = "Select * from contact where name LIKE '%" + Name + "%'";
        Connection con = DBConnection.getConnection();
        ResultSet rst = DBHandel.getData(con, qry);
        ArrayList<contact_model> ar = new ArrayList<contact_model>();
        while (rst.next()) {
            String id = rst.getString(1);
            String name = rst.getString(2);
            String address = rst.getString(3);
            String mobile = rst.getString(4);
            String home = rst.getString(5);
            String email = rst.getString(6);
            String other = rst.getString(7);

            contact_model i = new contact_model(id, name, address, mobile, home, email, other);
            ar.add(i);
        }
        return ar;
    }
    
    
    public static ArrayList<contact_model> getContactByMobile(String Name) throws ClassNotFoundException, SQLException, Exception {
        String qry = "Select * from contact where mobile LIKE '%" + Name + "%'";
        Connection con = DBConnection.getConnection();
        ResultSet rst = DBHandel.getData(con, qry);
        ArrayList<contact_model> ar = new ArrayList<contact_model>();
        while (rst.next()) {
            String id = rst.getString(1);
            String name = rst.getString(2);
            String address = rst.getString(3);
            String mobile = rst.getString(4);
            String home = rst.getString(5);
            String email = rst.getString(6);
            String other = rst.getString(7);

            contact_model i = new contact_model(id, name, address, mobile, home, email, other);
            ar.add(i);
        }
        return ar;
    }
    
    public static void updateContact(contact_model i) throws ClassNotFoundException, SQLException {

        try {
            Connection con = DBConnection.getConnection();
            String qry = "UPDATE contact set name='"+i.getName()+"',address='"+i.getAddress()+ "',mobile='"+i.getMobile()+"',home='"+i.getHome()+"',email='"+i.getEmail()+"',email='"+i.getOther()+"'where id='"+i.getId()+"'";
            int res = DBHandel.setData(con, qry);
            if (res != 0) {
                JOptionPane.showMessageDialog(null, "Update Contact successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Update Error");
            }
        } catch (Exception e) {

            System.out.println(e);
        }
    }
    
    
    public static void deleteContact(contact_model c) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "DELETE FROM contact WHERE id='" + c.getId() + "'";
            int res = DBHandel.setData(con, query);
            if (res != 0) {
                JOptionPane.showMessageDialog(null, "Delete Contact Successfuly");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Contact to delete");
        }
    }
    
}
