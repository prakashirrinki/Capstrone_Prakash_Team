package com.wipro.mbcms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.mbcms.entities.InsuranceCompanyEntity;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class InsuranceCompanyServiceImplementation implements InsuranceCompanyService{

	@Override
	public InsuranceCompanyEntity registerCompany(InsuranceCompanyEntity company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsuranceCompanyEntity getCompanyById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsuranceCompanyEntity getCompanyByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InsuranceCompanyEntity> getAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

}