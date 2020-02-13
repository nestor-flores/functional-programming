package com.mercadolibre.fp.lambda.streams.advanced;

import com.mercadolibre.fp.lambda.util.DataUtil;
import com.mercadolibre.fp.lambda.util.Department;
import com.mercadolibre.fp.lambda.util.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Example3 {
    public static void main(String[] args) {
        List<Employee> allEmployees = DataUtil.ALL_EMPLOYEES;

        //Filtrar cual es el empleado mejor pago de UX
        Optional<Employee> bestPayedUx = allEmployees.stream().filter(employee -> employee.getDepartment().equals(Department.UX)).max(Comparator.comparing(Employee::getSalary));

        //Mostrar el resultado
        System.out.println(bestPayedUx.get());

    }
}
