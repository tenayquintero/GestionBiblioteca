
package clases;

import java.util.*;

public class Biblioteca {

    //Atributos
    private String nombre;
    private ArrayList<Socio> socios;
    private ArrayList<Libro> libros;

   
    public Biblioteca(String p_nombre) {
        //Inicializamos los Atributos
        this.setNombre(p_nombre);
        this.setSocios(new ArrayList<Socio>());
        this.setLibros(new ArrayList<Libro>());
    }

    
 /*   public Biblioteca(String p_nombre, ArrayList<Socio> p_socios, ArrayList<Libro> p_libros) {
        //Inicializamos los Atributos
        this.setNombre(p_nombre);
        this.setSocios(p_socios);
        this.setLibros(p_libros);
    }

   
    public Biblioteca(String p_nombre, Socio p_socio, Libro p_libros) {
        this.setNombre(p_nombre);
        this.setSocios(new ArrayList<Socio>());
        this.setLibros(new ArrayList<Libro>());
        this.addSocio(p_socio);
        this.addLibro(p_libros);
    }*/

   
    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    
    public String getNombre() {
        return this.nombre;
    }

  
    private void setSocios(ArrayList<Socio> p_socio) {
        this.socios = p_socio;
    }

   
    public ArrayList<Socio> getSocios() {
        return this.socios;
    }

   
    private void setLibros(ArrayList<Libro> p_libros) {
        this.libros = p_libros;
    }

   
    public ArrayList<Libro> getLibros() {
        return this.libros;
    }

   
    public void addSocio(Socio p_socio) {
        this.getSocios().add(p_socio);
    }

  
    public void removeSocio(Socio p_socio) {
        this.getSocios().remove(p_socio);
    }

 
    public void addLibro(Libro p_libro) {
        this.getLibros().add(p_libro);
    }

  
    public void removeLibro(Libro p_libro) {
        this.getLibros().remove(p_libro);
    }

   
    public void nuevoLibro(String p_titulo, int p_edicion, String p_editorial, int anio) {
        Libro unLibro = new Libro(p_titulo, p_edicion, p_editorial, anio);
        this.addLibro(unLibro);
    }

   
    public void nuevoSocio(String p_nombre, String p_apellido, String p_dniSocio, String p_telefono, String p_direccion) {
        Socio unSocio = new Socio(p_dniSocio, p_nombre, p_apellido, p_telefono, p_direccion);
        this.addSocio(unSocio);
    }

  
     
    
    public boolean prestarLibro(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro) {
        boolean flag = true;
        if (p_libro.prestado() == false) {
            if (p_socio.puedePedir() == true) {
                Prestamo unPrestamo = new Prestamo(p_fechaRetiro, p_socio, p_libro);
                p_socio.addPrestamo(unPrestamo);
                p_libro.addPrestamo(unPrestamo);
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }

   
    public void devolverLibro(Libro p_libro) {
        Calendar fechaHoy = new GregorianCalendar();
        Prestamo prestamo = p_libro.getPrestamo();
        prestamo.registrarFechaDevolucion(fechaHoy);
    }

   
    public ArrayList<Prestamo> prestamosVencidos() {
        Calendar fechaHoy = new GregorianCalendar();
        ArrayList<Prestamo> vencidos = new ArrayList<Prestamo>();
        for (Libro libro : this.getLibros()) {
            if (libro.prestado() == true) {
                Prestamo prestamo = libro.getPrestamo();
                if (prestamo.vencido(fechaHoy) == true) {
                    vencidos.add(prestamo);
                }
            }
        }
        return vencidos;
    }

  
   
    public String quienTieneElLibro(Libro p_libro) {
        if (p_libro.prestado()) {
            return (p_libro.getPrestamo().getSocio().getNombre() + " tiene el libro " + p_libro.getTitulo());
        } else {
            return ("El libro " + p_libro.getTitulo() + " se encuentra en la biblioteca");
        }
    }

   
    public String listaDeSocios() {
        int cuenta = 1;
        String lista = "LISTA DE SOCIOS\n*****************************************************************************" + ("\n");
        for (int i = 0; i < this.getSocios().size(); i++) {
            lista = lista + (this.getSocios().get(i)).toString() + ("\n");
            cuenta++;
           
        }
       
        return lista;
    }

    /**
     * Devuelve el listado de libros y si los mismos se encuentran prestados o
     * no
     *
     * @return Devuelve un String
     */
    public String listaDeLibros() {
        String impresion = "LISTA DE LIBROS\n**********************************************************" + ("\n");
        String cond = " ";
        int cuenta = 1;
        for (Libro unLibro : this.getLibros()) {
            if (unLibro.prestado()) {
                cond = "SI";
            } else {
                cond = "NO";
            }
            impresion = impresion + cuenta + ") " + unLibro.toString() + " || Prestado: " + cond + "\n";
            cuenta++;
        }
        return impresion;
    }

    /**
     * Devuelve un objeto tipo Socio con el DNI especificado.
     *
     * @return Un socio respecto del parametro ingresado
     */
  public Socio buscarSocio(String p_dni) {
        Socio p_socio = null;
       

        for (Socio socio : this.getSocios()) {
            if (socio.getDniSocio().equals(p_dni)) {

                p_socio = socio;
            }
        }
        return p_socio;
    }
    
 
  /* public String toString() {
		return "Biblioteca [nombre=" + nombre + ", socios=" + socios + ", libros=" + libros + "]";
	}*/

    
    
    
}//Fin clase Biblioteca
