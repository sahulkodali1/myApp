package com.myApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myApp.Model.Coursedetails;

public interface CourseRepo extends JpaRepository<Coursedetails, Integer> {

}
