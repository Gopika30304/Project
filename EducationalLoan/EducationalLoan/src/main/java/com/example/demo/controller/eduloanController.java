package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoanApplicationModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.eduloanService;


@RestController
public class eduloanController {

	@Autowired
	eduloanService us;
	
	@GetMapping("/all")
	public List<UserModel> allDetails(){
		
		return us.getAllDetails();
	}
	
	@GetMapping("/logins")
	public String logins(@RequestParam String username, @RequestParam String password){
		
		return us.login(username,password);
	}
	@PostMapping("/reg")
	public UserModel regid(@RequestBody UserModel id) {
		
		
		return us.register(id);
	}
	@PutMapping("/put")
	public UserModel saveAlll(@RequestBody UserModel id) {
		
		return us.putDetails(id);
		
	}
	@GetMapping("/all/{id}")
	public UserModel getId(@PathVariable int id) {
		
		return us.getDetailsById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		
		us.deleteById(id);
		return "Details Deleted";
	}
	@GetMapping("/al")
	public List<LoanApplicationModel> alDetails(){
		
		return us.getAlDetails();
	}
	@PostMapping("/add")
	public LoanApplicationModel addloan(@RequestBody LoanApplicationModel id) {
		
		
		return us.add(id);
	}
	@PutMapping("/pt")
	public LoanApplicationModel savemethod(@RequestBody LoanApplicationModel id) {
		
		return us.put(id);
		
	}
	@GetMapping("/al/{id}")
	public LoanApplicationModel getsId(@PathVariable int id) {
		
		return us.getDetailById(id);
	}
	@DeleteMapping("/deleted/{id}")
	public String deleted(@PathVariable int id) {
		
		us.deleteId(id);
		return "Details Deleted";
	}

	
}