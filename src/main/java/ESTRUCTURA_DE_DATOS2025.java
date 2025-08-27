/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumnog
 */
public class ESTRUCTURA_DE_DATOS2025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ENTERO
    byte diaMes = 127;
    short anio = 2025;
    int edad= 10;
    long granosArena= 1000000000;
    //NUMEROS DECIMALES
    float precio = 250.50f; //hasta 7 decimales
    double pi = 3.141592; //15 decimales
    
    char grupo = 'c'; //solo un caracter
    boolean activo = true; //valor true o fake solamente
    
    //cadena de caracteres entre comillas dobles " " 
    String nombre = "Miguel Campa";
    char inicial = nombre.charAt(0);
    
    /*
        System.out.println("la inicial es: "+inicial);
      
        System.out.println("Nombre" + nombre);
        System.out.println("Edad" +edad);
        System.out.println("Año" +anio);
        System.out.println("Dia" + diaMes);
        System.out.println("Precio" + granosArena);
        System.out.println("decimales" + pi);
        System.out.println("Char" + grupo);
        System.out.println("Bolean" + activo);
    */        
    
    //Longitud de el valor de la variable
    // Nombre = "Arturo Garcia Saiza
    
        System.out.println(nombre.length());
        System.out.println(nombre.charAt(0));
    
    
    
    
    
    }
    
}
