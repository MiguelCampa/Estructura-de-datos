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
        System.out.println(nombre.charAt(nombre.length()-1));
    
    String pasword = "Camaron25";
    
    if(pasword.equals("Camaron25")){
        System.out.println("Bienvenido al Sistema");       
     
    }else{     
        System.out.println("Contraseña incorrecta");
        
        
    String usuario = "Abelito";   
        
       if(usuario.equalsIgnoreCase("AbElItO")){
        System.out.println("Usuario correcto");       
     
    }else{      
       System.out.println("Ese usualio no existe");
           
           
       
       
       //Convertir las letras a 
       //Mayuscula
           System.out.println(nombre.toUpperCase());
       //Minuscula
           System.out.println(nombre.toLowerCase());
       //Eliminar espacio
           System.out.println(nombre.trim());
       
           String correo = "mcampaaceves@gmail.com";
           
           //gmail
           //termine en ".com"
           //Que tenga el "@"
           if(
             correo.contains("gmail") //TRUE si la variable contiene el gmail
             && correo.endsWith(".com") //TRUE Si contiene el ".com"
             ){ 
            System.out.println("correo valido");
                   
           }else{
               System.out.println("Correo invalido ! XXXXX");
           
           }
           //regresa el indice, si no lo encuentra regresa -1
           System.out.println(correo.indexOf("@"));
           System.out.println(correo.startsWith("Kimberly"));
           
           //Extraccion
           String clase = "EstructuraDeDatos";
           String palabra1 = clase.substring(0,10);
           String palabra2 = clase.substring(10);
           
           System.out.println("Palabra original:" + clase);
           System.out.println("Primera parte"+palabra1);
           System.out.println("Ultima parte"+palabra2);
           
           
           //Remplazar Caracteres
           
           String itson = "INSTITUTO TECNOLOGICO DE SONORA";
           
           String itson2 = itson.replace(" ", "-");
           itson2 = itson.replace("T", "L");
           itson2 = itson2.replace("A", "E");
           System.out.println("itson2");
                   
           //Remplazar mucho por uno
           System.out.println(itson.replaceAll("[AEIOUaeiou]","*"));
           
           String palabra3 = "Hola Mundo";
           
           System.out.println(palabra3.replace("Mundo", "Casa de los famosos"));
           
           //Split
           //Una sola cadena de texto la vuelve varias cadenas 
           
           // Miguel Humberto Campa Aceves 00000268635
           
           String nombres = "Lupita.Maria.Juana.Josefina";
           String [] listaNombre = nombres.split(".");
          
           
           System.out.println("1 :" +listaNombre[0]);  
           System.out.println("2 :" +listaNombre[1]);
           System.out.println("3 :" +listaNombre[2]);
           System.out.println("4 :" +listaNombre[3]);
           }
           
    }
    
}
}
