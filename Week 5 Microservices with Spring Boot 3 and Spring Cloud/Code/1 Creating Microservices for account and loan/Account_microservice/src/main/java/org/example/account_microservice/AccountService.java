package org.example.account_microservice;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class AccountService {

    List<Account> list=new ArrayList<>();

    public String addaccount(Account acc){
        list.add(acc);
        return "Account added successfully";
    }

    public String deleteacc(Account acc){
        list.remove(acc);
        return "Account removed successfully";
    }

    public Account getacc(int number){
        for(Account accounts:list){
            if(accounts.num()==number){
                return accounts;
            }
        }
        return null;
    }
}
