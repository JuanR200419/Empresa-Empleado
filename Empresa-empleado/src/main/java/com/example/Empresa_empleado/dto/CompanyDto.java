package com.example.Empresa_empleado.dto;

import com.example.Empresa_empleado.Model.Employee;
import jakarta.persistence.*;

import java.util.List;

public class CompanyDto {


    private String companyName;

    private String companyAddress;

    private String companyPhone;

    private String companyEmail;

    private String companyTaxId;

    private String companyType;

    public CompanyDto(String companyName, String companyAddress, String companyPhone, String companyEmail, String companyTaxId, String companyType) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
        this.companyEmail = companyEmail;
        this.companyTaxId = companyTaxId;
        this.companyType = companyType;
    }

    public CompanyDto() {
        super();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyTaxId() {
        return companyTaxId;
    }

    public void setCompanyTaxId(String companyTaxId) {
        this.companyTaxId = companyTaxId;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
}
