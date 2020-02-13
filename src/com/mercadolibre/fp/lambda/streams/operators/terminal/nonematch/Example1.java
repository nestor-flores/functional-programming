package com.mercadolibre.fp.lambda.streams.operators.terminal.nonematch;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = DataUtil.WORDS_LIST;

        Stream<String> stream = stringList.stream();

        boolean noneMatch = stream.noneMatch("xyz"::equals);

        System.out.println("noneMatch = " + noneMatch);
    }
}
