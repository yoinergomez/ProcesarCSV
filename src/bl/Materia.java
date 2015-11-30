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
public class Materia {
    
    private String codigo;
    private Departamento departamento;
    private String nombre;

    public Materia(Departamento departamento, String codigo, String nombre) {
        this.codigo = codigo;
        this.departamento = departamento;
        this.nombre = nombre;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getDepartamento() {
        return departamento.getCodigo();
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getFacultad(){
        return departamento.getFacultad();
    }
    
}
