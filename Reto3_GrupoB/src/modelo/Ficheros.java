
package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ficheros {
	
	
	//Metodo para cargar el fichero que le pases poniendo la ruta 
	public static void cargarFichero() {
	String fichero = "E://fichero.txt"; 
	String strCurrentLine; 
	BufferedReader objReader = null;
	//stCurrentline lee la linea actual 
	//objReader devuelve una cadena
	        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {   
	            while ((strCurrentLine = objReader.readLine()) != null) {   
	               
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace(); 
	        }
	
	}
	
	//Metodo para guardar los datos del ticket en un fichero
	public static void guardarTicket() {
		String paradaorigen = "BURGOS";
		String paradadestino = "MADRID";
		String recorrido = "BURGOS-SORIA-SEGOVIA-MADRID";
		int codigoAutobus = 22;

		// Datos salida
		int diaSalida = 7;
		int mesSalida = 2;
		int anyoSalida = 2019;
		String horaSalida = "15:35";

		// Datos vuelta
		int diaVuelta = 14;
		int mesVuelta = 2;
		int anyoVuelta = 2019;
		String horaVuelta = "12:30";

		// Resto de datos
		boolean tipobillete = true;
		String tipoBillete = "";

		if (tipobillete == true) {
			tipoBillete = "IDA";
		} else {
			tipoBillete = "IDA y VUELTA";
		}
		int numerobillete = 45;

		String nombre = "Eduardo";
		String apellido = "Garcia";

		double precioTotal = 15;

		try {
			// Cambiar la direccion fisica a la actual antes de ejecutar
			FileWriter fw = new FileWriter("F:\\eclipse-workspace\\Pruebas\\src\\archivo.txt");
			if (tipobillete == true) {
				fw.write("____________________________________BILLETE____________________________________\r\n" + "\r\n"
						+ "LINEA: " + paradaorigen + "-" + paradadestino
						+ "                                  CODIGO AUTOBUS: " + codigoAutobus + "\r\n" + "\r\n"
						+ "RECORRIDO: " + recorrido + "\r\n" + "\r\n" + "ORIGEN: " + paradaorigen + "\r\n" + "DESTINO: "
						+ paradadestino + "\r\n" + "\r\n" + "FECHA DE SALIDA: " + diaSalida + "/" + mesSalida + "/"
						+ anyoSalida + "                             HORA DE SALIDA: " + horaSalida + "\r\n" + "\r\n"
						+ "TIPO DE BILLETE: " + tipoBillete + "                         NUMERO DE BILLETE: "
						+ numerobillete + "\r\n" + "\r\n" + "NOMBRE DEL VIAJERO: " + nombre + " " + apellido + "\r\n"
						+ "\r\n" + "PRECIO: " + precioTotal + "€");

			} else {
				fw.write("____________________________________BILLETE____________________________________\r\n" + "\r\n"
						+ "LINEA: " + paradaorigen + "-" + paradadestino
						+ "                                  CODIGO AUTOBUS: " + codigoAutobus + "\r\n" + "\r\n"
						+ "RECORRIDO: " + recorrido + "\r\n" + "\r\n" + "ORIGEN: " + paradaorigen + "\r\n" + "DESTINO: "
						+ paradadestino + "\r\n" + "\r\n" + "FECHA DE SALIDA: " + diaSalida + "/" + mesSalida + "/"
						+ anyoSalida + "                             HORA DE SALIDA: " + horaSalida + "\r\n" + "\r\n"
						+ "FECHA DE VUELTA: " + diaVuelta + "/" + mesVuelta + "/" + anyoVuelta
						+ "                             HORA DE VUELTA: " + horaVuelta + "\r\n" + "\r\n"
						+ "TIPO DE BILLETE: " + tipoBillete + "                         NUMERO DE BILLETE: "
						+ numerobillete + "\r\n" + "\r\n" + "NOMBRE DEL VIAJERO: " + nombre + " " + apellido + "\r\n"
						+ "\r\n" + "PRECIO: " + precioTotal + "€");
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
