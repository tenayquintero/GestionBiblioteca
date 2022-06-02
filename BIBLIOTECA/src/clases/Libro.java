package clases;

import java.util.*;


 // @author Yaneth
 
 
public class Libro {

    private String titulo;
    private int edicion;
    private String editorial;
    private int anio;
    private ArrayList<Prestamo> prestamos;

    Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio) {
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
        this.setPrestamos(new ArrayList<Prestamo>());
    }

    Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio, ArrayList p_prestamos) {
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
        this.setPrestamos(p_prestamos);
    }

   
    private void setTitulo(String p_titulo) {
        this.titulo = p_titulo;
    }

    
    private void setEdicion(int p_edicion) {
        this.edicion = p_edicion;
    }

    
    private void setEditorial(String p_editorial) {
        this.editorial = p_editorial;
    }

    
    private void setAnio(int p_anio) {
        this.anio = p_anio;
    }

   
    private void setPrestamos(ArrayList<Prestamo> p_prestamos) {
        this.prestamos = p_prestamos;
    }

    
    public String getTitulo() {
        return this.titulo;
    }

   
    public int getEdicion() {
        return this.edicion;
    }

   
    public String getEditorial() {
        return this.editorial;
    }

   
    public int getAnio() {
        return this.anio;
    }

    
    public Prestamo getPrestamo() {
        return this.getPrestamos().get(this.getPrestamos().size() - 1);
    }

    
    public ArrayList<Prestamo> getPrestamos() {
        return this.prestamos;
    }

    public boolean addPrestamo(Prestamo p_prestamos) {
        return this.getPrestamos().add(p_prestamos);
    }

    public boolean removePrestamo(Prestamo p_prestamos) {
        if (this.getPrestamos().isEmpty() == true) {
            return false;
        } else {
            return this.getPrestamos().remove(p_prestamos);
        }
    }

   
    public boolean prestado() {
        if (this.getPrestamos().size() > 0) {
            if (this.getPrestamo().getFechaDevolucion() == null) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

   
    public String toString() {
        return "Titulo: " + this.getTitulo();
    }
}
