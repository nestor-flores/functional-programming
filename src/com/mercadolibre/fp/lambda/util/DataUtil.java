package com.mercadolibre.fp.lambda.util;

import java.util.List;

public class DataUtil {

    private DataUtil() {
        throw new IllegalStateException("Utility class");
    }

    //String Lists
    public static final List<String> ELEMENT_LIST = List.of("Elemento 1", "Elemento 2", "Elemento 3");
    public static final List<String> NUMBER_LIST = List.of("ONE", "TWO", "THREE");
    public static final List<String> REPEATED_ELEMENT_LIST = List.of("one", "two", "three", "one");
    public static final List<String> BOOKS_LIST = List.of("One flew over the cuckoo's nest", "To kill a mockingbird", "Gone with the wind");
    public static final List<String> WORDS_LIST = List.of("abc","def");

    //Company Employees

    //HR
    public static final Employee EMPLOYEE_JOHN = Employee.builder().withName("John").withLastName("Doeh").withSalary(4500.00).withDepartment(Department.HR).build();
    public static final Employee EMPLOYEE_KAREN = Employee.builder().withName("Karen").withLastName("Trim").withSalary(3000.00).withDepartment(Department.HR).build();
    public static final Employee EMPLOYEE_NATASHA = Employee.builder().withName("Natasha").withLastName("Romanoff").withSalary(4800.00).withDepartment(Department.HR).build();

    //SALES
    public static final Employee EMPLOYEE_TOM = Employee.builder().withName("Tom").withLastName("Collins").withSalary(4600.00).withDepartment(Department.SALES).build();
    public static final Employee EMPLOYEE_MARK = Employee.builder().withName("Mark").withLastName("Thompson").withSalary(6500.00).withDepartment(Department.SALES).build();
    public static final Employee EMPLOYEE_TONY = Employee.builder().withName("Tony").withLastName("Stark").withSalary(7000.00).withDepartment(Department.SALES).build();

    //UX
    public static final Employee EMPLOYEE_LAURA = Employee.builder().withName("Laura").withLastName("King").withSalary(4000.00).withDepartment(Department.UX).build();
    public static final Employee EMPLOYEE_NIC = Employee.builder().withName("Nic").withLastName("Kong").withSalary(4200.00).withDepartment(Department.UX).build();
    public static final Employee EMPLOYEE_MARTHA = Employee.builder().withName("Martha").withLastName("Kent").withSalary(4950.00).withDepartment(Department.UX).build();

    //IT
    public static final Employee EMPLOYEE_CAROL = Employee.builder().withName("Carol").withLastName("Alonso").withSalary(4850.00).withDepartment(Department.IT).build();
    public static final Employee EMPLOYEE_MAX = Employee.builder().withName("Max").withLastName("Payne").withSalary(4750.00).withDepartment(Department.IT).build();
    public static final Employee EMPLOYEE_LUKE = Employee.builder().withName("Luke").withLastName("Skywalker").withSalary(8000.00).withDepartment(Department.IT).build();



    //All employees
    public static final List<Employee> ALL_EMPLOYEES = List.of( EMPLOYEE_JOHN,EMPLOYEE_TOM,EMPLOYEE_CAROL,
                                                                EMPLOYEE_LAURA,EMPLOYEE_KAREN,EMPLOYEE_MARK,
                                                                EMPLOYEE_NIC, EMPLOYEE_MAX, EMPLOYEE_NATASHA,
                                                                EMPLOYEE_TONY, EMPLOYEE_MARTHA, EMPLOYEE_LUKE);

}