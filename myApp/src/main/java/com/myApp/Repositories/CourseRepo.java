package com.myApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myApp.model.Coursedetails;

public interface CourseRepo extends JpaRepository<Coursedetails, Integer> {

}
