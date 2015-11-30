/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 * 
 * @author Yoiner Gómez - yoiner.gomez22@gmail.com
 * @version 1.1
 */
public class Facultad {
    
    private int codigo;
    private String nombre;

    public Facultad(char codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
}
