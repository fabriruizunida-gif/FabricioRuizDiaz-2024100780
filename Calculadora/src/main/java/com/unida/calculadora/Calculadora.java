package com.unida.calculadora;

public class Calculadora {
    
    //metodos para sumar dos numeros 
    
    public int sumar (int a, int b){
        return a + b;
    }
    
    public int sumar (int a, int b, int c){
        return a + b + c;
    }
    
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("SUMA DE DOS NUMEROS: " + calc.sumar(1,2));
        System.out.println("SUMA DE TRES NUMEROS: " + calc.sumar(1,2,3));
    }
}
