/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Guia7.Clases.Circunferencia;
import Guia7.Clases.Libro;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Ejercicios {
    
    public static void main(String[] args) {
        //ej1();
        ej2();
    }
    
    /*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
    y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para 
    cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, 
    el autor del libro y el número de páginas.
    */
    public static void ej1() {
        Libro lb1 = new Libro();
        
        lb1.cargar();
        lb1.mostrar();
    }
    
    
    /*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
    A continuación, se deben crear los siguientes métodos:
    Método constructor que inicialice el radio pasado como parámetro.
    Métodos get y set para el atributo radio de la clase Circunferencia.
    Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
    Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
    */
    
    public static void ej2() {
        Circunferencia cir1 = new Circunferencia(0);
        
        cir1.crear_circunferencia();
        
        System.out.println("Area: " + cir1.area());
        System.out.println("Perimetro: " + cir1.perimetro());
    }
}
