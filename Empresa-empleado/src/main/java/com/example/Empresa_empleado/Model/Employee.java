package com.example.Empresa_empleado.Model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "employee_name", nullable = false)
    private String employeeName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "position")
    private String position;

    @Column(name = "hire_date")
    private Date hireDate;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "employee_phone")
    private String employeePhone;

    @Column(name = "employee_email", unique = true)
    private String employeeEmail;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    // Getters and Setters


    public Employee() {
    super();
    }

    public Employee(Long employeeId, String employeeName, Date birthDate, String position, Date hireDate, Double salary, String employeePhone, String employeeEmail, Company company) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthDate = birthDate;
        this.position = position;
        this.hireDate = hireDate;
        this.salary = salary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.company = company;
    }

    public Employee(String employeeName, Date birthDate, String position, Date hireDate, Double salary, String employeePhone, String employeeEmail, Company company) {
        this.employeeName = employeeName;
        this.birthDate = birthDate;
        this.position = position;
        this.hireDate = hireDate;
        this.salary = salary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.company = company;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

