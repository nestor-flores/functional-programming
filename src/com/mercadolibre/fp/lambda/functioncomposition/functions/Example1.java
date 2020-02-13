package com.mercadolibre.fp.lambda.functioncomposition.functions;

import java.util.function.Function;

public class Example1 {

    public static void main(String[] args) {
        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.compose(add);

        Integer result1 = addThenMultiply.apply(3);

        // (3 + 3) * 2
        System.out.println(result1);
    }

}
