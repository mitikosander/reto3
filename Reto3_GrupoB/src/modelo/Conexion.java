package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	
	//Metodo al que llamaremos para inicializar la conexion con la base de datos
	private void conectarBase() {
		
		//Variables para la conexion
		String usuario=Datos.user_BBDD,password=Datos.pass_BBDD,servidor=Datos.server_BBDD;
		
		//llamamos al Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//establecemos la conexion pasando los parametros definidos
		try {
			Connection conexion = DriverManager.getConnection(
					   "jdbc:mysql://"+servidor+":3306/database",
					   usuario,
					   password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		
	}
}
	


