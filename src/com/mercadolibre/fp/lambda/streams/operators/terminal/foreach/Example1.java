package com.mercadolibre.fp.lambda.streams.operators.terminal.foreach;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args){

    List<String> stringList = DataUtil.REPEATED_ELEMENT_LIST;

    Stream<String> listStream = stringList.stream();

    listStream.forEach(item -> {
        int stringLength = item.length();
        boolean startsWithO = item.startsWith("o");
        System.out.println(String.format("Length: %s, Starts with 'O' %s", stringLength, startsWithO));
    });

 }

}
