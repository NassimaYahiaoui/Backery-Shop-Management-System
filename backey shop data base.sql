drop database if exists bakeryshop;
create database bakeryshop;


use bakeryshop;

drop table if exists Food;
drop table if exists AddMember;
drop table if exists placeOrder;
drop table if exists transactions;
drop table if exists printbill;


create table Food (
/* put unique id */
  /*ID int NOT NULL AUTO_INCREMENT,*/
  itemName varchar(75) not null, 
  /*manufactureName varchar(75) ,*/ /* works in MYSQL */
  manufactureDate varchar (73) , 
  expiryDate varchar (50),
  quantity varchar (80),
  purchasePrice varchar (80),
  sellingPrice varchar (80)
/*  PRIMARY KEY(ID)*/
  );
  
  create table AddMember(
  memberid varchar(60)not null,
  membername varchar(25) unique,
  emailid varchar(30),
  address varchar(30),
  mobile varchar(15)
  );
     create table PlaceOrder(
  orderNumber varchar(60)not null,
  orderDate varchar(25) unique,
  orderStatus varchar(30),
  received varchar(30)
  
  );
  
  create table transactions(
  billnumber varchar(60)not null,
  billamount varchar(25) 
  
  
  );
  create table printbill(
  itemname varchar(60)not null,
  quantity varchar(25) unique,
  unitprice varchar(30),
  amount varchar(30)
  
  );

  
  /*create table bill (
  ordernumber int not null,
  FOREIGN KEY (ID) references Food(ID)
  );*/
  
   
 
  
  
  insert into Food values (
  'Bagel', '11/22/18', '12/04/18', '34', '2.00', '5.00');
  insert into Food values (
  'Bagel Better', '11/25/18', '12/04/18', '24', '2.00', '7.00');
  insert into Food values (
  'Bagel Worse', '11/21/18', '12/04/18', '14', '2.00', '3.00');
  
   insert into AddMember values (
  '54218745', 'Emiley', 'emileykason@hotmail.com', '125 main street malden ma','67184521424');
   insert into AddMember values (
  '59212715', 'Albert', 'albertjoh@hotmail.com', '305 colonial street ebrett ma','3396748788');
  
  insert into transactions values (
  '0987', '12.00');
  insert into transactions values (
  '0997', '14.00');
  insert into printbill values (
  'Bagel', '34','2.00','5.00');
insert into printbill values (
  'Bagel Better', '24', '2.00', '7.00');
  
  commit;