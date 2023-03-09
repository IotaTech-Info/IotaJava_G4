select * from public."T_USER" T1
inner join public."T_CHECKIN" T2
on T1.user_id = T2.user_id

select * from public."T_USER" T1
left join public."T_CHECKIN" T2
on T1.user_id = T2.user_id

select * from public."T_USER" T1
right join public."T_CHECKIN" T2
on T1.user_id = T2.user_id

select * from public."T_USER" 
order by age
