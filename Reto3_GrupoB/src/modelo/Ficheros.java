package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ficheros {
	
	//Metodo para cargar el fichero que le pases poniendo la ruta 
	public static void cargarFichero() {
	String fichero = "D: \\ aqui va la ruta"; 
	String strCurrentLine; 
	        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {   
	            while ((strCurrentLine = br.readLine()) != null) {   
	                System.out.println(strCurrentLine);  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace(); 
	        }
	}
	
	
	//Metodo para guardar los datos del ticket en un fichero

}
