package com.patrykstaskiewicz.trackmymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/balance") //create endpoint - return current balance
    public List <Account> getAccountBalance(){

        return accountRepository.getAllTransaction();
    }

}
