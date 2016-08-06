package com.myApp.Controller.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myApp.Model.Userdetails;
import com.myApp.Repositories.UserRepo;
import com.myApp.Service.UserService;

/**
 * @author SAHUL
 *
 */
@RestController
@RequestMapping("user")
public class UserController {

	/**
	 * class name:UserController
	 * description:uses rest architecture to perform operations on database of user
	 * 
	 */
	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping(method=RequestMethod.POST)
	private ResponseEntity<Userdetails>Create(@Valid@RequestBody Userdetails user){
		return new ResponseEntity<Userdetails>(UserService.save(user)),HttpStatus.CREATED);
	}

	

}
