package com.mercadolibre.fp.lambda.streams.operators.nonterminal.peek;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {
        List<String> stringList = DataUtil.WORDS_LIST;

        Stream<String> stream = stringList.stream();

        Stream<String> streamPeeked = stream.peek(value -> System.out.println("peeling value: " + value));

        streamPeeked.forEach(System.out::println);
    }
}
