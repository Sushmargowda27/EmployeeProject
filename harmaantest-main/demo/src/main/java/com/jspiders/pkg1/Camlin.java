package com.jspiders.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harman.demo.controller.TestService;

@Controller
public class Camlin 
{
	@Autowired 
	TestService testservice;

	@RequestMapping("/camlin")
	public ResponseEntity<String> hello()
	{
		testservice.testMe();
		return ResponseEntity.ok("hello bhayya how are you?");
	}
}
