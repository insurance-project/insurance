drop database Insurance;
create database Insurance;
use Insurance;
show tables;

select * from insurance;
select * from predictProfit;
select * from salePerform;

select insuranceID, insuranceName, kind, premium, premiumRate, warranty, rewardCost, rewardRate
      from insurance where insuranceID = 2;
 update insurance set insuranceName = '1234', kind = 'Car', premium = 1, premiumRate = 1, warranty = 1, rewardCost = 1, rewardRate = 1 where insuranceID = 1;
/*insurance, predictProfit, allowStandard, salePerform, customer, additionalInfo, accident, reward*/
update insurance set salePerformID = 1 where insuranceID = 1;


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
salePerformID int,
FOREIGN KEY (predictProfitID) REFERENCES predictProfit(predictProfitID) ON UPDATE CASCADE,
FOREIGN KEY (allowStandardID) REFERENCES allowStandard(allowStandardID) ON UPDATE CASCADE,
FOREIGN KEY (salePerformID) REFERENCES salePerform(salePerformID) ON UPDATE CASCADE
);

create table predictProfit (
predictProfitID int auto_increment not null primary key,
profit int not null,
subscribers int not null,
totalProfit int
);

create table allowStandard(
allowStandardID int auto_increment not null primary key,
customerMinAge int not null,
customerMaxAge int not null,
customerGender int not null
);

create table salePerform(
salePerformID int auto_increment not null primary key,
profit int,
subscribers int,
totalProfit int
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

create table accident (
accidentID int auto_increment not null primary key,
accidentDate varchar(30) not null,
accidentKind varchar(30) not null,
damagePrice int,
contingency boolean not null,
customerID int not null,
FOREIGN KEY (customerID) REFERENCES customer(customerID) ON UPDATE CASCADE
);

create table reward (
rewardID int auto_increment not null primary key,
rewardDate varchar(30) not null,
rewardPrice int not null,
accidentID int not null,
FOREIGN KEY (accidentID) REFERENCES accident(accidentID) ON UPDATE CASCADE
);

create table contract(
	customerID int not null,
    insuranceID int,
    judge tinyint(1),
    FOREIGN KEY (customerID) REFERENCES customer(customerID) ON UPDATE CASCADE,
    FOREIGN KEY (insuranceID) REFERENCES insurance(insuranceID) ON UPDATE CASCADE
);

select contract.customerID, COUNT(contract.insuranceID) "insuranceCount"
from contract
group by contract.customerID;
 
select DISTINCT customer.customerID, customer.customerName, customer.customerAge, customer.customerGender, COUNT(contract.insuranceID) "insuranceCount"
		from customer
        inner join contract on customer.customerID = contract.customerID;