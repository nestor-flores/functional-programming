package com.mercadolibre.fp.lambda.util;

public class Employee {

    private String name;

    private String lastName;

    private Double salary;

    private Department department;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    private Employee() {

    }


    public String toString() {
        return String.format("Name: %s %nLastname: %s %nSalary: %s %nDepartment: %s", name, lastName, salary, department);
    }


    public static final class EmployeeBuilder {
        private Employee employee;

        public EmployeeBuilder() {
            this.employee = new Employee();
        }

        public EmployeeBuilder withName(String name) {
            this.employee.name = name;
            return this;
        }

        public EmployeeBuilder withLastName(String lastName) {
            this.employee.lastName = lastName;
            return this;
        }

        public EmployeeBuilder withSalary(Double salary) {
            this.employee.salary = salary;
            return this;
        }

        public EmployeeBuilder withDepartment(Department department) {
            this.employee.department = department;
            return this;
        }

        public Employee build() {
            return this.employee;
        }
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }
}
