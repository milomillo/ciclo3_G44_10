package controller;

import beans.Usuarios;
import com.google.gson.Gson;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuariosController implements IUsuariosController {
    
    @Override
    public String login (String apodo, String contrasena){
    
        Gson gson = new Gson();
        DBConnection conn = new DBConnection();
        
        String sql = "Select * From usuarios where apodo = '" + apodo
                + "' and contrasena = '" + contrasena +"'";
        
        try {
            Statement st = conn.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                int id_usuario = rs.getInt("id_usuario");
                String nombre_usuario = rs.getString("nombre_usuario");
                String apellidos_usuario = rs.getString("apellidos_usuario");
                String email = rs.getString("email");
                short fichas = rs.getShort("fichas");
                
                Usuarios usuario = new Usuarios(id_usuario, nombre_usuario, apellidos_usuario,email,apodo,contrasena,fichas);
                return gson.toJson(usuario);
            }          
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
            
        }finally{
        
            conn.Desconectar();  
        }
        return "false";
    } 
}
