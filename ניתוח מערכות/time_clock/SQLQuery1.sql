create table workers(code int primary key identity, id	varchar(12),
first_name nvarchar(10), last_name nvarchar(10),
email varchar(30), telephone varchar(10),
street nvarchar(10), number nvarchar(10), city nvarchar(10))

select * from workers

declare @id varchar(50) = '123456789', @first_name varchar(50) = 'first', @last_bane varchar(50) = 'last'

if not exists(select id from workers where id=@id)

insert into workers values('123456789', 'אלעד', 'פרס', 'email@mail.com',
'054444', 'street','num', 'רחובות')

update workers set first_name = 'Elad', last_name = 'Press', city = 'Gedera'


--יצירת טבלת סיסמאות
create table passwords(code int primary key identity,
worker_code int foreign key references workers(code),
password varchar(15), expire_date date, is_valid bit)



--סיסמא זמנית לעובד החדש
declare @worker_code int, @id varchar(20) ='123456789', @password_temp varchar(20)='1234'
select @worker_code=(select code from workers where id=@id)

insert into passwords values(@worker_code, @password_temp, GETDATE(),1)

--החלפת סיסמא לעובד קיים במערכת
declare @worker_code int, @id varchar='123456789', @old_password varchar(20),
@new_password varchar(20), @answer varchar(100)
select @worker_code=(select code from workers where id=@id)

select * from passwords