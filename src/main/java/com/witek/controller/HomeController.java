package com.witek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
@RequestMapping ("/")
@ResponseBody
public String goHome () {
	return "welcome in app developed by Jenkins";
	
	
}
}
