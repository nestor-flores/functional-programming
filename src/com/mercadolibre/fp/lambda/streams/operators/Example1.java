package com.mercadolibre.fp.lambda.streams.operators;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = DataUtil.NUMBER_LIST;

        Stream<String> stream = stringList.stream();

        long count = stream
                .map(String::toLowerCase)
                .count();

        System.out.println("count = " + count);

    }
}
