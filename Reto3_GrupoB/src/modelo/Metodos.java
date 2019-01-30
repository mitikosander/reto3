package modelo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Metodos {

	//metodo para cifrar la contrase�a
	
	public static String encriptarPass(String pass) {
		 try {
			 MessageDigest md = MessageDigest.getInstance("MD5");
			 byte[] messageDigest = md.digest(pass.getBytes());
			 BigInteger number = new BigInteger(1, messageDigest);
			 String hashtext = number.toString(16);

			 while (hashtext.length() < 32) {
			 hashtext = "0" + hashtext;
			 }
			 return hashtext;
			 }
			 catch (NoSuchAlgorithmException e) {
			 throw new RuntimeException(e);
			 }
	}
	
	//metodo para comprobar que la contrase�a escrita sea igual que la guardada en la base
	


	
	

}
