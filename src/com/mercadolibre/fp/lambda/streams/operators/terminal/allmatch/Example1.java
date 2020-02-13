package com.mercadolibre.fp.lambda.streams.operators.terminal.allmatch;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = DataUtil.BOOKS_LIST;

        Stream<String> stream = stringList.stream();

        boolean allMatch = stream.allMatch(value -> value.startsWith("One"));

        System.out.println(allMatch);
    }
}
