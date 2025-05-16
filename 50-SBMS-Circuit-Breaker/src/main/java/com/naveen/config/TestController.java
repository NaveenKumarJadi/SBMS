package com.naveen.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final ExternalService externalService;

    public TestController(ExternalService externalService) {
        this.externalService = externalService;
    }

    @GetMapping("/get-data")
    public String getData() {
        return externalService.callExternalApi();
    }
}
