package com.mercadolibre.fp.lambda.streams.operators.terminal.count;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = List.of("One flew over the cuckoo's nest", "To kill a muckingbird", "Gone with the wind");

        Stream<String> stream = stringList.stream();

        long count = stream.flatMap((value) -> {
            String[] split = value.split(" ");
            return Arrays.stream(split);
        }).count();

        System.out.println("count = " + count);
    }
}
