--יצירת טבלת זמני כניסה ויציאה
create table times(code int primary key identity,
worker_code int foreign key references workers(code),
entry_time datetime, exit_time datetime)

--העובד מגיע לעבודה ומכניס מספר זהות וסיסמא
declare @worker_code int, @id varchar(20) = '123456789', @password varchar(20)
= '5678', @answer varchar(100)

--מציאת קוד עובד לפי מספר זהות
select @worker_code = (select code from workers where id = @id)
if @worker_code is null
    begin
	    select @answer = 'שם משתמש או סיסמא אינם נכונים'
	end
else
    begin
	    --בדיקה האם הסיסמא אינה קיימת לעובד הנוכחי
	    if not exists(
		select code from passwords where worker_code = @worker_code and
		password = @password and is_valid=1)
		  begin
		      select @answer = 'שם משתמש או סיסמא אינם נכונים'
		  end
		else
		    begin
			     --בדיקה נוספת כולל תאריך בתוקף
				 if not exists(
				 select code from passwords where worker_code = @worker_code and
				 password = @password and is_valid = 1 and expire_date > GETDATE())
				   begin
				       select @answer = 'תוקף הסיסמא עבר. עליך להחליף'
				   end
				else
				   begin
				       --בדיקה האם נכנס עכשיו לעבודה או שיוצא הביתה
				       if not exists(select code from times where
					   worker_code = @worker_code and exit_time is null)
					       begin--הכנסת שעת כניסה
						        insert into times values(@worker_code, GETDATE(), null)
								select @answer = 'שעת כניסה' + convert(varchar(20)
								, GETDATE(),103) + ' ' + convert(varchar(20), getdate(), 108)

						   end
						else
						    begin--הכנסת שעת יציאה
							     update times set exit_time = GETDATE() where
								 worker_code = @worker_code and exit_time is null
								 select @answer = 'שעת יציאה' + convert(varchar(20),
								 getdate(), 103) + ' ' + convert(varchar(20),getdate(), 108)
								 end
							end
					end
			end
			select @answer

