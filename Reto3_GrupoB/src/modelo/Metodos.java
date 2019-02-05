package modelo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vista.Vista;

public class Metodos {

	//metodo para cifrar la contraseña
	
	private static String encriptarPass(String pass) {
		Vista vista=new Vista();
		
		pass=vista.login.pFLogin.getName();
		
		 try {
			 MessageDigest md = MessageDigest.getInstance("MD5");
			 byte[] messageDigest = md.digest(pass.getBytes());
			 BigInteger number = new BigInteger(1, messageDigest);
			 pass= number.toString(16);

			 while (pass.length() < 32) {
			 pass = "0" + pass;
			 }
			 return pass;
			 }
			 catch (NoSuchAlgorithmException e) {
			 throw new RuntimeException(e);
			 }
	}
	
	
	//Método para comprobar que el DNI introducido en el registro no existe en la base de datos
	public static boolean dniExistente(String dni) {
		boolean dniExistente=false;
		Vista vista=new Vista();
		dni=vista.registro.tfDNIRegistro.getName();
		//hacer un bucle que compare el String recibido de la pantalla con los dni's existentes
		
		return dniExistente;
	}

	
	
	//Método para comprobar que el login del usuario ha sido correcto
	public boolean comprobarLogin() {
		Vista vista=new Vista();
		boolean pass_comp=false;
		boolean user_comp=comprobarUsuario();
		
		if(user_comp=true) {
			pass_comp=comprobarPassword();
		}
		
		if(user_comp==true && pass_comp==true) {
			vista.login.lblErrorDeRegistro.setVisible(false);
			return true;
			
		}else {
			vista.login.lblErrorDeRegistro.setVisible(true);
			return false;
			
		}
	}
	
	//método para comprobar que el usuario introducido en el login existe en la base de datos
	
	private boolean comprobarUsuario() {
		Conexion connect=new Conexion();
		String usuarioAcomparar=null;
		String user,sql;
		//cogemos el valor del textField que nos han pasado como usuario
		Vista vista=new Vista();
		user=vista.login.tFLogin.getName();
		//hacemos la consulta para conseguir el dato del usuario y guardarlo en la variable
		sql="SELECT Nombre FROM cliente WHERE Nombre LIKE '"+user+"'";
		
		try {
			PreparedStatement ps=connect.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				usuarioAcomparar=rs.getString(1);
			}
		}catch(Exception e) {
			System.err.println("Consulta incorrecta");
		}
		
		
		//comparamos el campo dado en el textField con el usuario de la BBDD
		if(user.equals(usuarioAcomparar)) {
			return true;
		}else if(usuarioAcomparar==null){
			return false;
		}else {
			return false;
		}
	}
	
	//metodo para comprobar que la contraseña escrita sea igual que la guardada en la base
	
	private static boolean comprobarPassword() {
		Vista vista=new Vista();
		Conexion connect=new Conexion();
		String passAComparar=null;
		String passRecibida=vista.login.pFLogin.getName();
		//Encriptamos la contraseña que recibimos
		
		String passEncriptada= encriptarPass(passRecibida);
		String sql="SELECT Contrasenya FROM cliente WHERE Contrasenya LIKE '"+passRecibida+"'";
		System.out.println(sql);
		//consultar en la base la contraseña del usuario que ha tenido que ser validado anteriormente
		
		try {
			PreparedStatement ps=connect.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				passAComparar=rs.getString(1);
			}
		}catch(Exception e) {
			System.err.println("Consulta incorrecta");
		}
		
		
		
		if(passEncriptada.equals(passAComparar)) {
			return true;
		}else if(passAComparar==null){
			return false;
		}else {
			return false;
		}
		
	}
	
	//Método que recibe la tabla a consultar y devuelve el numero 
		private static int contarLargoArr(String nombreTablaConsulta) {
			Conexion connect=new Conexion();
			int cont=0;
			String sql="SELECT COUNT(*) FROM "+nombreTablaConsulta;
			//consulta para obtener el count 
			try {
				PreparedStatement ps=connect.conectarBase().prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					cont=rs.getInt(1);
				}
			}catch(Exception e) {
				System.err.println("Consulta incorrecta");
			}
			
			return cont;
		}
	
	//Método para cargar array de Lineas con los datos de la BBDD
	public static Lineasdeautobuses[] cargarArrLineas() {
		Lineasdeautobuses[] lineas;
		String tablaconsulta="linea_autobus";
		
		//llamamos al metodo contLargoArr para saber el largo que tendrá nuestro array
		int contLargo=contarLargoArr(tablaconsulta);
		System.out.println(contLargo);
		//asignamos el largo al array
		lineas=new Lineasdeautobuses[contLargo];
		
		
		//hacemos la consulta a la tabla
		
		
		//cargamos el array
		
		
		return lineas;
	}
	
	
	//Método cargar array de Clientes con los datos de la BBDD
	public static Cliente[] cargarArrClientes() {
		Cliente [] clientes;
		String tablaconsulta="cliente";
		
		//llamamos al metodo contLargoArr para saber el largo que tendrá nuestro array
		int contLargo=contarLargoArr(tablaconsulta);
		
		clientes=new Cliente[contLargo];
		
		return clientes;
	}
	//Método para cargar array de Municipios con los datos de la BBDD
	public static Municipio[] cargarArrMunicipios() {
		Municipio[] municipios;
		String tablaconsulta="poblacion";
		
		//llamamos al metodo contLargoArr para saber el largo que tendrá nuestro array
		int contLargo=contarLargoArr(tablaconsulta);
		
		
		municipios=new Municipio[contLargo];
		
		return municipios;
	}
	//Método para cargar array parada con los datos de la BBDD
	public static Parada[] cargarArrParadas() {
		Parada[] paradas;
		String tablaconsulta="parada";
		
		//llamamos al metodo contLargoArr para saber el largo que tendrá nuestro array
		int contLargo=contarLargoArr(tablaconsulta);
		
		
		paradas=new Parada[contLargo];
		return paradas;
	}
	
	
	public static double calcularDistanciaEuclediana() {
		Punto p1 = new Punto(5, 10);
		Punto p2 = new Punto(3, 7);
		double resultado = 0;
		try {
			resultado = p1.distancia(p2);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return resultado;
	}
	
	
}
