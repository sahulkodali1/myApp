package com.myApp.Controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myApp.Model.Coursedetails;
import com.myApp.Model.Userdetails;
import com.myApp.Repositories.CourseRepo;
import com.myApp.Repositories.UserRepo;

@RestController
@RequestMapping("course")
public class Coursecontroller {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private CourseRepo courseRepo;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Coursedetails> createCourse(@RequestBody Coursedetails course) {
		Userdetails user = userRepo.findOne(course.getAuthor());
		course.getUsers().add(user);
		Coursedetails savedcourse = courseRepo.save(course);
		return new ResponseEntity<Coursedetails>(savedcourse, HttpStatus.CREATED);

	}

}
