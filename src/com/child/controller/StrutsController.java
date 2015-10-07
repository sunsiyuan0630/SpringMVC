package com.child.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/struts")
public class StrutsController {

	@RequestMapping("/main")
	public String gotoMain(){
		return "main";
	}
	@RequestMapping("/top")
	public String getTop(){
		return "top";
	}
	@RequestMapping("/content")
	public String getContent(){
		return "content";
	}
	@RequestMapping("/left")
	public String getLeft(){
		return "left";
	}
	@RequestMapping("/storage")
	public String getIntoStorage(){
		return "storage";
	}
}
