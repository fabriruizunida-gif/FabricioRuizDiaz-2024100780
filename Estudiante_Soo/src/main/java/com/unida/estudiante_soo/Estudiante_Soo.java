package com.unida.estudiante_soo;

public class Estudiante_Soo extends Persona {
private String matricula;
private String carrera;

public Estudiante_Soo (String nombre, String cedula, String matricula, String carrera) {
super(nombre, cedula); // Llama al constructor de Persona
this.matricula = matricula;
this.carrera = carrera;
}

@Override
public String toString() {
return super.toString() + " | Matricula: " + matricula + "| Carrera: " + carrera;
}

public static void main(String[] args){
    Estudiante_Soo e = new Estudiante_Soo ("Fabricio ", "798989", "2024100780", "Ingenieria Informatica");
    System.out.println(e);
}
}
