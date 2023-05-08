package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.LoanApplicationRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.model.LoanApplicationModel;
import com.example.demo.model.UserModel;

@Service
public class eduloanService {
	
	@Autowired
	UserRepository ur;
	@Autowired
	LoanApplicationRepository lr;
	
	public String login(String username,String password) {
		List<UserModel> li = ur.findAll();
		String res = null;
		for(UserModel l : li) {
			if(l.getUsername().equals(username)&&l.getPassword().equals(password)) {
				res = "Login sucessfull";
			}
		}
		if(res==null) {
			res= "Login failed";
		}
		return res;
	}
public UserModel register(@RequestBody UserModel id) {
		
		return ur.save(id);
	}
public List<UserModel> getAllDetails(){
	
	return ur.findAll();
}
public UserModel putDetails(@RequestBody UserModel id) {
	
	return ur.save(id);
}
public UserModel getDetailsById(@PathVariable int id) {
	
	return ur.findById(id).orElse(null);
}

public void deleteById(@PathVariable int id) {
	
	ur.deleteById(id);
}
public List<LoanApplicationModel> getAlDetails(){
	
	return lr.findAll();
}
public LoanApplicationModel add(@RequestBody LoanApplicationModel id) {
	
	return lr.save(id);
}
public LoanApplicationModel put(@RequestBody LoanApplicationModel id) {
	
	return lr.save(id);
}
public LoanApplicationModel getDetailById(@PathVariable int id) {
	
	return lr.findById(id).orElse(null);
}
public void deleteId(@PathVariable int id) {
	
	lr.deleteById(id);
}
	
	
	

}