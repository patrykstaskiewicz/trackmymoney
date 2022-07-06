package com.patrykstaskiewicz.trackmymoney.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;


@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/balance") //create endpoint - return current balance
    public List <Account> getAccountBalance(){

        return accountRepository.getAllTransaction();
    }

    @GetMapping("/item/{id}") // enpoind path allow to define variable in curly brackets
    public List <Account> getSingeItem(@PathVariable("id") int requestedID){ //pathvariable - mapping variable from endpoint to variable passing to method
        return accountRepository.getTansactionByID(requestedID);
    }

    @DeleteMapping("/item/{id}")
    public String deleteSingeItem(@PathVariable("id") int id){
        return accountRepository.deleteSingeItem(id);

    }



}
