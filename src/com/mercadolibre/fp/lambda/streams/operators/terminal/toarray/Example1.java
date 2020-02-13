package com.mercadolibre.fp.lambda.streams.operators.terminal.toarray;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {
        List<String> stringList = List.of("One flew over the cuckoo's nest", "To kill a muckingbird", "Gone with the wind");

        Stream<String> stream = stringList.stream();

        Object[] strings = stream.toArray();

        IntStream.range(0, strings.length).forEach(i -> System.out.println(strings[i]));
    }
}
