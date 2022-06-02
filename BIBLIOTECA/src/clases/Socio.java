package clases;

import java.util.*;

public class Socio {

    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private int id;
    private static int incrementador=1;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    private int diasPrestamo=15;
    private ArrayList<Prestamo> prestamos;

    public Socio(String p_dniSocio, String p_nombre, String p_apellido, String p_telefono, String p_direccion) {
        this.setDni(p_dniSocio);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setTelefono(p_telefono);
        this.setDireccion(p_direccion);
        this.setPrestamos(new ArrayList());
        this.id=incrementador;
        incrementador++;
    }

     public int getId(){
return incrementador;
}

    private void setDni(String p_dniSocio) {
        this.dni = p_dniSocio;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public void setDiasPrestamo(int p_diasPrestamo) {
        this.diasPrestamo = p_diasPrestamo;
    }

    private void setPrestamos(ArrayList<Prestamo> p_prestamos) {
        this.prestamos = p_prestamos;
    }

    public String getDniSocio() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getDiasPrestamo() {
        return this.diasPrestamo;
    }


    public ArrayList<Prestamo> getPrestamos() {
        return this.prestamos;
    }

    public void addPrestamo(Prestamo p_prestamo) {
        this.getPrestamos().add(p_prestamo);
    }

  
    public void removePrestamo(Prestamo p_prestamo) {
        this.getPrestamos().remove(p_prestamo);
    }

   
    public int cantLibrosPrestados() {
        int prestados = 0;
        for (Prestamo prestamo : this.getPrestamos()) {
            if (prestamo.getFechaDevolucion() == null) {
                prestados += 1;
            }
        }
        return prestados;
    }

   
    public boolean puedePedir() {
        ArrayList listaPrestamos = this.getPrestamos();
        boolean flag = true;
        for (int i = 0; flag && i < listaPrestamos.size(); i++) {
            Prestamo unPrestamo = (Prestamo) listaPrestamos.get(i);
            if (unPrestamo.getFechaDevolucion() == null) {
                if (unPrestamo.vencido(unPrestamo.getFechaDevolucion())) { 
                    flag = false;
                }
            }
        }
        return flag;
    }

    public String toString() {
        return ("ID: "+ id+ "\nD.N.I.: " + this.getDniSocio() + "\nNombre: " + this.getNombre() + "\nApellidos: " + this.getApellido() + "\nTeléfono: " + this.getTelefono() + "\nDirección: " + this.getDireccion()+"\nLibros prestados: "+this.cantLibrosPrestados()+"\n");
    }

}
