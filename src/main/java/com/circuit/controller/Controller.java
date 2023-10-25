package com.circuit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.circuit.service.Resiservice;

@RestController
@RequestMapping(value= "/Resi")
public class Controller {
	
	
	@Autowired
	Resiservice resiservice;
	@GetMapping(value="/check")
	public ResponseEntity<String> getValue() throws Exception{
		String response=resiservice.getvalue();
//		String Message ="Success";
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

}
