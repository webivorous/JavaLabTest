package com.R177219048;

import java.util.Arrays;
import java.util.Comparator;


class SalaryCompare implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        return e1.salary - e2.salary;
    }
}

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(10,"Arpit",8000),
                new Employee(20,"Richard",15000),
                new Employee(30, "Matthew", 2000)
        };

        System.out.println("Before sorting => " + Arrays.toString(employees));
        Arrays.sort(employees,new SalaryCompare());
        System.out.println("After sorting => " + Arrays.toString(employees));
    }
}
