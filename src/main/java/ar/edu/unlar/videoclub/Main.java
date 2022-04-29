/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.edu.unlar.videoclub;

import com.mycompany.videoclub.objects.Categoria;
import com.mycompany.videoclub.objects.Pelicula;

/**
 *
 * @author agus-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pelicula spiderman = new Pelicula();
        
        Categoria categoria = new Categoria();
        categoria.setNombre("Accion");
        
        Categoria otraCategoria = new Categoria();
        otraCategoria.setNombre("Ciencia Ficcion");
        
        spiderman.setNombre ("lejos de casa");
        spiderman.setAnioEstreno(1994);
        spiderman.setCategoria(categoria);
        
        System.out.println(spiderman);
        System.out.println("Programa terminado!");
        
    }
    
}
