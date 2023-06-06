package com.example.fifthTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fifthTest.entities.Course;

public interface CoursesDao extends JpaRepository<Course,Long>
{
	
}
