package com.sb.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.service.EmpService;

@RestController
public class EmpController {

	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
    @Autowired
    EmpService e;
    
	@RequestMapping("/v1")
	public String Show() {

		logger.info("This is First Method");

		return "Hello";
	}

	@RequestMapping("/v2")
	public String print() {

		logger.info("This is Second Method");

		return "Hello Vilage World Class";
	}
	
	@RequestMapping("/v3")
	public ArrayList load() {

		
		
		logger.info("This is Third Method");

		return e.m1();
	}
	@RequestMapping("/v4")
	public ArrayList load1() {
		
		
		logger.info("This is Forth Method4");

		return e.m2();
	}
	@RequestMapping("/v5")
	public ArrayList load2() {
		
		
		logger.info("This is Fifth Method");

		return e.m3();

	}
}

