package com.mercadolibre.fp.lambda.streams;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args) {
        List<String> stringList = DataUtil.ELEMENT_LIST;

        Stream<String> stringStream = stringList.stream();

        Stream<String> upperStream = stringStream.map(String::toUpperCase);

        Stream<String> lowerStream = upperStream.map(String::toLowerCase);

        lowerStream.forEach(System.out::println);
    }
}
