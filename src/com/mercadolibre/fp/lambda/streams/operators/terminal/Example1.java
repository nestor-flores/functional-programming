package com.mercadolibre.fp.lambda.streams.operators.terminal;

import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<String> stringList = List.of("ONE", "TWO", "THREE");

        long count = stringList.stream()
                .map(String::toLowerCase)
                .map(value -> value.substring(0,3))
                .count();

        System.out.println(count);
    }
}
