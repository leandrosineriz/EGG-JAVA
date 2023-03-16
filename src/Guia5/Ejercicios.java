/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Ejercicios {
    
    public static void main(String[] args) {
        //ej1();
        //ej2();
        //ej3();
        //ej4();
        //ej5();
        ej6();
    }
    
    /*
    Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por 
    pantalla en orden descendente.
    */
    public static void ej1() {
        int[] nums = new int[100];
        
        for (int i = 0; i < 100; i++) {
            nums[i] = i;
            
        }
        
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        
    }
    
    /*
    Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al 
    usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero 
    y si se encuentra repetido
    */
    public static void ej2() {
        Scanner leer = new Scanner(System.in);
        int[] nums = new int[1000];
        
        for (int i = 0; i < 1000; i++) {
            nums[i] = (int) (Math.random()*100);
        }
        
        System.out.println("Ingrese un numero a buscar(0 - 100): ");
        int num_buscar= leer.nextInt();
        
        for (int i = 0; i < 1000; i++) {
            if (nums[i] == num_buscar) {
                System.out.println("Se encontro el numero: " + num_buscar + " en la posicion: " + i);
            }
        }
    }
    
    /*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, 
    etcétera (hasta 5 dígitos).
    */
    public static void ej3() {
        int[] nums = new int[5000];
        int dig_uno = 0;
        int dig_dos = 0;
        int dig_tres = 0;
        int dig_cuatro = 0;
        int dig_cinco = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100000);
            //System.out.println(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i]/1 < 10) {
                dig_uno++;
            } else if (nums[i]/10 < 10) {
                dig_dos++;
            } else if (nums[i]/100 < 10) {
                dig_tres++;
            } else if (nums[i]/1000 < 10) {
                dig_cuatro++;
            } else if (nums[i]/10000 < 10) {
                dig_cinco++;
            }
        }
        
        System.out.println("Numeros de 1 digito: " + dig_uno);
        System.out.println("Numeros de 2 digito: " + dig_dos);
        System.out.println("Numeros de 3 digito: " + dig_tres);
        System.out.println("Numeros de 4 digito: " + dig_cuatro);
        System.out.println("Numeros de 5 digito: " + dig_cinco);
    }
    
    /*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de 
    la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por 
    columnas (o viceversa).
    */
    public static void ej4() {
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("***************************");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
    /*
    Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es 
    antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es 
    antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
    sus filas por columnas (o viceversa).
    */
    public static void ej5() {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        if (validar_matriz_antisimetrica(matriz)) {
            System.out.println("La matriz es Antisimetrica.");
        } else {
            System.out.println("La matriz NO es Antisimetrica");
        }
    }
    
    public static void cargar_matriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numeros entre el 1 - 9:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //matriz[i][j] = (int) (Math.random() * 100);
                System.out.println("Posicion " + i + " - " + j);
                matriz[i][j] = leer.nextInt();
                while (matriz[i][j] > 9 || matriz[i][j] < 1) {                    
                    System.out.println("Error. Posicion " + i + " - " + j);
                    matriz[i][j] = leer.nextInt();
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("*****************");
    }
    
    public static boolean validar_matriz_antisimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!(matriz[i][j] == (matriz[j][i]*-1))) {
                    return false;
                }
            }
        }     
        return true;
    }
    
    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
    sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
    y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son 
    correctos, es decir, están entre el 1 y el 9.
    */
    public static void ej6() {
        int[][] matriz = new int[3][3];
        int[] sum_filas = new int[3];
        int[] sum_columnas = new int[3];
        int[] sum_diagonales = new int[2];
        System.out.println(matriz.length/2);
        cargar_matriz(matriz);
        
        //inicializo matrices
        for (int i = 0; i < sum_filas.length; i++) {
            sum_columnas[i] = 0;
            sum_filas[i] = 0;
        }
        
        for (int i = 0; i < sum_diagonales.length; i++) {
            sum_diagonales[i] = 0;
        }
        
        //sumo columnas, filas y diagonales
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum_filas[i] += matriz[i][j];
                sum_columnas[i] += matriz[j][i];
                if (i == (matriz.length/2) && j == (matriz[i].length/2)) {
                    System.out.println(matriz[i][j]);
                    sum_diagonales[0] += matriz[i][j];
                    sum_diagonales[1] += matriz[i][j];
                }else if (i == j) {
                    sum_diagonales[0] += matriz[i][j];
                } else if (j + i == 2) {
                    //System.out.println(matriz[i][j]);
                    sum_diagonales[1] += matriz[i][j];
                }
            }
        }
        /*
        for (int i = 0; i < sum_diagonales.length; i++) {
            System.out.println("diag " + sum_diagonales[i]);
            System.out.println("fila " + sum_filas[i]);
            System.out.println("colum " + sum_columnas[i]);
        }
        */
        if (matriz_magica_validar(sum_filas, sum_columnas, sum_diagonales)) {
            System.out.println("Este cuadrado es mágico");
        } else {
            System.out.println("Este cuadrado NO es mágico");
        }
    }
    
    public static boolean matriz_magica_validar(int[] filas, int[] colums, int[] diags) {
        int validador = filas[0];
        
        for (int i = 0; i < filas.length; i++) {
            if (filas[i] != validador || colums[i] != validador) {
                return false;
            }
        }
        
        for (int i = 0; i < diags.length; i++) {
            if (diags[i] != validador) {
                return false;
            }
        }
        return true;
    }
}
