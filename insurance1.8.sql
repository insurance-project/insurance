drop database Insurance;
create database Insurance;
use Insurance;
show tables;

select * from insurance;
select * from customer;
select * from additionalinfo;
select * from predictprofit;
select * from allowStandard;
select * from contract;
select * from contractCount;
/*insurance, predictProfit, allowStandard, salePerform, customer, additionalInfo, accident, reward*/

INSERT INTO predictProfit(
	profit, subscribers 
    ) VALUE ( 10, 10 );

INSERT INTO allowStandard(
	customerMinAge, customerMaxAge, customerGender 
    ) VALUE ( 20, 40, 1);

INSERT INTO salePerform(
	profit, subscribers
    ) VALUE ( 300, 30);

INSERT INTO insurance (
	insuranceName, premium, premiumRate, warranty, kind, rewardCost, rewardRate, predictProfitID, allowStandardID, salePerformID
    ) VALUE ('hs', 1,  3.5, 40, 'fire', 400, 5.5, 1, 1, 1);

INSERT INTO additionalInfo(
	carGrade, buildingGrade, diseaseGrade
) VALUE ( 1, 1, 1);

INSERT INTO customer(
	customerAge, customerJob, customerName, customerGender, phoneNumber, residentNumber, additionalInfoID
) VALUE ( 20, 'A', 'AA', 'M', 'AAA', 'AAA', 1 );

insert into contract(
	customerID, insuranceID
) value (1, 2);

insert into contract(
	customerID
) value (2);

create table contractCount
as
select contract.customerID, COUNT(contract.insuranceID) "insuranceCount"
from contract
group by contract.customerID;

drop table contractCount;

select customer.customerID, customer.customerName, customer.customerAge, customer.customerGender, contractCount.insuranceCount
from customer, contractCount
where customer.customerID = contractCount.customerID;


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
profit int not null,
subscribers int not null,
totalProfit int
);

create table customer (
customerID int auto_increment not null primary key,
customerAge int not null,
customerJob varchar(30) not null,
customerName varchar(30) not null,
customerGender varchar(30) not null,
phoneNumber varchar(30) not null,
residentNumber varchar(30) not null,
additionalInfoID int,
FOREIGN KEY (additionalInfoID) REFERENCES additionalInfo(additionalInfoID) ON UPDATE CASCADE
);

create table contract(
	customerID int not null,
    insuranceID int,
    FOREIGN KEY (customerID) REFERENCES customer(customerID) ON UPDATE CASCADE,
    FOREIGN KEY (insuranceID) REFERENCES insurance(insuranceID) ON UPDATE CASCADE
);

drop table customer_insurance;

create table additionalInfo (
additionalInfoID int auto_increment not null primary key,
carGrade int,
buildingGrade int,
diseaseGrade int
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
