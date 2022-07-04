/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.sql.*;

public class Conexion {
private static final String url= "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";    
private static final String user = "root";
private static final String password = "";

//creo el objeto Connection en un metodo getConnection
public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(url,user,password);
    
}
//mando a ejecutar el resultado con rs
public static void close(ResultSet rs) throws SQLException{
    rs.close();
}
//mando a inicializar la sentencia
public static void close(Statement st)throws SQLException {
        
}
//mando a inicializar la sencencia SQL
public static void close(PreparedStatement pst)throws SQLException {
        
}
//mando a cerrar la conexion
public static void close(Connection con)throws SQLException {
   con.close();
}

}
