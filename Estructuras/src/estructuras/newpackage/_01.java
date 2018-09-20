/*
Permita loguearse a un sistema, ingresando un nombre de usuario y la contraseña adecuada. Considerar que tanto
el usuario como la contraseña están formados sólo por letras. El sistema deberá validar que el usuario y la
contraseña sean correctas, comparándolas con lo que es sistema tiene registrado para ese usuario.(*)
 
 */
package estructuras.newpackage;

import java.util.Scanner;

public class _01 {
    
public static void main(String[] args) {
    String usuario1, pass1 = null,usuario2 = "lola" , pass2="lolo1"; //palabras

     Scanner teclado = new Scanner(System.in);// scanner para ingresar algo por pantalla
     
     System.out.println("Ingrese usuario");
     
     usuario1 = teclado.nextLine(); 
     
     if(usuario2.equals(usuario1))
     {
     
         System.out.println("Bienvenido");
     }else
     {
     System.out.println("Error. Ingrese un usuario valido");
     }
     if(usuario2.equals(usuario1)){
         System.out.println("Ingrese contraseña");
          pass1 = teclado.nextLine();
     if(pass2.equals(pass1))
     {
         System.out.println("Contraseña correcta");
     }else
     {
         System.out.println("Contraseña incorrecta. Intentelo nuevamente");
     }
     }
     
    
}

}