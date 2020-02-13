package com.mercadolibre.fp.lambda.interfaces;

public class FunctionalInterfaceUsage {

    public static void main(String[] args) {
        FunctionalInterface myInterface = () -> System.out.println("Processing");
        myInterface.print("Text");
    }
}
