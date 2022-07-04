package com.patrykstaskiewicz.trackmymoney;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class CurrencyRate {

    private int id;
    private String currency;
    private double rate;


}
