--drop table favorites
--drop table guests
--drop table categories
create table  guests(code int primary key identity , name varchar(20))
create table categories(code int primary key identity, name varchar(20))
create table favorites(code int primary key identity, guest_code int references guests(code), category_code int references categories(code), name varchar(20))

insert into guests(name) values ('Elad')
insert into guests(name) values ('Uriel')
insert into categories(name) values('Fish')
insert into categories(name) values('Chicken')

select * from guests
select * from favorites
select * from categories
--select * from favorites

declare @name varchar(20) = 'Shalev', @answer varchar(200)

if not exists(select name from guests where name = @name)
  begin
    insert into guests(name) values(@name)
  end

  select * from guests

  insert into favorites(guest_code, category_code, name) values(1, 2, 'Elad')

  select favorites.code, categories.name, guests.name from 
  favorites
  inner join guests on guests.code = guest_code
  inner join categories on category_code = categories.code
  order by categories.name


