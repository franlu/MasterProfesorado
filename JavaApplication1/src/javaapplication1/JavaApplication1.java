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
            Connection conexion = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/izv_dawm","izv_dawm","123456"); 
        }
        catch ( Exception e){
            e.printStackTrace();
        }
        
        /**
        public static void createEquipo(Connection con, String DBNombre) throws SQLException {
            String createString = "create table " + DBNombre + ".EQUIPO " +
                                    "(TEAM_ID integer NOT NULL," +
                                    "PRIMARY KEY (TEAM_ID))";
            
            //Objeto para tirar sentencias a la DB
            Statement stmt = null;
            try {
                stmt = con.createStatement();
                stmt.executeUpdate(createString);
            }
            catch (SQLException e){
                e.printStackTrace();
            } finally {
                stmt.close();
            }
        }
        
        public static void verEquipo(Connection con, String DBNombre) throws SQLException {
            Statement stmt = null;
            String query = "SELECT EQ_Nombre from " + DBNombre + ".EQUIPO";
            try {
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()){
                    String equipo = rs.getString("EQ_Nombre");
                    
                }
            } catch (SQLException e) {
                e.printStrackTrace();
            } finally {
                stmt.close();
            }
        
        }**/
    }
    
}
