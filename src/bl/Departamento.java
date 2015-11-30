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
public class Departamento {
    
    private String codigo;
    private String facultad;
    private String nombre;

    public Departamento(String facultad, String codigo, String nombre) {
        this.codigo = codigo;
        this.facultad = facultad;
        this.nombre = nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
