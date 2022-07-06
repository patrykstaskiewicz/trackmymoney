package com.patrykstaskiewicz.trackmymoney.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.sql.SQLException;
import java.util.List;

@Repository
public class AccountRepository {

    @Autowired
    JdbcTemplate connectToDatabase;

    public List <Account> getAllTransaction(){
        List <Account> query = connectToDatabase.query("SELECT id, operation_type, value, date FROM ACCOUNT",
                BeanPropertyRowMapper.newInstance(Account.class));

        return query;
    }

    public List <Account> getTansactionByID(int requestedID){
        List <Account> query = connectToDatabase.query
                ("SELECT id, operation_type, value, date FROM ACCOUNT WHERE " + "id = ?", //question mark is placeholder to variable
                BeanPropertyRowMapper.newInstance(Account.class),requestedID);                // NOTE: remember about spaces when concatenate string to sql query

        return query;
    }

    public String deleteSingeItem(int id){
        String message;
        int deleteResult = connectToDatabase.update("DELETE FROM ACCOUNT WHERE " + "ID = ?",id);

//        if(deleteResult == ){
//            message = "Success!";
//        } else {
//            message = "Error while removing item.";
//        }
//        return message;
        return "Success!";
    }

}
