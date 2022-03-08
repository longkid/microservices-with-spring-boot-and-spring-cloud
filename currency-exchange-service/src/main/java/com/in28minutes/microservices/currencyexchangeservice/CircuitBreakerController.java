package com.in28minutes.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;

@RestController
public class CircuitBreakerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/sample-api")
    @Bulkhead(name = "default")
    public String sampleApi() {
        LOGGER.info("Sample API call received");
        return "sample-api";
    }

    /**
     * After few failed calls to url http://localhost:8080/some-dummy-url, this method will be called to return response
     * @param ex
     * @return
     */
    public String hardcodedResponse(Exception ex) {
        LOGGER.error("Fail to call http://localhost:8080/some-dummy-url: {}", ex.getMessage());
        return "Fallback Response";
    }
}
