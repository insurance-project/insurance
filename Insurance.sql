create database Insurance;
use Insurance;
show tables;

/*insurance, customer, contract, accident, reward, */

create table insurance (
InsuranceID int auto_increment not null primary key,
InsuranceName varchar(30) not null,
Premium int not null,
Warranty int not null,
RewardCost int not null,
Kind int not null,
PremiumRate float not null,
RewardRate float not null
);

create table customer (
customerID int auto_increment not null primary key,
customerJob varchar(30) not null,
customerName varchar(30) not null,
customerGender varchar(30) not null,
phoneNumber varchar(30) not null,
residentNumber varchar(30) not null
);

