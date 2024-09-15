package com.example.Empresa_empleado.Controller;

import com.example.Empresa_empleado.Model.Company;
import com.example.Empresa_empleado.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Company")

public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @DeleteMapping ("/{id}")
    public boolean deleteCompany(@PathVariable Long id){
        return companyService.deleteCompany(id);
    }
    @GetMapping
    public List<Company> getCompany(){
        return companyService.findAll();
    }

    @PostMapping
    public Company createCompany(@RequestBody Company company){
        return companyService.createCompany(company);
    }

   /* @GetMapping
    public Company serchCompany(@RequestBody Long id){
        return companyService.serchCompany(id);
    }*/

    @PutMapping("/id")
    public Company updateCompany(@PathVariable Long id ,@RequestBody Company companyDetails){
        Company company = companyService.serchCompany(id);
        if(company!=null){
            company.setCompanyName(companyDetails.getCompanyName());
            company.setCompanyEmail(companyDetails.getCompanyEmail());
            company.setCompanyType(companyDetails.getCompanyType());
            company.setCompanyAddress(companyDetails.getCompanyAddress());
            company.setCompanyPhone(companyDetails.getCompanyPhone());
            return companyService.createCompany(company);
        }else{

            return null;
        }
    }





}
