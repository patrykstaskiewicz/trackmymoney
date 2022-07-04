package com.patrykstaskiewicz.trackmymoney;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    private long value;

}
