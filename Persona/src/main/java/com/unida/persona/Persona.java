package com.unida.persona;

public class Persona {
    //atributos o variables de instancia
    String nombre;
    String apellido;
    int edad;
    String ci;
    String direccion;
    
    //para desplegar la informacion del objeto
    public void mostrarInformacion(){
        System.out.println("=== INFORMACION DE LA PERSONA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
        System.out.println("Dirección: " + direccion);
    }
}