package app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DBConexion {

	private Connection conexion = null;
    private Statement sentencia = null;
    private PreparedStatement preparaSentencia = null;
    private ResultSet resultados = null;
    
    
    public void conectarDB() throws Exception {
    	try {
			
    		Class driver_class = Class.forName("com.mysql.jdbc.Driver");
            Driver driver = (Driver) driver_class.newInstance();
            DriverManager.registerDriver(driver);
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hospital?user=root&password=");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
    public void leerPhysicians() throws Exception {
        try {
            
            sentencia = conexion.createStatement();
            resultados = sentencia.executeQuery("select * from Physician");
            leerPhysicians(resultados);
            ;
            preparaSentencia = conexion.prepareStatement("insert into Physician values ( ?, ?, ?, ?)");
            preparaSentencia.setInt(1,  10);
            preparaSentencia.setString(2, "Robert Morgan");
            preparaSentencia.setString(3, "Medicina de Familia");
            preparaSentencia.setInt(4, 919919919);
            preparaSentencia.executeUpdate();
            ;
            preparaSentencia = conexion.prepareStatement("delete from Physician where EmployeeID= ? ; ");
            preparaSentencia.setInt(1, 10);
            preparaSentencia.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            cerrarDB();
        }
    }
    
    private void cerrarDB() {
    	try {
    		if (resultados != null) {resultados.close();}
    		if (sentencia != null) {sentencia.close();}
    		if (conexion != null) {conexion.close();}
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
        
    private void leerPhysicians(ResultSet resultSet) throws SQLException {
    	
        while (resultSet.next()) {
            // e.g. resultSet.getSTring(2);
            int id = resultSet.getInt("EmployeeID");
            String nombre = resultSet.getString("Name");
            String cargo = resultSet.getString("Position");
            int ssn = resultSet.getInt("SSN");
            
            System.out.println("Especialista Id: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Cargo: " + cargo);
            System.out.println("SSN: " + ssn);
        }
        
        
    }    
        
        

    } // ---------------------------------------
    
    
    
    
    
