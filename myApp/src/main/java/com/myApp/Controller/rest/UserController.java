package com.myApp.Controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myApp.Repositories.UserRepo;
import com.myApp.model.Userdetails;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
	public ResponseEntity<Userdetails>createCourse(@RequestBody Userdetails user){
		Userdetails savedUser=userRepo.save(user);
		return new ResponseEntity<Userdetails>(savedUser,HttpStatus.CREATED);
		
	}
	
	

}
