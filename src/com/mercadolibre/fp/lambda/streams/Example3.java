package com.mercadolibre.fp.lambda.streams;

import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        List<String> stringList = List.of("Elemento 1", "Elemento 2", "Elemento 3");

        stringList.stream().map(String::toUpperCase).map(String::toLowerCase).forEach(System.out::println);

    }

}
