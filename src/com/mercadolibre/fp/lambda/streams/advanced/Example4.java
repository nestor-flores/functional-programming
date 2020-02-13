package com.mercadolibre.fp.lambda.streams.advanced;

import com.mercadolibre.fp.lambda.util.DataUtil;
import com.mercadolibre.fp.lambda.util.Department;
import com.mercadolibre.fp.lambda.util.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<Employee> allEmployees = DataUtil.ALL_EMPLOYEES;

        Map<Department, List<Employee>> splitedByDepartment = allEmployees.stream().collect(Collectors.groupingBy(item -> item.getDepartment()));

        //Get all IT employees
        splitedByDepartment.get(Department.IT).forEach(System.out::println);

    }
}
