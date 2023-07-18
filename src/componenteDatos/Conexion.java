package componenteDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Conexion instancia;
    public static Conexion getInstancia(){
        if(instancia == null)
            instancia = new Conexion();
        return instancia;
    }
    
    public Connection miConexion() throws SQLException{
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error cargar el driver.");
        }
        
        try {
            String url = "jdbc:mysql://localhost:3306/BaseTransporte";
            conexion = DriverManager.getConnection(url,"yorkaef","yorkaef");   
        } catch (SQLException e) {
            throw e;
        }
        return conexion;
    }

    Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
