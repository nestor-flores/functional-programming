package com.mercadolibre.fp.lambda.streams.advanced;

import java.util.stream.IntStream;

public class Example6 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int total = IntStream.range(1, 10).map(Example6::duplicar).sum();

        long end = System.currentTimeMillis();
        System.out.println(String.format("Diferencia sin hilos: %s",end - start));
        System.out.println(String.format("Numero total: %s", total));

        start = System.currentTimeMillis();

        total = IntStream.range(1, 10).parallel().map(Example6::duplicar).sum();

        end = System.currentTimeMillis();
        System.out.println(String.format("Diferencia con hilos: %s",end - start));
        System.out.println(String.format("Numero total: %s", total));

    }


    public static int duplicar(int numero) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return numero * 2;
    }


}
