package com.mercadolibre.fp.lambda.streams.operators.terminal.reduce;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = List.of("One flew over the cuckoo's nest","To kill a muckingbird", "Gone with the wind");

        Stream<String> stream = stringList.stream();

        Optional<String> reduced = stream.reduce((value, combinedValue) -> combinedValue + " + " + value);

        System.out.println(reduced.get());
    }
}
