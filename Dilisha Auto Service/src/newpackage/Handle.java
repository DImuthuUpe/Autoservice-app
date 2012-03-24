/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




/**
 *
 * @author Student
 */
public class Handle {
    public static ResultSet getData(Connection c, String query) throws SQLException{
        Statement stm= c.createStatement();
        ResultSet rst= stm.executeQuery(query);
        return rst;   
    }

    public static void setData(Connection c, String query) throws SQLException{
        Statement stm = c.createStatement();
        stm.executeUpdate(query);
    }
}
