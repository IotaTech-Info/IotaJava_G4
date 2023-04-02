create table public."T_CHECKIN"(
USER_ID character(5) PRIMARY KEY,
CHECKIN_DAY date,
CHECKOUT_DAY date,
CREATE_DAY date,
UPDATE_DAY date
);

select *
from public."T_USER" T1
inner join public."T_CHECKIN" T2
on T1.user_id = t2.user_id
where T1.user_name like 'A%';


select *
from public."T_USER" T1
left join public."T_CHECKIN" T2
on T1.user_id = t2.user_id;

select *
from public."T_USER" T1
right join public."T_CHECKIN" T2
on T1.user_id = t2.user_id;

select *
from public."T_USER" T1
full outer join public."T_CHECKIN" T2
on T1.user_id = t2.user_id
order by T1.user_id;

select checkin_day,count(*)
from public."T_USER" T1
right join public."T_CHECKIN" T2
on T1.user_id = t2.user_id
group by checkin_day;