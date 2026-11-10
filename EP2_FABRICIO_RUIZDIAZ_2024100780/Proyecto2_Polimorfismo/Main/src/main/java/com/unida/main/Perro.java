
package com.unida.main;


public class Perro extends Animal {
    public Perro (String nombre) { super(nombre); }
    @Override//Anotacion de sobreescritura
    public void hacerSonido() {System.out.println(nombre + "dice: Guauuu!");}
    
}
