package com.iotek.service;

import com.iotek.model.Company;

import java.util.List;

public interface CompanyService {
    boolean addCompany(Company company);
    boolean updateCompany(Company company);
    List<Company> getAll();
    List<Company> getCompanyById(Company company);
    List<Company> getCompanyByName(Company company);
}
