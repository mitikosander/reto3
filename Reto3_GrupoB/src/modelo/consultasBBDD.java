package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class consultasBBDD {
	
	//metodo para llenar un array de objetos con la bbdd
	
	public static Cliente[] cargarClientes() {
		//Cargamos la conexion a la base
		Connection connection=Conexion.conectarBase();
		
		//Creamos un objeto vacio
		Cliente c1=new Cliente();
		
		//Preparamos una sentencia para hacer la consulta
		PreparedStatement select_Clientes=connection.prepareStatement("SELECT * FROM CLIENTE");
		//Asignamos los atributos del objeto a la sentencia
		select_Clientes.setInt(1, 1);
		
		//Ejecutamos la query
		ResultSet rs=select_Clientes.executeQuery();
		while(rs.next()) {
			c1.setNombre(rs.getString("Nombre"));
		
			
		}
		

		
	
	}
	

}
