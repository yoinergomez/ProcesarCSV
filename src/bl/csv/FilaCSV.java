/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.csv;

/**
 *
 * @author esteban
 */
public class FilaCSV {

    private static FilaCSV instance = null;
    
    private String fac;
    private String dep;
    private String ide;
    private String mat;
    private String gr;
    private String nombre;
    private String cupo;
    private String matri;
    private String aula;
    private String horario;
    private String cedula;
    private String profesor;
    
    /**
     * Constructor de la clase. <br/>
     * Apartir del String csv se fragmenta la linea 
     * con los atributos de esta clase
     * @param csv
     * String que contiene una línea CSV 
     */
    public FilaCSV(String csv){
        
        String[] frag = csv.split(",");
        
        fac = frag[0];
        dep = frag[1];
        ide = frag[2];
        mat = frag[3];
        gr = frag[4];
        nombre = frag[5];
        cupo = frag[6];
        matri = frag[7];
        aula = frag[8];
        horario = frag[9];
        cedula = frag[10];
        profesor = frag[11];
    }
    /*
    private FilaCSV() {
        // instanciacion
    }

    public static FilaCSV getInstance() {
        if (instance == null) {
            instance = new FilaCSV();
        }
        return instance;
    }
    */


    /**
     * @return the fac
     */
    public String getFac() {
        return fac;
    }

    /**
     * @param fac the fac to set
     */
    public void setFac(String fac) {
        this.fac = fac;
    }

    /**
     * @return the dep
     */
    public String getDep() {
        return dep;
    }

    /**
     * @param dep the dep to set
     */
    public void setDep(String dep) {
        this.dep = dep;
    }

    /**
     * @return the mat
     */
    public String getMat() {
        return mat;
    }

    /**
     * @param mat the mat to set
     */
    public void setMat(String mat) {
        this.mat = mat;
    }

    /**
     * @return the gr
     */
    public String getGr() {
        return gr;
    }

    /**
     * @param gr the gr to set
     */
    public void setGr(String gr) {
        this.gr = gr;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the aula
     */
    public String getAula() {
        return aula;
    }

    /**
     * @param aula the aula to set
     */
    public void setAula(String aula) {
        this.aula = aula;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the profesor
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public String getCupo() {
        return cupo;
    }

    public void setCupo(String cupo) {
        this.cupo = cupo;
    }

    public String getMatri() {
        return matri;
    }

    public void setMatri(String matri) {
        this.matri = matri;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   
}
