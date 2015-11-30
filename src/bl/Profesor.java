package bl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esteban
 */
public class Profesor {
    
    private int cedula;
    private String nombre;

    public Profesor(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}
