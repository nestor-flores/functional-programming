package com.mercadolibre.fp.lambda.streams.advanced;

import com.mercadolibre.fp.lambda.util.DataUtil;
import com.mercadolibre.fp.lambda.util.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<Employee> allEmployees = DataUtil.ALL_EMPLOYEES;

        //Ordenar empleados por departamento
        List<Employee> sortedByDepartment = allEmployees.stream().sorted(Comparator.comparing(Employee::getDepartment)).collect(Collectors.toList());

        sortedByDepartment.forEach(System.out::println);
    }
}
