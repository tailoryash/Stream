package com.yash.streams.employee;

public class Employee implements Comparable<Employee> {
    public int empId;
    public String empName;
    public String empDept;

    public Employee(int empId, String empName, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + ", empDept='" + empDept + '\'' + '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }
}
