select * from public."T_USER"
where user_name like 'dahuang'; select * from public."T_CHECKIN" where user_id ='K0002';
select *form public."T_USER" T1
inner join public."T_CHECKIN" T2 on T1.Iser_id == t2.user_id
where user_name like 'dahuang';

select T1.user_id,T2.checkout_day from public."T_USER" T1
right join public."T_CHECKIN" T2 on T1.user_id = t2.user_id;
select *from public."T_CHECKIN" T1
left join public."T_USER" T2 on T1.user_id = t2.user_id;

select * from public."T_CHECKIN" T1
full outer join public."T_USER" T2 on T1.user_id = t2.user_id;