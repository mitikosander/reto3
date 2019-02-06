/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author IN1DM3B_15
 */
public class Cliente {
    
   //ATRIBUTOS
    private String dni;
    private String nombre;
    private String apellido;
    private String sexo;
    private String contrasenya;
    private Date fecha_nac;
    
   //CONSTRUCTORES
    public Cliente(){
    }
    
    public Cliente (String dni, String nombre, String apellido, String sexo, String contrasenya,Date fecha_nac){
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.sexo = sexo;
    this.contrasenya = contrasenya;
    this.fecha_nac = fecha_nac;
}

    //GETTER
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public String getContrasenya() {
        return contrasenya;
    }
    
    public Date getFecha_nac() {
        return fecha_nac;
    }

    //SETTER
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }
    
    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

 
    
    
}
