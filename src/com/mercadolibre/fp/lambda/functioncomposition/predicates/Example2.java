package com.mercadolibre.fp.lambda.functioncomposition.predicates;

import java.util.function.Predicate;

public class Example2 {

    public static void main(String[] args) {
        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX   = (text) -> text.endsWith("x");

        Predicate<String> composed = startsWithA.or(endsWithX);

        String input = "A hardworking person must relax sometimes";
        boolean result = composed.test(input);
        System.out.println(result);
    }
}
