package com.mercadolibre.fp.lambda.streams.operators.nonterminal.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> listStream = stringList.stream();

        Stream<Integer> longStringsStream = listStream.map(String::length);

        longStringsStream.forEach(System.out::println);
    }
}
