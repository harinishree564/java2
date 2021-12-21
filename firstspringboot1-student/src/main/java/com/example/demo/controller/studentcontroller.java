package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import com.example.demo.services.studentservices;
 
@RestController
@RequestMapping("/api")
public class studentcontroller {
	@Autowired
	
	studentservices service;
	 
	@GetMapping("/Getstudents")
	
	public List<student> getAllstudent()
	{
		return service.getAllstudent();
		
	}
    
	@PostMapping("/student")
	public void savestudent(@RequestBody student ss)
	{
		service.savestudent(ss);
	}
	
	@PostMapping("/deleteuser/{id}")
	public void deletestudent(@PathVariable String id)
	{
	service.deletestudent(id);
	}
    @PutMapping("/updatestudent/{id}")
	public void updatestudent(@RequestBody student Student) {
		service.updatestudent(Student);
	}
    @GetMapping("/Getonestudent/{id}")
    public Optional<student> getOnestudent(@PathVariable String id)
    {
    return service.getOnestudent(id);
    }
    
	
	
}
