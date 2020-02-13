package com.mercadolibre.fp.lambda.functioncomposition.predicates;

import java.util.function.Predicate;

public class Example1 {

    public static void main(String[] args) {
        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX   = (text) -> text.endsWith("x");

        Predicate<String> startsWithAAndEndsWithX =
                (text) -> startsWithA.test(text) && endsWithX.test(text);

        String  input  = "A hardworking person must relax";
        boolean result = startsWithAAndEndsWithX.test(input);
        System.out.println(result);
    }
}
