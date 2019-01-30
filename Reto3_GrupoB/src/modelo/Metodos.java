package modelo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Metodos {

	// metodo para cifrar la contraseña

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
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	// metodo para comprobar que la contraseña escrita sea igual que la guardada en
	// la base

	// metodo para mostrar pantalla al pulsar un boton

	public void mostrarPantalla(JPanel panel, JFrame ventana) {
		ventana.getContentPane().add(panel);
		panel.setVisible(true);
	}

	public void precioTotal() {

	}

	public double calcularDistanciaEuclediana() {
		Punto p1 = new Punto(5, 10);
		Punto p2 = new Punto(3, 7);
		double resultado = 0;
		try {
			resultado = p1.distancia(p2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
}
