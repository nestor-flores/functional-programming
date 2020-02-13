package com.mercadolibre.fp.lambda.streams.operators.terminal.min;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {
        List<String> stringList = List.of("abc", "def");

        Stream<String> stream = stringList.stream();

        Optional<String> min = stream.min(String::compareTo);

        String minString = min.get();

        System.out.println(minString);
    }
}
