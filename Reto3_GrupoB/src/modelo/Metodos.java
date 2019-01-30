package modelo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import vista.Vista;

public class Metodos {

	//metodo para cifrar la contrase�a
	
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
	
	
	//M�todo para comprobar que el DNI introducido en el registro no existe en la base de datos
	public static boolean dniExistente(String dni) {
		boolean dniExistente=false;
		Vista vista=new Vista();
		dni=vista.registro.tfDNIRegistro.getName();
		//hacer un bucle que compare el String recibido de la pantalla con los dni's existentes
		
		return dniExistente;
	}

	
	
	//M�todo para comprobar que el login del usuario ha sido correcto
	public static boolean comprobarLogin(String user, String pass) {
		boolean pass_comp=false;
		boolean user_comp=comprobarUsuario(user);
		
		if(user_comp=true) {
			pass_comp=comprobarPassword(pass);
		}
		
		if(user_comp==true && pass_comp==true) {
			return true;
		}else {
			return false;
		}
	}
	
	//m�todo para comprobar que el usuario introducido en el login existe en la base de datos
	
	private static boolean comprobarUsuario(String user) {
		String usuarioAcomparar=null;
		//cogemos el valor del textField que nos han pasado como usuario
		Vista vista=new Vista();
		vista.login.tFLogin.getName();
		//hacemos la consulta para conseguir el dato del usuario y guardarlo en la variable
		
		//comparamos el campo dado en el textField con el usuario de la BBDD
		if(user.equals(usuarioAcomparar)) {
			return true;
		}else {
			return false;
		}
	}
	
	//metodo para comprobar que la contrase�a escrita sea igual que la guardada en la base
	
	private static boolean comprobarPassword(String passRecibida) {
		String passAComparar=null;
		//Encriptamos la contrase�a que recibimos
		
		String passEncriptada= encriptarPass(passRecibida);
		
		//consultar en la base la contrase�a del usuario que ha tenido que ser validado anteriormente
		
		if(passEncriptada.equals(passAComparar)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//M�todo que recibe la tabla a consultar y devuelve el numero 
		private static int contarLargoArr(String nombreTablaConsulta) {
			int cont=0;
			//consulta para obtener el count 
			
			
			return cont;
		}
	
	//M�todo para cargar array de Lineas con los datos de la BBDD
	public static Lineasdeautobuses[] cargarArrLineas() {
		Lineasdeautobuses[] lineas;
		String tablaconsulta="";
		//llamamos al metodo contLargoArr para saber el largo que tendr� nuestro array
		int contLargo=contarLargoArr(tablaconsulta);
		
		//asignamos el largo al array
		lineas=new Lineasdeautobuses[contLargo];
		
		
		//hacemos la consulta a la tabla
		
		
		//cargamos el array
		
		
		return lineas;
	}
	
	
	//M�todo cargar array de Usurios con los datos de la BBDD
	
	//M�todo para cargar array de Municipios con los datos de la BBDD
	
	//M�todo para cargar array parada con los datos de la BBDD
	
	
	
	

}
