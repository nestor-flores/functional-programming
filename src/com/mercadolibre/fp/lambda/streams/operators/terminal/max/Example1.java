package com.mercadolibre.fp.lambda.streams.operators.terminal.max;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {
        List<String> stringList = List.of("abc", "def");

        Stream<String> stream = stringList.stream();

        Optional<String> max = stream.max(String::compareTo);

        String minString = max.get();

        System.out.println(minString);
    }
}
