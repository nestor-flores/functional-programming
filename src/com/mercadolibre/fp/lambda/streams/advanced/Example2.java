package com.mercadolibre.fp.lambda.streams.advanced;

import com.mercadolibre.fp.lambda.util.DataUtil;
import com.mercadolibre.fp.lambda.util.Employee;

import java.util.List;
import java.util.OptionalDouble;

public class Example2 {

    public static void main(String[] args) {
        List<Employee> allEmployees = DataUtil.ALL_EMPLOYEES;

        //Obtener el promedio de todos los sueldos de los empleados
        OptionalDouble averageSalary = allEmployees.stream().mapToDouble(Employee::getSalary).average();

        //Mostrar el resultado
        System.out.println(String.format("Average: %s", averageSalary.getAsDouble()));

        //Contar la cantidad de enmpleados debajo del promedio
        long bellowSalary = allEmployees.stream().filter(item -> item.getSalary() < averageSalary.getAsDouble()).count();

        //Mostrar el resultado
        System.out.println(String.format("Bellow average: %s", bellowSalary));
    }
}
