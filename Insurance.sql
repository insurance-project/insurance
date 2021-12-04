drop database Insurance;
create database Insurance;
use Insurance;
show tables;

create table predictProfit (
predictProfitID int auto_increment not null primary key,
profit int not null,
subscribers int not null,
totalProfit int
);

create table allowStandard(
allowStandardID int primary key,  /*바꿈*/
customerMinAge int not null,
customerMaxAge int not null,
customerGender int not null
);

create table insurance (
insuranceID int auto_increment not null primary key,
insuranceName varchar(30) not null,
premium int not null,
premiumRate float not null,
warranty int not null,
kind varchar(30) not null,
rewardCost int not null,
rewardRate float not null,
predictProfitID int,
allowStandardID int,
FOREIGN KEY (predictProfitID) REFERENCES predictProfit(predictProfitID) ON UPDATE CASCADE,
FOREIGN KEY (allowStandardID) REFERENCES allowStandard(allowStandardID) ON UPDATE CASCADE
);

create table customer (
customerID int auto_increment not null primary key,
customerAge int not null,
customerJob varchar(30) not null,
customerName varchar(30) not null,
customerGender varchar(30) not null,
phoneNumber varchar(30) not null,
residentNumber varchar(30) not null
);

create table reward (
rewardID int auto_increment not null primary key,
rewardDate varchar(30) not null,
rewardPrice int not null
);

create table accident (
accidentID int auto_increment not null primary key,
accidentDate varchar(30) not null,
accidentKind varchar(30) not null,
damagePrice int,
contingency boolean not null,
customerID int not null,
rewardID int,
FOREIGN KEY (customerID) REFERENCES customer(customerID) ON UPDATE CASCADE,
FOREIGN KEY (rewardID) REFERENCES reward(rewardID) ON UPDATE CASCADE
);

create table contract(
	contractID int auto_increment not null primary key,/*바꿈*/
	customerID int not null,
    insuranceID int,
    judge int /*바꿈*/  
);
select contract.customerID, COUNT(contract.insuranceID) "insuranceCount"
from contract
group by contract.customerID;
 
select DISTINCT customer.customerID, customer.customerName, customer.customerAge, customer.customerGender, COUNT(contract.insuranceID) "insuranceCount"
		from customer
        inner join contract on customer.customerID = contract.customerID
        group by contract.customerID;

select insuranceID, insuranceName, kind, warranty, premium
		from insurance
        where allowStandardID is null;  
select * from insurance;
select * from customer;
select * from allowStandard;
select * from contract;
SELECT * FROM Insurance;

SELECT * FROM Insurance where allowstandardID is not null;

select * from contract;
select * from contract where judge!=1 and customerID=1;