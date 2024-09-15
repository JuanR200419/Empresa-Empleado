package com.example.Empresa_empleado.Controller;

import com.example.Empresa_empleado.Model.Company;
import com.example.Empresa_empleado.Model.Employee;
import com.example.Empresa_empleado.Service.EmployeeService;
import com.example.Empresa_empleado.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Employee")



public class EmployeeController {
@Autowired
    private EmployeeService employeeService;

    @DeleteMapping("/{id}")
    public boolean deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody EmployeeDto employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public Employee serchEmployee(@RequestBody Long id){
        return employeeService.serchEmployee(id);
    }

    @PutMapping("/id")
    public Employee updateEmployee(@PathVariable Long id ,@RequestBody EmployeeDto employeeDetails ){
        Employee employee = employeeService.serchEmployee(id);
        if(employee!=null){
            employee.setEmployeeName(employeeDetails.getEmployeeName());
            employee.setEmployeePhone(employeeDetails.getEmployeePhone());
            employee.setEmployeeEmail(employeeDetails.getEmployeeEmail());
            employee.setBirthDate(employeeDetails.getBirthDate());
            employee.setHireDate(employeeDetails.getHireDate());
            employee.setSalary(employeeDetails.getSalary());
            employee.setPosition(employeeDetails.getPosition());
            return employeeService.createEmployee(employee);
        }else{

            return null;
        }
    }




}
