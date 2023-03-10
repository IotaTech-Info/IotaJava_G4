select *
from public."T_Users" T1
inner join public."T_Checkin" T2
on T1.user_id=T2.user_id
where T1.user_name like 'pangpang%';


select *
from public."T_Users" T1
left join public."T_Checkin" T2
on T1.user_id=T2.user_id
where T1.user_name like 'lvdeshui%';

select *
from public."T_Users" T1
right join public."T_Checkin" T2
on T1.user_id=T2.user_id
where T1.user_name like 'pangpang%';

select *
from public."T_Users" T1
full outer join public."T_Checkin" T2
on T1.user_id=T2.user_id
where T1.user_name like 'lvdeshui%';

select USER_TYPE 
from  public."T_Users" T1
inner  join public."T_Checkin" T2
on T1.user_id=T2.user_id
group by USER_TYPE;