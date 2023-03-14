/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author noeli
 */
public class Ejercicios {
    
    public static void main(String[] args) {
        //ej1();
        //ej2();
        //ej3();
        ej4();
    }
    
    /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
    restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
    matemática y deben devolver sus resultados para imprimirlos en el main. 
    */
    public static void ej1() {
        Scanner leer = new Scanner(System.in);
        boolean running = true;
        System.out.println("Ingrese 2 numeros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        float resultado = 0;
        boolean mostrar;
        while (running) {            
            System.out.println("******************");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            opcion = leer.nextInt();
            
            mostrar = true;
            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    break;
                
                default:
                    System.out.println("Opcion ingresada incorrecta.");
                    mostrar = false;
            }
            
            if (mostrar) {
                System.out.println("El resultado es: "+ resultado);
            }
        }
    }
    
    public static float sumar(int num1, int num2) {
        float resultado;
        resultado = num1 + num2;
        return resultado;
    }
    
    public static float restar(int num1, int num2) {
        float resultado;
        resultado = num1 - num2;
        return resultado;
    }
    
    public static float multiplicar(int num1, int num2) {
        float resultado;
        resultado = num1 * num2;
        return resultado;
    }
    
    public static float dividir(int num1, int num2) {
        float resultado;
        resultado = num1 / num2;
        return resultado;
    }
    
    /*
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
    de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    */
    public static void ej2() {
        Scanner leer = new Scanner(System.in);
        boolean running = true;
        String nombre;
        int edad;
        String seguir;
        while (running) {       
            System.out.println("********************************");
            System.out.println("Ingrese el nombre de la persona:");
            nombre = leer.next();
            System.out.println("Ingrese la edad:");
            edad = leer.nextInt();
            
            if (edad < 18) {
                System.out.println(nombre + " es menor de edad");
            } else {
                System.out.println(nombre + " es mayor de edad");
            }
            
            System.out.println("Quiere seguir mostrando personas?(Si - No):");
            seguir = leer.next();
            
            if (seguir.toLowerCase().equals("no")) {
                break;
            }
        }
    }
    
    /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros 
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
    La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será 
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €

    */
    public static void ej3() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de EUROS: ");
        int saldo = leer.nextInt();
        int opcion;
        do {       
            System.out.println("*********************");
            System.out.println("1. Cambio a DOLAR:");
            System.out.println("2. Cambio a Yen: ");
            System.out.println("3. Cambio a Libra: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    convertir_divisa(saldo, "dolar");
                    break;
                case 2:
                    convertir_divisa(saldo, "yen");
                    break;
                case 3:
                    convertir_divisa(saldo, "libra");
                    break;
                default:
            }
        } while (true);
    }
    
    public static void convertir_divisa(int saldo, String opc) {
        switch (opc) {
            case "dolar":
                System.out.println(saldo + " EUROS son: " + (saldo*1.28611) + " DOLARES.");
                break;
            case "yen":
                System.out.println(saldo + " EUROS son: " + (saldo*129.852) + " YENES.");
                break;
            case "libra":
                System.out.println(saldo + " EUROS son: " + (saldo*0.86) + " LIBRAS.");
                break;
            default:
                System.out.println("Error de divisa.");
        }
    }
    
    /*
    Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por 
    parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
    Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es 
    primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
    */
    public static void ej4() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero por teclado: ");
        int num = leer.nextInt();
        
        if (esPrimo(num)) {
            System.out.println("El numero: " + num + " es primo.");
        } else {
            System.out.println("El numero: " + num + " NO es primo.");
        }
    }
    
    public static boolean esPrimo(int num) {
        for (int i = num-1; i > 1; i--) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
