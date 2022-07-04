package ec.com.js.jdbc.usuarioform_2;

import Data.Operaciones_Usuario;
import Domain.Usuario;
import java.util.*;
import java.sql.*;
import java.lang.*;

public class UsuarioForm_2 {

    public static void main(String[] args) throws SQLException {
//        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
//
//          try {
//            Connection con = DriverManager.getConnection(url, "root", "");
//            
//            
//            var sql="SELECT id_usuario, nameUsuario, lastnameUsuario, describeUsuario, recomendUsuario, featureUsuario, improveUsuario, commentUsuario FROM usuario";
//            Statement sentencia = con.createStatement();
//            ResultSet resultado = sentencia.executeQuery(sql);
//            
//            while(resultado.next()
//                    ){
//                System.out.println("Id usuario: " + resultado.getInt("id_usuario"));
//                System.out.println("Nombre : " + resultado.getString("nameUsuario"));
//                System.out.println("");
//                System.out.println(" --------------- ");
//            }
//                        
//            resultado.close();
//            sentencia.close();
//            con.close();
//            
//          } catch (SQLException e) {
//              System.out.println(e);
//              e.printStackTrace();
//          }
            
            //Select los datos
            Operaciones_Usuario o1 = new Operaciones_Usuario();
            
            List<Usuario> SelectUsuario = o1.seleccionar();
           for (Usuario us: SelectUsuario) {
            System.out.println("Usuario: "+ us);
        }
             
//           
//           
//           //Insertar
//           Usuario u1 = new Usuario("HUGO", "BOSS", "new user in the town", "yes", "junior programmer", "he's new", "nothing to add");
//           o1.insertarUsuario(u1);
//           
          // o1.borrarUsuario(2);
          
          
          // Actualizar
//             Usuario uUp = new Usuario(1, "juan carlos", "zabala", "none", "no", "new user", "new user", "he's new");
//                o1.actualizarUsuario(uUp);


//           Eliminar
//             Usuario uDe = new Usuario(1);
//             o1.eliminarUsuario(uDe);
    }
}
