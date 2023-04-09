create table categories(ID int primary key identity, name varchar(50))
create table menu(ID int primary key identity, categoryID int foreign key references categories(ID), name varchar(50), details varchar(500), price float, prepTimeMins int)
create table orders(ID int primary key identity, menuID int foreign key references menu(ID))

