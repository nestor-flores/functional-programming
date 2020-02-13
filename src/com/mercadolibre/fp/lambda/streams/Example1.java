package com.mercadolibre.fp.lambda.streams;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = DataUtil.LISTA_ELEMENTOS;

        Stream<String> stringStream = stringList.stream();

        Stream<String> upperStream = stringStream.map((String item) -> item.toUpperCase());

        Stream<String> lowerStream = upperStream.map((String item) -> item.toLowerCase());

        lowerStream.forEach((String item) -> {
            System.out.println(item);
        });
    }
}
