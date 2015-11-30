/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import bl.Departamento;
import bl.Facultad;
import bl.Materia;
import bl.csv.FilaCSV;
import util.FragmentarLinea;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 * @version 1.0
 * @author esteban
 */


public class ProcesarCSV {

    /**
     * @param args the command line arguments
     */
    /*
    private StringBuilder sql;
    private FragmentarLinea line = FragmentarLinea.getInstance();

    public ProcesarCSV() throws IOException {
        sql = new StringBuilder();
        
        
        crearTabla();
        leerArchivoXLS();
        eliminarFilasRepetidas();
        generarSQL();
        
    }

    //FAC,DEP,IDE,MAT,GR,NOMBRE DE LA MATERIA,CUPO,MATRI,AULA,HORARIO,CEDULA,DOCENTE
    public void crearTabla() {
        sql.append("CREATE TABLE IF NOT EXISTS `CURSOS` (\n");
        sql.append("`id` MEDIUMINT NOT NULL AUTO_INCREMENT,\n");
        sql.append("`FACULTAD` varchar(2) NOT NULL,\n");
        sql.append("`DEPARTAMENTO` varchar(2) NOT NULL,\n");
        sql.append("`MATERIA` varchar(3) NOT NULL,\n");
        sql.append("`GRUPO` int(2) NOT NULL,\n");
        sql.append("`NOMBRE` varchar(50) NOT NULL,\n"); // En el archivo se manejan 27 caracteres
        sql.append("`AULA` varchar(10) NOT NULL,\n");
        sql.append("`HORARIO` varchar(15) NOT NULL,\n");
        sql.append("`PROFESOR` varchar(50) NOT NULL,\n");
        sql.append("PRIMARY KEY (`id`)\n");
        sql.append(");\n\n");
    }

    public void leerArchivoXLS() throws FileNotFoundException, IOException {
        String linea;
        FileReader f = new FileReader("/home/esteban/Descargas/PROGRAMACION.csv");
        BufferedReader b = new BufferedReader(f);

        sql.append("INSERT INTO `CURSOS` (`ID`,`FACULTAD`, `DEPARTAMENTO`, `MATERIA`, `GRUPO`, `NOMBRE`, `AULA`, `HORARIO`, `PROFESOR`) VALUES\n");
        b.readLine();
        while ((linea = b.readLine()) != null) {
            sql.append(fragmentarLinea(linea));
        }
        b.close();
        sql.delete(sql.length() - 2, sql.length());
        sql.append(";");
    }

    public String fragmentarLinea(String linea) {

        String[] token = linea.split(",", 12);

        line.setAux(token[0]);
        line.setFacultad((!line.getAux().isEmpty()) ? line.getAux() : line.getFacultad());
        line.setFacultad((line.getFacultad().length() == 1) ? "0" + line.getFacultad() : line.getFacultad());

        line.setAux(token[1]);
        line.setDepartamento((!line.getAux().isEmpty()) ? line.getAux() : line.getDepartamento());
        line.setDepartamento((line.getDepartamento().length() == 1) ? "0" + line.getDepartamento() : line.getDepartamento());

        line.setAux(token[3]);
        line.setMateria((!line.getAux().isEmpty()) ? line.getAux() : line.getMateria());
        if (line.getMateria().length() == 1) {
            line.setMateria("00" + line.getMateria());
        } else if (line.getMateria().length() == 2) {
            line.setMateria("0" + line.getMateria());
        }

        line.setAux(token[4]);
        line.setGrupo((!line.getAux().isEmpty()) ? line.getAux() : line.getGrupo());

        line.setAux(token[5]);
        line.setNombre((!line.getAux().isEmpty()) ? line.getAux() : line.getNombre());

        line.setAux(token[8]);
        line.setAula((!line.getAux().isEmpty()) ? line.getAux() : line.getAula());
//        line.setAux(line.getAula().substring(line.getAula().length() - 3));
//        
//        line.setAula(line.getAula().replace(line.getAux(), "-" + line.getAux()));
//        System.out.println(line.getAula());

        line.setAux(token[9]);
        line.setHorario((!line.getAux().isEmpty()) ? line.getAux() : line.getHorario());

        line.setAux(token[11]);
        line.setProfesor((!line.getAux().isEmpty()) ? line.getAux() : line.getProfesor());

        return ("('" + line.getFacultad() + "', "
                + "'" + line.getDepartamento() + "', "
                + "'" + line.getMateria() + "', "
                + "'" + line.getGrupo() + "', "
                + "'" + line.getNombre() + "', "
                + "'" + line.getAula() + "', "
                + "'" + line.getHorario() + "', "
                + "'" + line.getProfesor() + "'),\n");

    }

    public void generarSQL() {
        String directorio = System.getProperty("user.dir") + "/PROGRAMACION.sql";
        File file = new File(directorio);
        try {
            FileWriter w = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write(sql.toString());//Escribir en el archivo
            wr.close();
            bw.close();
        } catch (IOException e) {

        };

    }

    private void eliminarFilasRepetidas() {

    }

    public static void main(String[] args) throws IOException {
        ProcesarCSV run = new ProcesarCSV();
    }
    */
    
    private StringBuilder sql;
    private Map<String, Facultad> facultad;
    private Map<String, Departamento> departamento;
    private Map<String, Materia> materia;
    private Map<Integer, String> bloque;
    private Map<Integer, String> aula;
    
    /**
     * Constructor de la clase
     * 
     */
    public ProcesarCSV(){
        sql = new StringBuilder();
    }
    
    /**
     * Lee un archivo SQL que contiene las sentencias necesarias
     * para la creación de las tablas de la base de datos.
     * 
     * @throws NullPointerException  
     * Verificar que el archivo tablas.sql se encuentre en el directorio
     * util/tablasSQL/tablas.sql de lo contrario cambiar el path
     * donde se encentre alojado
     * 
     * @throws BufferedReader
     * Cerrar el canal de comunicaciones que se crea
     * para proceder con la lectura del archivo
     * 
     */
    public void crearTablas() {
        String linea;

        try {
        InputStream is = getClass().getResourceAsStream("util/tablasSQL/tablas.sql") ;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        //Lectura por líneas
        while ((linea = br.readLine()) != null) {
            sql.append(linea).append("\n");
        }
        
        //Cerrando la comunicación
        br.close();
        isr.close();
        is.close();
        }catch(Exception e){
            String mnj = "Error al crear las tablas del archivo tablas.sql";
            JOptionPane.showMessageDialog(null, mnj+"\n"+e , "Error",
            JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    public void procesarlinea(){
        
        final String facultadIng = "Facultad de ingenieria";
        String linea;
        FilaCSV actual;
        FilaCSV ultimo;
        
        facultad = new HashMap<>();
        departamento = new HashMap<>();
        materia = new HashMap<>();
        bloque = new HashMap<>();
        aula = new HashMap<>();
        
        Facultad fac;
        Departamento dep;
        Materia mat;
        
        try {
            FileReader f = new FileReader("/home/esteban/Descargas/PROGRAMACION.csv");
            BufferedReader b = new BufferedReader(f);
            
            b.readLine();
            while ((linea = b.readLine()) != null) {
                
                actual = new FilaCSV(linea);
                actual = ajustarCodigoMateria(actual);
                
                fac = new Facultad(actual.getFac(), "");
                dep = new Departamento(actual.getFac(), actual.getDep(), actual.getIde());
                mat = new Materia(dep, actual.getCodMateria(), actual.getNombre());
                
                facultad.put(fac.getCodigo(), fac);
                departamento.put(actual.getCodDepartamento(), dep);
                materia.put(actual.getCodMateria(), mat);
            }
            System.out.println(facultad.size());
            
            b.close();
            
        } catch (FileNotFoundException e) {
            String mnj = "No se encontró el archivo seleccionado\n"
                    + "Recuerde que el archivo debe ser de extensión xls o xlsx";
            JOptionPane.showMessageDialog(null, mnj+"\n"+e , "Error",
            JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            String mnj = "Error al leer el archivo ";
            JOptionPane.showMessageDialog(null, mnj+"\n"+ex , "Error",
            JOptionPane.WARNING_MESSAGE);
        } 
        
    }
    
    /**
     * Ajusta el código de la facultad, departamento y materia
     * para completar el codigo de la materia que debe estar 
     * compuesto por siete caracteres.
     * 
     * @param fila
     * @return 
     */
    
    public FilaCSV ajustarCodigoMateria(FilaCSV fila){
        
        while(fila.getFac().length()<2 && !fila.getFac().isEmpty()){
            fila.setFac("0"+fila.getFac());
        }
        while(fila.getDep().length()<2 && !fila.getDep().isEmpty()){
            fila.setDep("0"+fila.getDep());
        }
        while(fila.getMat().length()<3 && !fila.getMat().isEmpty()){
            fila.setMat("0"+fila.getMat());
        }
        
        return fila;
    }
    
    public void eliminarClavesVacias(){
        facultad.remove("");
        departamento.remove("");
        materia.remove("");
    }
    
    public void mostrarFacultades(){
        Iterator it = facultad.keySet().iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            System.out.println(key + "\t" + facultad.get(key).getNombre());
        }
    }
    
    public void mostrarDepartamentos(){
        Iterator it = departamento.keySet().iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            System.out.println(key + "\t" + departamento.get(key).getNombre());
        }
    }
    
    public void mostrarMaterias(){
        Iterator it = materia.keySet().iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            System.out.println(key + "\t" + materia.get(key).getNombre());
        }
    }
    
    public static void main(String[] args)  {
        ProcesarCSV run = new ProcesarCSV();
        run.crearTablas();
        run.procesarlinea();
        run.eliminarClavesVacias();
        run.mostrarFacultades();
        run.mostrarDepartamentos();
        run.mostrarMaterias();
    }
}
