package com.ssy.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssy.mvc.dao.CourseDao;
import com.ssy.mvc.model.Course;
import com.ssy.mvc.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public Course getCourse(Integer id) {
		return courseDao.getCourse(id);
	}

}
