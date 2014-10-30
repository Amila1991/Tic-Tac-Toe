/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Amila
 */
public class DBHandle {
    
    public static ResultSet getData(Connection conn, String query) throws SQLException{
        Statement stm=conn.createStatement();
        return stm.executeQuery(query);
    }
    
    public static int setData(Connection conn, String query) throws SQLException{
        Statement stm=conn.createStatement();
        return stm.executeUpdate(query);
    }
}
