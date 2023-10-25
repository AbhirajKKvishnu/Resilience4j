package com.circuit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class Resiservice {
    
    @CircuitBreaker(name = "checkResi")
    public String getvalue() throws Exception {
        String url = "http://localhost:8083/checkcircuit";
        WebClient webClient = WebClient.create();

            String response = webClient.get().uri(url).retrieve().bodyToMono(String.class).block();
            // Log a successful response
            // You can also perform additional processing on the response if needed.
            return response;
   
    }
}
