--select * from categories
--select * from menu
select * from orders

insert into orders (menuID) values (1)
insert into orders (menuID) values (4)
declare @menuID varchar
select @menuID = (select ID from menu where name = 'Trout')
insert into orders (menuID) values (@menuID)

select * from orders inner join menu on menuID = menu.ID
select orders.ID as orderID, menu.name from orders inner join menu on menuID = menu.ID

delete from orders where ID = 7

--select categories.name as category, menu.name, price, prepTimeMins from categories inner join menu on categories.ID = categoryID-- where categories.name = 'Fish'