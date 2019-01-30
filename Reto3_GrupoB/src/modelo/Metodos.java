package modelo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
	//Método para comprobar que el usuario introducido en el registro no existe en la base de datos
	public static boolean userExistente(String user) {
		boolean userExistente=false;
		Vista vista=new Vista();
		user=vista.registro.tFNombreRegistro.getName();
		//bucle que compara el nombre escrito con los existentes en la bbdd 
		//si existe devuelve true, si no, false
		
		return userExistente;
	}
	
	
	
	//Método para comprobar que el login del usuario ha sido correcto
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
	
	//método para comprobar que el usuario introducido en el login existe en la base de datos
	
	public static boolean comprobarUsuario(String user) {
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
	
	//metodo para comprobar que la contraseña escrita sea igual que la guardada en la base
	
	public static boolean comprobarPassword(String passRecibida) {
		String passAComparar=null;
		//Encriptamos la contraseña que recibimos
		
		String passEncriptada= encriptarPass(passRecibida);
		
		//consultar en la base la contraseña del usuario que ha tenido que ser validado anteriormente
		
		if(passEncriptada.equals(passAComparar)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	

}
