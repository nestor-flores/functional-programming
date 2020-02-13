package com.mercadolibre.fp.lambda.interfaces.supplier;

import java.util.function.Supplier;

public class Example1 {

    public static void main(String[] args) {

        Supplier<Double> randomValue = Math::random;

        System.out.println(randomValue.get());
    }
}
