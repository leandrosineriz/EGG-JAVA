/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //guia();
        //ej1();
        //ej2();
        //ej3();
        //ej4();
        //ej5();
        //ej6();
        //ej7();
        //ej8();
        //ex1();
        //ex2();
        //ex3();
        ex4();
    }
    
    public static void guia(){
        Scanner leer = new Scanner(System.in);
        
        /* ej6
        **
        System.out.println("Ingrese 2 numeros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25) {
            System.out.println("Uno de los numeros ingresados es mayor a 25");
        }else{
            System.out.println("Ninguno de los numeros ingresados es mayor a 25");
        }
        */
        
        /*ej7
        
        System.out.println("Ingrese el valor del motor(1-4): ");
        int tipo_bomba = leer.nextInt();
        
        switch (tipo_bomba) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        */
        
        /*EJ8
        **
        System.out.println("Ingrese una nota(1 - 10): ");
        int nota = leer.nextInt();
        
        while (nota > 10 || nota <= 0) {
            System.out.println("La nota no es valida. Ingrese de nuevo(1 - 10): ");
            nota = leer.nextInt();
        }
        */
        
        /*EJ9
        System.out.println("Ingrese 4 numeros");
        
        int[] nums;
        nums = new int[4];          
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = leer.nextInt();      
        }
        
        for (int j = 0; j < nums.length; j++) {   
            System.out.print(nums[j]);
            for (int i = 0; i < nums[j]; i++) {
                System.out.print("*");       
            }
            System.out.println("");
        }
        */
    }
    
    //Crear un programa que dado un número determine si es par o impar.
    public static void ej1(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero es par.");
        }else{
            System.out.println("El numero es impar.");
        }
    }
    
    /*
    Crear un programa que pida una frase y si esa frase es igual a “eureka” 
    el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
    Incorrecto. Nota: investigar la función equals() en Java.
    */
    public static void ej2(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
    
    /*
    Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
    largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
    un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
    “INCORRECTO”. Nota: investigar la función Lenght() en Java.
    */
    public static void ej3() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        if (frase.length() == 8) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto. " + "(" + frase.length() + ")" + frase);
        }
    }
    
    /*
    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
    frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: 
    investigar la función Substring y equals() de Java.
    */
    public static void ej4() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = leer.nextLine();
        
        if (palabra.substring(0, 1).equals("A")) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }   
    }
    
    /*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
    numeros al usuario hasta que la suma de los números introducidos supere el límite inicial.
    */
    public static void ej5() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el limite positivo: ");
        int limite = leer.nextInt();
        
        int suma = 0;
        while (suma < limite) {            
            System.out.println("Ingrese un numero: ");
            suma += leer.nextInt();
            System.out.println("Suma: " + suma + " - Limite: " + limite);
        }
        
        System.out.println("Fin.");
    }
    
    /*
    Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
    el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
    por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 
    5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
    Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
    */
    public static void ej6() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros positivos: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        boolean running = true;
        
        while (running) {            
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opción:");
            
            int choice = leer.nextInt();
            System.out.println("");
            switch (choice) {
                case 1:
                        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case 2:
                        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case 3:
                        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                    break;
                    
                case 4:
                        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String salir = leer.next();
                    
                    if (salir.equalsIgnoreCase("s")) {
                        running = false;
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");                                    
            }  
            System.out.println("#####################################");
            System.out.println("");
        }              
    }
    
    /*
    Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
    X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial 
    “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, 
    que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
    incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
    siguientes funciones de Java Substring(), Length(), equals().
    */
    public static void ej7() {
        Scanner leer = new Scanner(System.in);
        
        int correctas = 0;
        int incorrectas = 0;
        boolean running = true;
        while (running) {            
            System.out.println("Ingrese una cadena:");
            String cadena = leer.next();
            
            if (cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O") && cadena.length() == 5) {
                correctas += 1;
            } else if (cadena.equals("&&&&&")) {
                running = false;
            } else {
                incorrectas += 1;
            }
        }
        
        System.out.println("Informe:");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);
    }
    
    /*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    */
    public static void ej8() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num-1) {
                    System.out.print("*"); 
                } else {
                    if (j == 0 || j == num-1) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                               
            }
            System.out.println("");            
        }
    }
    
    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario 
    ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    */
    public static void ex1() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos: ");
        int min = leer.nextInt();
        
        if (min > 60) {
            int hrs = min/60;
            min = min - hrs*60;
            
            if (hrs > 24) {
                int dias = hrs/24;
                hrs = hrs - dias*24;
                
                System.out.println("Dias: " + dias + " - Hrs: " + hrs + " - Min: " + min);
            } else {
                System.out.println("Hrs: " + hrs + " - Min: " + min);
            }   
        } else {
            System.out.println("min: " + min);
        }             
    }
    
    /*
    Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
    A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el 
    valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores 
    finales de cada variable. Utilizar sólo una variable auxiliar.
    */
    public static void ex2() {
        Scanner leer = new Scanner(System.in);
        
        int A = (int) (Math.random()*11);
        int B = (int) (Math.random()*11);
        int C = (int) (Math.random()*11);
        int D = (int) (Math.random()*11);
        
        System.out.println("Valores iniciales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("******************");
        System.out.println("Valores Finales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
    }
    
    /*
    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso 
    contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
    */
    public static void ex3() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una VOCAL:");
        String letra = leer.next();
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") ||
            letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {            
            System.out.println("Correcto.");        
        } else {
            System.out.println("Incorrecto.");        
        }       
    }
    
    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
    */
    public static void ex4() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 - 10: ");
        int num = leer.nextInt();
        String numR = "";
        
        switch (num) {
            case 1:
                numR = "I";
                break;
            case 2:
                numR = "II";
                break;
            case 3:
                numR = "III";
                break;
            case 4:
                numR = "IV";
                break;
            case 5:
                numR = "V";
                break;
            case 6:
                numR = "VI";
                break;
            case 7:
                numR = "VII";
                break;
            case 8:
                numR = "VIII";
                break;
            case 9:
                numR = "IX";
                break;
            case 10:
                numR = "X";
                break;
            default:
                System.out.println("Numero incorrecto.");
                num = -1;
        }
        
        if (num != -1) {
            System.out.println("Numero: " + num + " - Romano: " + numR);
        }
        
    }
    
    /*
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
    y el promedio de estaturas en general.
    */
    public static void ex6(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas: ");
        int cant = leer.nextInt();
        
        
        
    }
}
