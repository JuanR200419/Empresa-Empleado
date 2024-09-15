package com.example.Empresa_empleado.Service;

import com.example.Empresa_empleado.Model.Employee;
import com.example.Empresa_empleado.Repository.EmployeeRepository;
import com.example.Empresa_empleado.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
@Autowired
    private EmployeeRepository employeeRepository;



    public  boolean deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
        return true;
    }

    public Employee serchEmployee(Long id) {
        return employeeRepository.findById(id).get();

    }

    public Employee createEmployee(EmployeeDto employee) {
        Employee employeeInfo = new Employee();
        employeeInfo.setEmployeeName(employee.getEmployeeName());
        employeeInfo.setEmployeeEmail(employee.getEmployeeEmail());
        employeeInfo.setSalary(employee.getSalary());
        employeeInfo.setEmployeePhone(employee.getEmployeePhone());
        employeeInfo.setBirthDate(employee.getBirthDate());
        employeeInfo.setEmployeeName(employee.getEmployeeName());
        employeeInfo.setPosition(employee.getPosition());
       return employeeRepository.save(employeeInfo);

    }

    public boolean updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return true;
    }
}
