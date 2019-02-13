/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author IN1DM3B_15
 */
public class Billete {
    
   //ATRIBUTOS

    private Date fecha;
    private int lineasrecorrido; 
    private String paradaorigen;
    private String paradadestino;
    private int codigoautobus;
    private double preciotrayecto;
    
    //CONSTRUCTORES
    public Billete(){
    }
    


    //GETTER
    public Date getFecha() {
		return fecha;
	}
    
    public String getNumerobillete() {
        return generarNBillete();
    }



    public int getLineasrecorrido() {
        return lineasrecorrido;
    }

    public String getParadaorigen() {
        return paradaorigen;
    }

    public String getParadadestino() {
        return paradadestino;
    }

    public int getCodigoautobus() {
        return codigoautobus;
    }

    public double getPreciotrayecto() {
        return preciotrayecto;
    }
    

    //SETTER

 
    public void setLineasrecorrido(int lineasrecorrido) {
        this.lineasrecorrido = lineasrecorrido;
    }


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public void setParadaorigen(String paradaorigen) {
        this.paradaorigen = paradaorigen;
    }

    public void setParadadestino(String paradadestino) {
        this.paradadestino = paradadestino;
    }

    public void setCodigoautobus(int codigoautobus) {
        this.codigoautobus = codigoautobus;
    }

    public void setPreciotrayecto(double preciotrayecto) {
        this.preciotrayecto = preciotrayecto;
    }
    
    
    //método para generar un Codigo de Billete de 8 cifras y comprobar que no existe en la BBDD
    private static String generarNBillete() {
    	int [] numeros= new int[8]; 
    	String cod_N = "";
    	for(int i=0;i<numeros.length;i++) {
    		numeros[i]=(int) (Math.random()*9)+1;
    		cod_N+=Integer.toString(numeros[i]);
    	}
    	
    	
    	 return cod_N;
    }
    
    
}

       

