package com.example.Empresa_empleado.Repository;

import com.example.Empresa_empleado.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company,Long> {


}
