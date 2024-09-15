package com.example.Empresa_empleado.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

public class EmployeeDto {



    private String employeeName;

    private Date birthDate;

    private String position;

    private Date hireDate;

    private Double salary;

    private String employeePhone;

    private String employeeEmail;


    public EmployeeDto() {
        super();
    }

    public EmployeeDto(String employeeName, Date birthDate, String position, Date hireDate, Double salary, String employeePhone, String employeeEmail) {
        this.employeeName = employeeName;
        this.birthDate = birthDate;
        this.position = position;
        this.hireDate = hireDate;
        this.salary = salary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
}
