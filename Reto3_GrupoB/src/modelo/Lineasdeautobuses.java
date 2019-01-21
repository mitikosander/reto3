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
    private int codlinea;
    private String autobusrecorrerlinea;
    private String municipioscomponerlinea; 
    
   //CONSTRUCTORES
    public Lineasdeautobuses(){
    }
    
    public Lineasdeautobuses (int codlinea, String autobusrecorrerlinea, String municipioscomponerlinea){
    this.codlinea = codlinea;
    this.autobusrecorrerlinea = autobusrecorrerlinea;
    this.municipioscomponerlinea = municipioscomponerlinea;
    }

   //GETTER
    public int getCodlinea() {
        return codlinea;
    }

    public String getAutobusrecorrerlinea() {
        return autobusrecorrerlinea;
    }

    public String getMunicipioscomponerlinea() {
        return municipioscomponerlinea;
    }

    //SETTER
    public void setCodlinea(int codlinea) {
        this.codlinea = codlinea;
    }

    public void setAutobusrecorrerlinea(String autobusrecorrerlinea) {
        this.autobusrecorrerlinea = autobusrecorrerlinea;
    }

    public void setMunicipioscomponerlinea(String municipioscomponerlinea) {
        this.municipioscomponerlinea = municipioscomponerlinea;
    }
    //COMENTARIO DE PRUEBA
    //esto no va
}
    
    
