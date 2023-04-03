select * 
from public."T_USER" T1
inner join public."T_ROOM" T2
on T1.user_id = t2.user_id;
--where T1.user_name like '旺%';

select * 
from public."T_USER" T1
left join public."T_ROOM" T2
on T1.user_id = t2.user_id;

select
T1.user_id,
T2.user_id,
T2.checkin_day
from public."T_USER" T1
right join public."T_ROOM" T2
on T1.user_id = t2.user_id;

select *
from public."T_USER" T1
full outer join public."T_ROOM" T2
on T1.user_id = t2.user_id
order by
checkin_day asc,
T1.age desc;

select checkin_day, count(*)
from public."T_USER" T1
full outer join public."T_ROOM" T2
on T1.user_id = t2.user_id
group by checkin_day;



