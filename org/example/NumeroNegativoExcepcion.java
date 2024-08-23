package org.example;

public class NumeroNegativoExcepcion extends Exception {

    public NumeroNegativoExcepcion() {
        super("El numero no puede ser negativo.");
    }

    public NumeroNegativoExcepcion(String Excepcion) {
        super(Excepcion);
    }
}
