package com.mercadolibre.fp.lambda.streams.operators.terminal.anymatch;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {

        List<String> stringList = List.of("One flew over the cuckoo's nest", "To kill a muckingbird", "To kill a muckingbird");


        Stream<String> stream = stringList.stream();

        boolean anyMatch = stream.anyMatch((value) -> value.startsWith("One"));

        System.out.println(anyMatch);
    }
}
