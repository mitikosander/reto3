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
    private int numerobillete;
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
    
    public Billete (int numerobillete, int dia, int mes, int anyo, int lineasrecorrido, 
    String paradaorigen, String paradadestino, int codigoautobus, double preciotrayecto){
    this.numerobillete = numerobillete;
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;
    this.lineasrecorrido = lineasrecorrido;
    this.paradaorigen = paradaorigen;
    this.paradadestino = paradadestino;
    this.codigoautobus = codigoautobus;
    this.preciotrayecto = preciotrayecto;
    }

    //GETTER
    public int getNumerobillete() {
        return numerobillete;
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
    public void setNumerobillete(int numerobillete) {
        this.numerobillete = numerobillete;
    }

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
    
}

       

