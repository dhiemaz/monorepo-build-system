
package com.app.service.catalog.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class Controller {
    @GetMapping("/service-status")
    @ResponseBody
    public Map<String, String> serviceStatus() {
        return Map.of("status", "Catalog Service is up and running");
    }
}
