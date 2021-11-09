/*
 * Copyright (c) 2021 Absolute Software Corporation. All rights reserved.
 * Reproduction or transmission in whole or in part, in any form, or by any means
 * (electronic, mechanical, or otherwise) is prohibited without the prior written
 * consent of the copyright owner.
 */
package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}
