/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.*;

/**
 *
 * @author franlu
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando");
        
        // Creando la conexión
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/izv_dawm","izv_dawm","123456"); 
            String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 
            String query = "SELECT first, last from REGISTRATION";
            
            Statement stmt = null;
            try {
                stmt = con.createStatement();
                stmt.executeUpdate(sql);
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()){
                    String first = rs.getString("first");
                    String second = rs.getString("second");
                    
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            } finally {
                stmt.close();
                con.close();
            }
           
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch ( Exception e){
            e.printStackTrace();
        }
    }
    
}
