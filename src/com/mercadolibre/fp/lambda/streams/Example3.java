package com.mercadolibre.fp.lambda.streams;

import com.mercadolibre.fp.lambda.util.DataUtil;

import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        List<String> stringList = DataUtil.ELEMENT_LIST;

        stringList.stream().map(String::toUpperCase).map(String::toLowerCase).forEach(System.out::println);

    }

}
