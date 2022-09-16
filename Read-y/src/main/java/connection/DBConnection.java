
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    Connection connection;
    
    static String db = "read_y";
    static String port = "3306";
    static String user = "root";
    static String password = "admin";

    public DBConnection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" +this.port + "/" + this.db;
            connection = DriverManager.getConnection(url,this.user,this.password);
            System.out.println("Conexión establecida");
        }catch(Exception ex){
            System.out.println("Error en conexión");
        }
        
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void Desconectar(){
    
        connection = null;
    }
    
    
        
    
}
