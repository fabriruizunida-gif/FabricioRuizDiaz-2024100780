package com.unida.persona;

public class Ejemplopersona {
    public static void main (String[] args){
        //instaciacion del objeto personal 
        Persona personal = new Persona();
        
        //asignacion de atributos mediante notacion de punto
        personal.nombre = "Sandra";
        personal.apellido = "Zarate";
        personal.edad = 20;
        personal.ci = "5497020";
        personal.direccion = "villa elisa";
        
        //invocacion del metodo para mostrar los datos 
        personal.mostrarInformacion();
    }
}
