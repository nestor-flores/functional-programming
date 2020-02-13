package com.mercadolibre.fp.lambda.interfaces.function;

import java.util.function.Function;

public class FunctionUsage {

    public static void main(String[] args) {

        //Usando interfaces
        Function<Long, Long> adder = new AddThree();
        Long result = adder.apply((long) 4);
        System.out.println("result = " + result);

        //Usando Lambda Expressions
        Function<Long, Long> adderExpression = (value) -> value + 3;
        Long resultLambda = adderExpression.apply((long) 8);
        System.out.println("resultLambda = " + resultLambda);



    }
}
