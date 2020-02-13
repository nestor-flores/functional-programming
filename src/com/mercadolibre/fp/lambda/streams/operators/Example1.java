package com.mercadolibre.fp.lambda.streams.operators;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = List.of("ONE","TWO","THREE");

        Stream<String> stream = stringList.stream();

        long count = stream
                .map(String::toLowerCase)
                .count();

        System.out.println("count = " + count);

    }
}
