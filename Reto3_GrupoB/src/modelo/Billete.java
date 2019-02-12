/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author IN1DM3B_15
 */
public class Billete {
    
   //ATRIBUTOS

    private int dia;
    private int mes;
    private int anyo;
    private int lineasrecorrido; 
    private String paradaorigen;
    private String paradadestino;
    private int codigoautobus;
    private double preciotrayecto;
    
    //CONSTRUCTORES
    public Billete(){
    }
    


    //GETTER
    public String getNumerobillete() {
        return generarNBillete();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnyo() {
        return anyo;
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

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void setLineasrecorrido(int lineasrecorrido) {
        this.lineasrecorrido = lineasrecorrido;
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

       

