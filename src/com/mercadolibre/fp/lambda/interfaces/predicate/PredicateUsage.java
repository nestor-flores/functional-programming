package com.mercadolibre.fp.lambda.interfaces.predicate;

import java.util.function.Predicate;

public class PredicateUsage {

    public static void main(String[] args) {

        //Usando intefaces
        Predicate checkNull = new CheckForNull();
        Long l = 3l;
        System.out.println(checkNull.test(l));

        //Usando lambda expressions
        Predicate checkNullLambda = (value) -> value != null;
        String text = "text1";
        System.out.println(checkNullLambda.test(text));

    }
}
