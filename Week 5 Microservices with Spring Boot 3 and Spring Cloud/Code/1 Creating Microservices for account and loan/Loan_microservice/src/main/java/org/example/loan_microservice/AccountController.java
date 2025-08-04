package org.example.loan_microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    Accountservice service;

    @PostMapping("/addaccount")
    public String addaccount(@RequestBody Account account) {
        return service.addaccount(account);
    }


    @GetMapping("/getaccount/{number}")
    public Account getaccount(@PathVariable int number) {
        return service.getaccount(number);
    }
}