
package com.unida.persona;

public class Estudiante extends Persona {
    private String carrera;
    public Estudiante(String nombre, String carrera){
        super (nombre); // llama al contructor Persona 
        this.carrera = carrera ;
    }
    public void mostrarDatos() { System.out.println("Estudiante: " + nombre + " Carrera : " + carrera);}
}
    

