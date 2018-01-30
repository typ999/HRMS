package com.iotek.service.impl;

import com.iotek.dao.CompanyMapper;
import com.iotek.model.Company;
import com.iotek.service.CompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
    @Resource
    private CompanyMapper companyMapper;
    @Override
    public boolean addCompany(Company company) {
        return companyMapper.addCompany(company);
    }

    @Override
    public boolean updateCompany(Company company) {
        return companyMapper.updateCompany(company);
    }

    @Override
    public List<Company> getAll() {
        return companyMapper.getAll();
    }

    @Override
    public List<Company> getCompanyById(Company company) {
        return companyMapper.getCompanyById(company);
    }

    @Override
    public List<Company> getCompanyByName(Company company) {
        return null;
    }
}
