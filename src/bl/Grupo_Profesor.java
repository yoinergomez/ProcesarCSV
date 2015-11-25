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
public class Grupo_Profesor {
    
    private char numero;
    private Materia materia;
    private int cedula;
    private String dia;
    private String hora_inicio;
    private String hora_fin;
    private Aula aula;

    public char getNumero() {
        return numero;
    }

    public Materia getMateria() {
        return materia;
    }

    public int getCedula() {
        return cedula;
    }

    public String getDia() {
        return dia;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public Aula getAula() {
        return aula;
    }
    
    
}
