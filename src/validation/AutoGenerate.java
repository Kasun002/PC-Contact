package validation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.NumberFormat;
import model.DBConnection;
import model.DBHandel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class AutoGenerate {

    public static String getNextID(String table, String column, String prefix) {
        String id = prefix + "0000";
        try {
            Connection con = DBConnection.getConnection();
            ResultSet rst = DBHandel.getData(con, "SELECT " + column + " FROM " + table + " ORDER BY 1 DESC Limit 1");
            while (rst.next()) {
                id = rst.getString(1);
            }
            int index = 0;
            for (int i = id.length() - 1; i >= 0; i--) {
                try {
                    Integer.parseInt(id.substring(i));
                } catch (Exception e) {
                    index = i + 1;
                    break;
                }
            }
            String newID = id.substring(index);
            int n = Integer.parseInt(newID);
            n++;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(3);
            nf.setGroupingUsed(false);//no more  100,000
//            nf.setMaximumFractionDigits(2);   nf.setMinimumFractionDigits(2) ;//
            id = id.substring(0, index) + nf.format(n);
        } catch (Exception ex) {
        }
        return id;
    }
}
