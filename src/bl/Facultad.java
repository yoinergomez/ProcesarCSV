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
    
    private String codigo;
    private String nombre;

    public Facultad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        if(codigo.equals("25")){
            this.nombre = "Facultad de ingenieria";
        }
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
}
