
package clases;

import java.sql.*;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * @author Miller
 * @Proyecto DataSystem
 * @version 0.1
 * @since 18-nov-2023
 */

public class Conexion {   
    
    // Conexion local
    public static Connection conectar(){
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:33065/bd_ds", "root", "");
            return cn;
            
        } catch (SQLException e){
            System.out.println("Error en la conexion local" + e);
        }
        return null;
    
    }
}
