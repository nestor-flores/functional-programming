package com.mercadolibre.fp.lambda.streams.advanced;

import com.mercadolibre.fp.lambda.util.DataUtil;
import com.mercadolibre.fp.lambda.util.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {

        List<Employee> allEmployees = DataUtil.ALL_EMPLOYEES;

        //Obtener el nombre completo de todos los empleados
        String allNames = allEmployees.stream().map(item -> String.format("%s, %s", item.getLastName(), item.getName())).collect(Collectors.joining("\n"));

        //Mostrar el resultado
        System.out.println(allNames);


    }
}
