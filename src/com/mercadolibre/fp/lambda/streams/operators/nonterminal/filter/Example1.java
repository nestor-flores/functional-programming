package com.mercadolibre.fp.lambda.streams.operators.nonterminal.filter;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {
        List<String> stringList = DataUtil.NUMBER_LIST;

        Stream<String> listStream = stringList.stream();

        Stream<String> longStringsStream = listStream.filter(value -> value.length() >= 4);

        longStringsStream.forEach(System.out::println);
    }
}
