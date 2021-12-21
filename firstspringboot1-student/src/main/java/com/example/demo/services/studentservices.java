package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.student;
import com.example.demo.repository.studentrepository;
 

@Service
public class studentservices {
	
	@Autowired
	 
	studentrepository repository;
	
	public List<student> getAllstudent()
	{
		return repository.findAll();
		
	}
   public void savestudent(student s) {
	   repository.save(s);
   }
public void deletestudent(String id) {
	repository.deleteById(id);
	
}
public void updatestudent(student student) {
	repository.save(student);
	
}
public Optional<student> getOnestudent(String id) {
	// TODO Auto-generated method stub
	return repository.findById(id);
}


}
