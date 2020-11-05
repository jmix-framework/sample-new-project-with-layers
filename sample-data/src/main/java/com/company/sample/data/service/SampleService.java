package com.company.sample.data.service;

import org.springframework.stereotype.Component;

@Component
public class SampleService {

    public String echo(String input) {
        return input;
    }
}
