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
public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int num_pags;

    public Libro() {
    }
    
    public Libro(int isbn, String titulo, String autor, int num_pags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.num_pags = num_pags;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", num_pags=" + num_pags + '}';
    }
    
    public void cargar() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero ISBN:");
        isbn = leer.nextInt();
        System.out.println("Ingrese el numero de paginas:");
        num_pags = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el autor:");
        autor = leer.nextLine();
        System.out.println("Ingrese el titulo:");
        titulo = leer.nextLine();
    }
    
    public void mostrar() {
        System.out.println(this);
    }
    
    
}
