package com.mercadolibre.fp.lambda.streams.operators.nonterminal.limit;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = DataUtil.REPEATED_ELEMENT_LIST;

        Stream<String> stream = stringList.stream();
        stream.limit(2)
                .forEach(System.out::println);
    }
}
