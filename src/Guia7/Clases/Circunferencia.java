/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.Clases;

import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Circunferencia {
    
    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void crear_circunferencia() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio: ");
        radio = leer.nextFloat();
    }
    
    public float area() {
        return (float) (Math.pow(radio, 2) * Math.PI);
    }
    
    public float perimetro() {
        return (float) (radio * 2 * Math.PI);
    }
    
}
