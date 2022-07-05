create database sample_db

use sample_db

create table sample_db.ACCOUNT
(
    ID             int auto_increment
        primary key,
    OPERATION_TYPE varchar(10) null,
    VALUE          bigint      not null,
    DATE           datetime    null
);



create table CURRENCY_RATE
(
    ID       int auto_increment,
    CURRENCY varchar(10) null,
    RATE     double      not null,
    DATE     datetime    not null,
    constraint CURRENCY_RATE_pk
        primary key (ID)
);