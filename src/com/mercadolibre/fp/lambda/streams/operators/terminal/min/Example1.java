package com.mercadolibre.fp.lambda.streams.operators.terminal.min;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {
        List<String> stringList = DataUtil.WORDS_LIST;

        Stream<String> stream = stringList.stream();

        Optional<String> min = stream.min(String::compareTo);

        String minString = min.get();

        System.out.println(minString);
    }
}
