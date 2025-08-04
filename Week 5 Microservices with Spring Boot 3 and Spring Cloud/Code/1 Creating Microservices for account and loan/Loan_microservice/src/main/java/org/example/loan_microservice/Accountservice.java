package org.example.loan_microservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Accountservice {

    List<Account> list= new ArrayList<>();
    public Account getaccount(int number){
        for(Account acc:list){
            if(acc.getNumber()==number){
                return acc;
            }
        }
        return null;
    }

    public String addaccount(Account acc){
        list.add(acc);
        return "Account added successfully";
    }
}
