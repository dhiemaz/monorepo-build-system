
package com.app.service.transaction.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class Controller {
    @GetMapping("/service-status")
    @ResponseBody
    public Map<String, String> serviceStatus() {
        return Map.of("string", "Transaction Service is up and running");
    }
}
