package com.circuit.Resilience;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.circuit.controller.Controller;
import com.circuit.service.Resiservice;

@SpringBootTest
class ResilienceApplicationTests {

	
	@Autowired
	Controller controller;
	
	@Autowired
	Resiservice resiservice;
	@Test
	void testing() throws Exception{
//		Mockito.when(resiservice.getvalue()).thenReturn("Sucess");
//		Assertions.assertEquals("Sucess", null);
		
		String response ="{\n"
				+ " \"statusCode\": \"200\"\n"
				+ "}";
//		Mockito.when(resiservice.getvalue()).thenReturn("Success");
        String result = controller.getValue().getBody();
        Assertions.assertEquals(response, result);
    
		
	}

}
