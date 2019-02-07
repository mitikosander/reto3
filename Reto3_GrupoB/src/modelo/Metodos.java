package modelo;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



import vista.Vista;

public class Metodos {

	//metodo para cifrar la contraseña
	
	private static String encriptarPass(String pass) {
		
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
	public boolean comprobarLogin(String user,String pass) {
		Vista vista=new Vista();
		boolean user_comp=comprobarUsuario(user);
		boolean pass_comp=false;
		
		if(user_comp=true) {
			pass_comp=comprobarPassword(pass);
		}else {
			return false;
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
	
	private boolean comprobarUsuario(String user) {
		Conexion connect=new Conexion();
		String usuarioAcomparar=null;
		String sql;
		//cogemos el valor del textField que nos han pasado como usuario
		
		//hacemos la consulta para conseguir el dato del usuario y guardarlo en la variable
		sql="SELECT Nombre FROM cliente WHERE Nombre LIKE '"+user+"'";
		System.out.println(sql);
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
	
	private static boolean comprobarPassword(String passRecibida) {
		
		Conexion connect=new Conexion();
		String passAComparar=null;
		
		//Encriptamos la contraseña que recibimos
		
		String passEncriptada= encriptarPass(passRecibida);
		String sql="SELECT Contrasenya FROM cliente WHERE Contrasenya LIKE '"+passEncriptada+"' AND Nombre LIKE ";
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
	
	//Método para cargar array de Autobuses
	public static ArrayList<Autobus> cargarArrAutobuses(){
		ArrayList<Autobus> autobuses=new ArrayList<Autobus>();
		String sql="SELECT * FROM autobus";
		Conexion connection=new Conexion();
		Autobus a1;
		try {
			PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				a1=new Autobus();
				
				a1.setCodigoAutobus(rs.getInt(1));
				a1.setNumeroDePlazas(rs.getInt(2));
				a1.setConsummo(rs.getDouble(3));
				a1.setColor(rs.getString(4));
				
				autobuses.add(a1);
			}
		}catch(Exception e) {
			System.err.println("Consulta erronea");
		}
		System.out.println("Cargado array Autobuses");
		return autobuses;
	}
	
	//Método para cargar array de Lineas con los datos de la BBDD
	public static ArrayList<Lineasdeautobuses> cargarArrLineas() {
		ArrayList<Lineasdeautobuses> lineas=new ArrayList<Lineasdeautobuses>();
		String sql1="SELECT l1.Cod_Linea, Cod_bus, Nombre FROM linea_autobus l1, linea l2 WHERE l1.Cod_Linea=l2.Cod_Linea";
	
		Conexion connection= new Conexion();
		Lineasdeautobuses l1;
		
		try {
			PreparedStatement ps=connection.conectarBase().prepareStatement(sql1);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				l1=new Lineasdeautobuses();
				
				l1.setCodlinea(rs.getString(1));
				l1.setCodBus(rs.getInt(2));
				l1.setMunicipioscomponerlinea(rs.getString(3));
				
				lineas.add(l1);
			}
		}catch(Exception e) {
			System.err.println("Consulta no valida");
		}

			System.out.println("Cargado array de Lineas de Autobuses");
		
		return lineas;
	}
	
	
	//Método cargar array de Clientes con los datos de la BBDD
	public static ArrayList<Cliente> cargarArrClientes() {
		ArrayList<Cliente> clientes=new ArrayList<Cliente>();
		Conexion connection=new Conexion();
		String sql="SELECT * FROM cliente";
		
		Cliente c1;
		//Hacemos la consulta
		try {
		PreparedStatement ps= connection.conectarBase().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			c1=new Cliente();
			c1.setDni(rs.getString(1));
			c1.setNombre(rs.getString(2));
			c1.setApellido(rs.getString(3));
			c1.setFecha_nac(rs.getDate(4));
			c1.setSexo(rs.getString(5));
			c1.setContrasenya(rs.getString(6));
			
			clientes.add(c1);
		}
		
		}catch(Exception e) {
			System.err.println("Consulta erronea" +e);
		}
		System.out.println("Cargado array Clientes");
		return clientes;
	}
	//Método para cargar array de Municipios con los datos de la BBDD
	public static ArrayList<Municipio> cargarArrMunicipios() {
		ArrayList<Municipio> municipios = new ArrayList<Municipio>();
		Conexion connect= new Conexion();
		String tablaconsulta="poblacion";
		String sql="SELECT p1.Cod_Postal,Nombre,Cod_Parada FROM "+tablaconsulta+" p1, poblacion_parada p2 WHERE p1.Cod_Postal=p2.Cod_Postal";
		Municipio m1;
		
		
		
		
		//Ejecutamos la sencuencia SQL
		try {
			PreparedStatement ps=connect.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				m1=new Municipio();
				m1.setCodigoPostal(rs.getInt(1));
				m1.setNombre(rs.getString(2));
				m1.setRelacionParada(rs.getInt(3));			
				
				municipios.add(m1);
				
			}
			
			
		}catch(Exception e) {
			System.err.println("Consulta incorrecta"+ e);
		}
		
		System.out.println("Array Municipios Cargado");
		
		return municipios;
	}
	//Método para cargar array parada con los datos de la BBDD
	public static ArrayList<Parada> cargarArrParadas() {
		ArrayList<Parada> paradas=new ArrayList<Parada>();
		Conexion connect=new Conexion();
		String sql="SELECT * FROM parada";
		Parada p1;
		try {
			PreparedStatement ps=connect.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				p1=new Parada();
				p1.setCodigoParada(rs.getInt(1));
				p1.setNombreParada(rs.getString(2));
				p1.setCalle(rs.getString(3));
				p1.setLatitud(rs.getDouble(4));
				p1.setLongitud(rs.getDouble(5));
				
				paradas.add(p1);
			}
		}catch(Exception e) {
			System.err.println("Consulta erronea");
		}
		System.out.println("Array Paradas cargado");
		return paradas;
	}
	
	
	public static ArrayList<String> cargarParadas(){
		Conexion connection= new Conexion();
		ArrayList<String> nombreParadas=new ArrayList<String>();
		String sql="Select Nombre FROM parada";
		String nombreParada;
		 try {
			 PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
			 ResultSet rs=ps.executeQuery();
			 
			 while(rs.next()) {
				 nombreParada=rs.getString(1);
				nombreParadas.add(nombreParada); 
			 }
		 }catch(Exception e) {
			 System.err.println("Consulta erronea");
		 }
		
		return nombreParadas;
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
