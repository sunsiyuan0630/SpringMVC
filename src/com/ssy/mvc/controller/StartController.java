package com.ssy.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssy.mvc.model.Course;
import com.ssy.mvc.service.CourseService;

@Controller
@RequestMapping("/hello")
public class StartController {

	@Autowired
	private CourseService courseService;
	//http://localhost:8080/hello/mvc
	@RequestMapping("/mvc")
	public String helloMvc(){
		return "home";
	}
	
	//只处理url为http://localhost:8080/hello/test1?id=123的get请求
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String viewCourse(@RequestParam("id")Integer id,Model model){
		Course course  = courseService.getCourse(id);
		model.addAttribute(course);
		return "test1";
	}
	//处理url为http://localhost:8080/hello/test2/{id}的get请求,会动态地将/test2/sth 中的sth注入给id
	@RequestMapping(value="/test2/{id}",method=RequestMethod.GET)
	public String viewCourse2(@PathVariable("id")Integer id,Map<String,Object> model){
		Course course  = courseService.getCourse(id);
		model.put("cc",course);
		return "test2";
		
	}
}
