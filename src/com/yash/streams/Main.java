package com.yash.streams;

import com.yash.streams.employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(11, "Yash Tailor", "Java"));
        empList.add(new Employee(9, "Arpit Panchal", "Open Source"));
        empList.add(new Employee(1, "Parth Solanki", "PHP"));
        empList.add(new Employee(12, "Shailesh Darji", "MEAN"));
        empList.add(new Employee(2, "Hardeek Bhatia", "DevOps"));
        empList.add(new Employee(5, "Likita Rai", "ReactJS"));
        empList.add(new Employee(53, "Dewakar", "Java"));
        empList.add(new Employee(3, "Dhruv", "Python"));
        empList.add(new Employee(6, "Manan", "Blockchain"));
        empList.add(new Employee(8, "Yash", ".NET"));

        System.out.println("----------Printing Even empId Employee's Details in sorted order----------");
        List<Employee> newData = empList.stream().sorted().filter(element -> element.getEmpId() % 2 == 0).collect(Collectors.toList());
        newData.forEach(System.out::println);

        System.out.println("----------Printing No of Employee in Java Dept----------");
        long noOfJavaEmp = empList.stream().filter(element -> element.getEmpDept().toLowerCase().equals("Java")).count();
        System.out.println("No of Employee in Java : " + noOfJavaEmp);

        System.out.println("----------Printing Employee's details who have 'D' in their name ----------");
        List<Employee> nameStartingWithDChar = empList.stream().sorted().filter(element -> element.getEmpName().contains("D")).collect(Collectors.toList());
        nameStartingWithDChar.forEach(System.out::println);

    }
}