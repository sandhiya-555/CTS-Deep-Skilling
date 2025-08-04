package org.example.account_microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class AccountController {

    @Autowired
    AccountService service;
    @GetMapping("/accounts/getaccount/{number}")
    public Account getaccount(@PathVariable int number){
        return service.getacc(number);
    }
    @PostMapping("/accounts/addacc")
    public String addaccount(@RequestBody Account acc){
        return service.addaccount(acc);
    }
}
