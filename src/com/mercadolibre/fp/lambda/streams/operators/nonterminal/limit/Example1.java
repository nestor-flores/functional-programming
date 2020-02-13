package com.mercadolibre.fp.lambda.streams.operators.nonterminal.limit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();
        stream
                .limit(2)
                .forEach(System.out::println);
    }
}
