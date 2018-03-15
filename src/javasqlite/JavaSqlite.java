/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author MAHBUB
 */
public class JavaSqlite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentUI studentUI = new StudentUI();
        studentUI.setVisible(true);
//        connectDB();
    }

    public static Connection connectDB() {
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\MAHBUB\\Documents\\testDB.sqlite");
//            JOptionPane.showMessageDialog(null, "Connection established");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return connection;
    }
}
