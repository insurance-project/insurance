drop database Insurance;
create database Insurance;
use Insurance;
show tables;

select * from insurance;
/*insurance, customer, contract, accident, reward, */

create table insurance (
ID int auto_increment not null primary key,
InsuranceName varchar(30) not null,
Premium int not null,
Warranty int not null,
RewardCost int not null,
Kind varchar(30) not null,
PremiumRate float not null,
RewardRate float not null
);

create table customer (
ID int auto_increment not null primary key,
customerAge int not null,
customerJob varchar(30) not null,
customerName varchar(30) not null,
customerGender varchar(30) not null,
phoneNumber varchar(30) not null,
residentNumber varchar(30) not null
);

