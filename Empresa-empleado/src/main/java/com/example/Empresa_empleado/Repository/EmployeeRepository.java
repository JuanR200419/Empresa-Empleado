package com.example.Empresa_empleado.Repository;

import com.example.Empresa_empleado.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
