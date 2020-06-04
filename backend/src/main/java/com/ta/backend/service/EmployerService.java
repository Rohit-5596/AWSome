package com.ta.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ta.backend.entity.Employer;
import com.ta.backend.exception.EmployerException;

@Service
public interface EmployerService {
	
	public boolean validatePincode(Employer employer) throws EmployerException;
	
	public boolean validatePhoneNo(Employer employer) throws EmployerException;
	
	public boolean validateDate(Employer employer) throws EmployerException;

	
	public Employer addEmployer(Employer employer) throws EmployerException;
	
	public List<Employer> getEmployers() throws EmployerException;
	
	public Employer editEmployer(Employer employer) throws EmployerException;

}
