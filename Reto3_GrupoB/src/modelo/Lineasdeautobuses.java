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
public class Lineasdeautobuses {
    
   //ATRIBUTOS
    private String codlinea;
    private int cod_bus;
    private String municipioscomponerlinea; 
    
   //CONSTRUCTORES
    public Lineasdeautobuses(){
    }
    


   //GETTER
    public String getCodlinea() {
        return codlinea;
    }

    public int getCodBus() {
        return cod_bus;
    }

    public String getMunicipioscomponerlinea() {
        return municipioscomponerlinea;
    }

    //SETTER
    public void setCodlinea(String codlinea) {
        this.codlinea = codlinea;
    }

    public void setCodBus(int cod_bus) {
        this.cod_bus = cod_bus;
    }

    public void setMunicipioscomponerlinea(String municipioscomponerlinea) {
        this.municipioscomponerlinea = municipioscomponerlinea;
    }
    
}
    
    
