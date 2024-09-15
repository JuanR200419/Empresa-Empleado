package com.example.Empresa_empleado.Service;

import com.example.Empresa_empleado.Model.Company;
import com.example.Empresa_empleado.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public boolean deleteCompany(Long id) {
        companyRepository.deleteById(id);
        return true;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company serchCompany(Long id) {
        return companyRepository.findById(id).get();
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);

    }

    public boolean updateCompany(Company company) {
        companyRepository.save(company);
        return true;
    }
}
