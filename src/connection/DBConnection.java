/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Amila
 */
public class DBConnection {
    private final static String URL="jdbc:mysql://localhost:3306/tictactoe";
    private final static String USERNAME="root";
    private final static String PASSWORD="ijse";

    private static Connection conn=null;
    private static DBConnection dbconn=null; 
            
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    
    private static DBConnection getConnection() throws ClassNotFoundException, SQLException{
        if(dbconn==null){
            dbconn=new DBConnection();
        }
        return dbconn;
    }
    
    public static Connection getConnectionToDB() throws ClassNotFoundException, SQLException{
        return getConnection().conn;
    }
    
//    public static void main(String[] args) {
//        try {
//            System.out.println(getConnectionToDB()+"");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
}
