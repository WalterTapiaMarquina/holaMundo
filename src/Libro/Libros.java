/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

import Entidades.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author Walter
 */
public class Libros {
    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        Libro l1 = ls.altaLibro();
        ls.muestraLibro(l1);
        
        
        
        
           }
}
