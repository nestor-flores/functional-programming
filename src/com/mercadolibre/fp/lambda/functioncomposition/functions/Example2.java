package com.mercadolibre.fp.lambda.functioncomposition.functions;

import java.util.function.Function;

public class Example2 {

    public static void main(String[] args) {
        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);

        Integer result2 = multiplyThenAdd.apply(3);
        //3 * 2 + 3
        System.out.println(result2);
    }
}
