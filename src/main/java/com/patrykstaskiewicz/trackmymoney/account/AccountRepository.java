package com.patrykstaskiewicz.trackmymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountRepository {

    @Autowired
    JdbcTemplate connectToDatabase;

    public List <Account> getAllTransaction(){
        List <Account> query = connectToDatabase.query("SELECT id, operation_type, value FROM ACCOUNT",
                BeanPropertyRowMapper.newInstance(Account.class));

        return query;
    }

}
