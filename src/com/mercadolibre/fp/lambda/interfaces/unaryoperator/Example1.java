package com.mercadolibre.fp.lambda.interfaces.unaryoperator;


import java.util.function.UnaryOperator;

public class Example1 {
    public static void main(String[] args) {

        UnaryOperator<Integer> operator = t -> t * 2;

        System.out.println(operator.apply(5));
        System.out.println(operator.apply(10));
        System.out.println(operator.apply(15));
    }
}