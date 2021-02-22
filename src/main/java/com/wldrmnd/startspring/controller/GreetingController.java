package com.wldrmnd.startspring.controller;

import com.wldrmnd.startspring.service.CalculationService;
import com.wldrmnd.startspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private CalculationService calculationService;

    @Autowired
    public GreetingController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "number",
            defaultValue = "1") Integer number) {
        return calculationService.factorial(number);
    }
}
