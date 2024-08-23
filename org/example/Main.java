package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        try {
            if (numero < 0) {
                throw new NumeroNegativoExcepcion("No se puede calcular la raíz cuadrada de un número negativo.");
            } else {
                double raiz = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
