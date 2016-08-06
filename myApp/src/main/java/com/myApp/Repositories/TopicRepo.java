package com.myApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myApp.Model.Coursetopics;

public interface TopicRepo extends JpaRepository<Coursetopics, Integer> {

}
