package com.ssy.mvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssy.mvc.dao.CourseDao;
import com.ssy.mvc.model.Course;

@Repository("courseDao")
public class CourseDaoImpl implements CourseDao{

	@Override
	public Course getCourse(Integer id) {
		Course course = new Course();
		switch(id){
		case 123:
			course.setId(id);
			course.setName("huangfeng");
			course.setSex("woman");
			break;
		case 456:
			course.setId(id);
			course.setName("ssy");
			course.setSex("man");
			break;
			
		}
		return course;
	}

}
