
package org.example;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManejoCadenas MC = new ManejoCadenas();

        System.out.print("Ingrese el texto: ");
        String lectTeclado = sc.nextLine();

        try{
            char resultado = MC.caracterEn(lectTeclado, 7);
            System.out.println("La letra en la posicion 7 es: " + resultado);
        } catch(Exception e){
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }
}



