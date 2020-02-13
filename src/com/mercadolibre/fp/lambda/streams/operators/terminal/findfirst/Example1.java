package com.mercadolibre.fp.lambda.streams.operators.terminal.findfirst;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = DataUtil.NUMBER_LIST;

        Stream<String> stream = stringList.stream();

        Optional<String> anyElement = stream.filter(item -> item.startsWith("t")).findFirst();

        System.out.println(anyElement.get());
    }
}
