package com.iotek.dao;

import com.iotek.model.Company;

import java.util.List;

public interface CompanyMapper {
    boolean addCompany(Company company);
    boolean updateCompany(Company company);
    List<Company> getAll(Company company);
    List<Company> getCompanyById(Company company);
    List<Company> getCompanyByName(Company company);
}
