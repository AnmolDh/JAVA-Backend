package com.springpayroll.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayrollController {
    @GetMapping()
    public String payroll() {
        return "Hello World From Payroll Controller";
    }
}
