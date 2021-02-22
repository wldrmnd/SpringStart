package com.wldrmnd.startspring.service;

import org.springframework.stereotype.Component;

@Component
public class CalculationService {


    public String factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return String.valueOf(result);
    }

}
