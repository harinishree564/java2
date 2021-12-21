package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.example.employee;
import com.example.demo.repository.employeerepository;
@Service
public class employeeservices {
	
	@Autowired
	employeerepository repository;
	
	public List<employee> getAllemployees()
	{
		return repository.findAll();
	}
  public void saveemployee(employee e) {
	  repository.save(e);
  }
}
