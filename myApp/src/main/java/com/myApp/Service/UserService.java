package com.myApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myApp.Model.Userdetails;
import com.myApp.Repositories.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userrepo;
	
	public Userdetails save(Userdetails user){
		return userrepo.save(user);
		
	}
	

}
