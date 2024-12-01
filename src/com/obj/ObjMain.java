package com.obj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ObjMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Add employees to the list
        employees.add(new Employee(101, "Alice", 55000, "HR"));
        employees.add(new Employee(102, "Bob", 75000, "Engineering"));
        employees.add(new Employee(103, "Charlie", 60000, "Finance"));
        employees.add(new Employee(104, "Diana", 80000, "Engineering"));

        // Print all employees
        System.out.println("All Employees:"+employees);
        employees.forEach(System.out::println);

        System.out.println("\nHighest Paid Employee:");
        Employee highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
        System.out.println(highestPaid);

        //Sort Employee by name
        System.out.println("\nSort Employees by name:");
        employees.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);

        System.out.println("\nSort Employees by Salary:");
        List<Employee> e3 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        e3.forEach(System.out::println);
    }
}
