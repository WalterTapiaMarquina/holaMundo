/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class LibroServicio {
    Scanner leer = new Scanner (System.in);
    
    public Libro altaLibro(){
        Libro l1 = new Libro();
        System.out.println("Ingrese el numero de ISBN");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese el Titulo del libro");
        l1.setTitulo(leer.next());
        
        System.out.println("Ingrese el Autor");
        l1.setAutor(leer.next());
        
        System.out.println("Ingrese el numero de paginas");
        l1.setNumPaginas(leer.nextInt());
        
        
        
       return l1; 
    }
    
    public void muestraLibro(Libro l1){
        System.out.println("El Titulo del libro es: " + l1.getTitulo() + ", el nombre del autor es: "+l1.getAutor()+
                ", el numero de paginas es: " + l1.getNumPaginas()+",el el numero de ISBN es: "+l1.getISBN());
    }
}
