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
    private String bloqueAula[];
    private String horario;
    private Integer cedula;
    private String profesor;
    
    /**
     * Constructor de la clase. <br/>
     * Apartir del String csv se fragmenta la linea 
     * con los atributos de esta clase
     * @param csv
     * String que contiene una línea CSV 
     */
    public FilaCSV(String csv){
        
        String[] frag = csv.split(",",12);
        
        fac = frag[0];
        dep = frag[1];
        ide = frag[2];
        mat = frag[3];
        gr = frag[4];
        nombre = frag[5];
        cupo = frag[6];
        matri = frag[7];
        horario = frag[9];
        profesor = frag[11];
        
        if(!frag[8].equalsIgnoreCase("SIU") || !frag[8].equalsIgnoreCase("VIRTUAL")){
            int tamaño = frag[8].length();
            bloqueAula[0] = frag[8].substring(tamaño-3, tamaño);
            bloqueAula[1] = frag[8].substring(0, tamaño-3);
        } else{
            bloqueAula[1] = frag[8];
        }
        
        try{
            cedula = Integer.parseInt(frag[10]);
        }catch(NumberFormatException e){
            cedula = 0;
        }
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
        return bloqueAula[1];
    }

    /**
     * @param aula the aula to set
     */
    public void setAula(String aula) {
        this.bloqueAula[1] = aula;
    }

     /**
     * @return the bloque
     */
    public Integer getBloque() {
        return Integer.parseInt(bloqueAula[0]);
    }

    /**
     * @param aula the bloque to set
     */
    public void setBloque(String bloque) {
        this.bloqueAula[0] = bloque;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public String getCodDepartamento(){
        return fac+dep;
    }
    
    public String getCodMateria(){
        return fac+dep+mat;
    }
    
   
}
