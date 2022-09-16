package test;

import beans.Libros;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    
    public static void main(String[] args) {
        
        actualizarLibro(3, "Novela");
        listarLibro();
        
    }
    
    
    public static void actualizarLibro(int id_libro, String categoria){
        
        DBConnection conn = new DBConnection();
        String sql = "UPDATE libros SET categoria = '" + categoria + "' WHERE id_libro = " + id_libro;
        
        try {
            Statement st = conn.getConnection().createStatement();
            st.execute(sql);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            conn.Desconectar();
        }
        
    }
    
    public static void listarLibro(){
        
        DBConnection conn = new DBConnection();
        String sql = "SELECT * From libros";
        
        try {
            Statement st = conn.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int id_libro = rs.getInt("id_libro");
                String nombre_libro = rs.getString("nombre_libro");
                String autor = rs.getString("autor");
                String isbn = rs.getString("isbn");
                int no_paginas = rs.getInt("no_paginas");
                int ano_libro = rs.getInt("ano_libro");
                String formato = rs.getString("formato");
                String categoria = rs.getString("categoria");
                String sinopsis = rs.getString("sinopsis");
                
                Libros libro = new Libros(id_libro, nombre_libro, autor, isbn, no_paginas, ano_libro, formato, categoria, sinopsis);
                System.out.println(libro.toString());
            }            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            conn.Desconectar();
        }
        
    }
    
}
