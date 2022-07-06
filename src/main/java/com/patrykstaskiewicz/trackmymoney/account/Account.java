package com.patrykstaskiewicz.trackmymoney.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Account {

    private int id;
    @Column(name="OPERATION_TYPE") //specify column name
    private String operationType;
    private double value;
    @DateTimeFormat(pattern = "dd.mm.yyyy hh:mm:ss")
    private java.time.LocalDateTime date;


}
