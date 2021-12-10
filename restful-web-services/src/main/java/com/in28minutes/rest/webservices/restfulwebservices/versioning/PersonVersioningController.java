package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    //---------------------- URI Versioning ----------------------
    @GetMapping("/person/v1")
    public PersonV1 getPersonV1() {
        return new PersonV1("Lam Ho");
    }

    @GetMapping("/person/v2")
    public PersonV2 getPersonV2() {
        return new PersonV2(new Name("Lam", "Ho"));
    }

    //---------------------- Request Parameter Versioning ----------------------
    @GetMapping(value = "/person/param", params = "version=1")
    public PersonV1 paramV1() {
        return new PersonV1("Lam Ho");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public PersonV2 paramV2() {
        return new PersonV2(new Name("Lam", "Ho"));
    }

    //---------------------- Header Versioning ----------------------
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 headerV1() {
        return new PersonV1("Lam Ho");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 headerV2() {
        return new PersonV2(new Name("Lam", "Ho"));
    }

    //---------------------- MIME type Versioning ----------------------
    @GetMapping(value = "/person/produce", produces = "application/vnd.company.app-v1+json")
    public PersonV1 produceV1() {
        return new PersonV1("Lam Ho");
    }

    @GetMapping(value = "/person/produce", produces = "application/vnd.company.app-v2+json")
    public PersonV2 produceV2() {
        return new PersonV2(new Name("Lam", "Ho"));
    }
}
