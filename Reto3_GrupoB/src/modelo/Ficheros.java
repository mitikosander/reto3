
package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ficheros {
	
	
	//Metodo para cargar el fichero que le pases poniendo la ruta 
	public static void cargarFichero() {
	String fichero = "D: \\ aqui va la ruta"; 
	String strCurrentLine; 
	BufferedReader objReader = null;
	//stCurrentline lee la linea actual 
	//objReader devuelve una cadena
	        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {   
	            while ((strCurrentLine = objReader.readLine()) != null) {   
	                System.out.println(strCurrentLine);  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace(); 
	        }
	
	}
	
	//Metodo para guardar los datos del fichero en un array
	
	//Metodo para guardar los datos del ticket en un fichero

}
