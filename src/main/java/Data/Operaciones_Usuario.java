
package Data;
import static Data.Conexion.*;

import Domain.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Operaciones_Usuario {
    
    private static final String SQL_Select = "SELECT id_usuario, nameUsuario, lastnameUsuario, describeUsuario, recomendUsuario, featureUsuario, improveUsuario, commentUsuario FROM usuario";
    private static final String SQL_Insert = "INSERT INTO usuario(nameUsuario, lastnameUsuario, describeUsuario, recomendUsuario, featureUsuario, improveUsuario, commentUsuario) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_Delete = "DELETE FROM usuario ";
    private static final String SQL_Update = "UPDATE usuario SET nameUsuario = ?, lastnameUsuario = ?, describeUsuario = ?, recomendUsuario = ?, featureUsuario = ?, improveUsuario = ?, commentUsuario = ? WHERE id_usuario = ?";
    private static final String SQL_Delete2 = "DELETE FROM usuario WHERE id_usuario = ?";

    
    
    
    public List<Usuario>seleccionar() throws SQLException{
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();
        String resultado;
        
        try {
             con = Conexion.getConnection();
             pst = con.prepareStatement(SQL_Select);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 
                 
                 int idUsuario = rs.getInt("id_usuario");
                 String nameUsu = rs.getString("nameUsuario");
                 String lastnameUsu = rs.getString("lastnameUsuario");
                 String describeUsu = rs.getString("describeUsuario");
                 String recomendUsu = rs.getString("recomendUsuario");
                 String featureUsu = rs.getString("featureUsuario");
                 String improveUsu = rs.getString("improveUsuario");
                 String commentUsu = rs.getString("commentUsuario");

                 
                 Usuario usu = new Usuario(idUsuario, nameUsu, lastnameUsu, describeUsu, recomendUsu, featureUsu, improveUsu, commentUsu);
                 
                 usuarios.add(usu);
             }
             
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }finally{
         
            //podemos quitar el nombre de la clase porque ya importamos los metodos estaticos
         close(rs);
         Conexion.close(pst);
         Conexion.close(con);
         
        }
       
        return usuarios;
        
    }
    
    
    public int insertarUsuario(Usuario usuario) throws SQLException{
        //nos va indicar cuantos registros se han modificado
        
        Connection con = null;
        PreparedStatement pst = null;
        int registro = 0;
        try {
            //ya no llamo a la clase Conexion por la primera linea
             con = getConnection();
             pst = con.prepareStatement(SQL_Insert);
             pst.setString(1, usuario.getNameUsuario());
             pst.setString(2, usuario.getLastnameUsuario());
             pst.setString(3, usuario.getDescribeUsuario());
             pst.setString(4, usuario.getRecomendUsuario());
             pst.setString(5, usuario.getFeatureUsuario());
             pst.setString(6, usuario.getImproveUsuario());
             pst.setString(7, usuario.getCommentUsuario());
             
             //procedo a ejecutar
             registro = pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "inserccion exitosa");
             
        } catch (Exception e) {
            
            
        }finally{
            //cierro las variables SQL
                close(pst);
                close(con);
        }
       
        return registro;
        
    }
    
    
    
    public int actualizarUsuario(Usuario usuario) throws SQLException{
        Connection con = null;
        PreparedStatement pst = null;
        int indentificador = 0;
        
        try {
            con = getConnection();
            pst = con.prepareStatement(SQL_Update);
            pst.setString(1, usuario.getNameUsuario());
            pst.setString(1, usuario.getNameUsuario());
            pst.setString(2, usuario.getLastnameUsuario());
            pst.setString(3, usuario.getDescribeUsuario());
            pst.setString(4, usuario.getRecomendUsuario());
            pst.setString(5, usuario.getFeatureUsuario());
            pst.setString(6, usuario.getImproveUsuario());
            pst.setString(7, usuario.getCommentUsuario());
            pst.setInt(8, usuario.getId_usuario());
            
            indentificador = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return indentificador;
    }
    
    
//    public int borrarUsuario(int id_usuario) throws SQLException{
//        Connection con = null;
//        PreparedStatement pst = null;
//        int registro = 0;
//        try {
//             con = getConnection();
//             pst = con.prepareStatement(SQL_Delete + " WHERE id_usuario = "+id_usuario);
//             
//             registro = pst.executeUpdate();
//             
//              JOptionPane.showMessageDialog(null, "se borro el usuario: "+id_usuario);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("no se borro");
//        }
//       
//       return id_usuario;        
//        
//        
//    }
    
    
    public int eliminarUsuario(Usuario usuario) throws SQLException{
        Connection con = null;
        PreparedStatement pst = null;
        int indentificador = 0;
        
        try {
            con = getConnection();
            pst = con.prepareStatement(SQL_Delete2);
            
            pst.setInt(1, usuario.getId_usuario());
            
            indentificador = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return indentificador;
    }
    
    
    
}
