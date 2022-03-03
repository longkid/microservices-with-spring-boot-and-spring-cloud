package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    /**
     * Dynamic filtering: returns field1, field2 of SomeBean
     */
    @GetMapping("/filtering")
    public MappingJacksonValue getSomeBean() {
        SomeBean someBean = new SomeBean("field1", "field2", "field3");
        MappingJacksonValue mapping = buildMappingJacksonValue(someBean, "field1", "field2");
        return mapping;
    }

    private MappingJacksonValue buildMappingJacksonValue(Object obj, String... propertyArray) {
        MappingJacksonValue mapping = new MappingJacksonValue(obj);
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", SimpleBeanPropertyFilter.filterOutAllExcept(propertyArray));
        mapping.setFilters(filters);
        return mapping;
    }

    /**
     * Dynamic filtering: returns field2, field3 of SomeBean
     */
    @GetMapping("/filtering-list")
    public MappingJacksonValue getSomeBeans() {
        List<SomeBean> someBeans = Arrays.asList(new SomeBean("field1", "field2", "field3")
                , new SomeBean("field21", "field22", "field23"));
        MappingJacksonValue mapping = buildMappingJacksonValue(someBeans, "field2", "field3");
        return mapping;
    }

}
