package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.example.employee;
import com.example.demo.repository.employeerepository;
import com.example.demo.services.employeeservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")

public class employeecontroller {
	
	@Autowired
	
	employeeservices service;
	
	@GetMapping("/Getemployees")
	
	public List<employee> getAllemployees()
	{
		return service.getAllemployees();
	}
	
	@PostMapping("/employee")
  public void saveemployee(@RequestBody employee ee)
  {
	  service.saveemployee(ee);
  }
}
