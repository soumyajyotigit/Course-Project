package com.example.fifthTest.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.example.fifthTest.dao.CoursesDao;
import com.example.fifthTest.entities.Course;

@SuppressWarnings("unused")
@Service	
public class CourseServiceimpl implements CourseService {
	
	

	@Autowired
	private CoursesDao courseDao;
//	List<Course>list;
	
	public CourseServiceimpl() {
//		list=new ArrayList<>();
//		list.add(new Course(145,"java course","this is basic java"));
//		list.add(new Course(4343, "Spring boot","Creating rest api using spring boot"));
		
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}
	

}
