package com.mercadolibre.fp.lambda.streams;

import java.util.List;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args) {
        List<String> stringList = List.of("Elemento 1", "Elemento 2", "Elemento 3");

        Stream<String> stringStream = stringList.stream();

        Stream<String> upperStream = stringStream.map(String::toUpperCase);

        Stream<String> lowerStream = upperStream.map(String::toLowerCase);

        lowerStream.forEach(System.out::println);
    }
}
