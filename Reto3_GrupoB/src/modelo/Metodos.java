package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;

import vista.Vista;

public class Metodos {

	//metodo para cifrar la contraseña
	
	private  String encriptarPass(String pass) {
		
		pass=DigestUtils.md5Hex(pass);
		return pass;
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
	pass=encriptarPass(pass);
	Conexion connection=new Conexion();
	String sql="SELECT Nombre,Contrasenya FROM cliente WHERE Nombre LIKE '"+user+"' AND Contrasenya LIKE '"+pass+"'";

		try {
		PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		rs.last();
		if(rs.getRow()>0) {
			return true;
		}else {
			return false;
		}
				
		}catch(Exception e) {
		System.err.println("Consulta incorrecta"+e);
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
	
	//método para comprobar que las contraseñas del registro coinciden antes de hacer un insert de usuario
	public boolean comprobarPassCoinciden(String pass1, String pass2) {
		if(pass1.equals(pass2)) {
			return true;
		}else {
			return false;
		}
	}
	
	//Método para insertar los datos guardados en la BBDD y registrar el usuario
	public void insertarUsuario(Cliente c1) {
		Conexion connection=new Conexion();
		String sql="INSERT INTO cliente VALUES(?,?,?,?,?,?)";
		
		try {
			//Preparamos la consulta
			PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
			//Seguidamente asignamos los atributos a la consulta
			ps.setString(1, c1.getDni());
			ps.setString(2, c1.getNombre());
			ps.setString(3, c1.getApellido());
			ps.setDate(4, c1.getFecha_nac());
			ps.setString(5, c1.getSexo());
			ps.setString(6, c1.getContrasenya());
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			System.err.println("Insert Erroneo, revise los datosS");
		}
		
	}
	
	//Método para cargar un arrayList con los nombres de las lineas de autobus
	public  ArrayList<String> cargarLineas(){
		Conexion connection= new Conexion();
		ArrayList<String> nLineas=new ArrayList<String>();
		String sql="SELECT Nombre FROM linea";
		
		try {
			PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				nLineas.add(rs.getString(1));
			}
		
		}catch(Exception e) {
			System.err.println("Consulta no valida");
		}
		
		return nLineas;
	}
	
	
	//Método para cargar en un arrayList las paradas de una Linea segun cual hayamos seleccionado
	public ArrayList<String> cargarParadas(String nombreLinea){
		ArrayList<String> nombreParadas=new ArrayList<String>();
		Conexion connection= new Conexion();
		String sql="SELECT p.Nombre FROM parada p, linea_parada lp, linea l "
				+ "WHERE p.Cod_Parada=lp.Cod_Parada AND l.Cod_Linea=lp.Cod_Linea "
				+ "AND l.Nombre LIKE '"+nombreLinea+"'";
		
		try {
			PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				nombreParadas.add(rs.getString(1));
			}
		}catch(Exception e) {
			System.err.println("Consulta no valida"+e);
		}
		
		return nombreParadas;
	}
	
}
