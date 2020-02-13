package com.mercadolibre.fp.lambda.streams.operators.terminal.toarray;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {
        List<String> stringList = DataUtil.BOOKS_LIST;

        Stream<String> stream = stringList.stream();

        Object[] strings = stream.toArray();

        IntStream.range(0, strings.length).forEach(i -> System.out.println(strings[i]));
    }
}
