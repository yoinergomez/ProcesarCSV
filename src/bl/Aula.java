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
public class Aula {
    
    private String numero;
    private Integer bloque;

    public Aula(Integer bloque, String numero) {
        this.numero = numero;
        this.bloque = bloque;
    }
    
    public String getNumero() {
        return numero;
    }

    public Integer getBloque() {
        return bloque;
    }
    
    
}
