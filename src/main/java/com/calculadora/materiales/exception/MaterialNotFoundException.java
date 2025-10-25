package com.calculadora.materiales.exception;

public class MaterialNotFoundException extends RuntimeException {
    public MaterialNotFoundException(String mensaje) {
        super(mensaje);
    }

}
