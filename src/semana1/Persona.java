/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

/**
 *
 * @author laboratorio
 */
public class Persona{
    String nombre;
    String apellido;
    int edad;
    String cedula;
    boolean sexo;
    int cantHermanos;

    public Persona() {
    }

    public Persona(String nombre, 
            String apellido, int edad, 
            String cedula, boolean sexo,
            int cantHermanos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.cantHermanos = cantHermanos;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getCantHermanos() {
        return cantHermanos;
    }

    public void setCantHermanos(int cantHermanos) {
        this.cantHermanos = cantHermanos;
    }
    
   
    public boolean comer(String comida) {
        if (comida.equals("yummy")) {
            return true;
        }
        return false;
    }

    public void dormir() {
        throw new 
        UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
