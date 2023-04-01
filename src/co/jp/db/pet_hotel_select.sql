update public."T_USER" set USER_AGE=16 where USER_NAME='Jun';

create table public."T_RECORD"(USER_ID character(5),CHECKIN_DATE date,CHECKOUT_DATE date,CREATE_DATE date,UPDATE_DATE date);
INSERT into public."T_RECORD"(USER_ID,CHECKIN_DATE,CHECKOUT_DATE)values('U3','20230306','20230309');
INSERT into public."T_RECORD"(USER_ID,CHECKIN_DATE,CHECKOUT_DATE)values('U4','20230330','20230331');
INSERT into public."T_RECORD"(USER_ID,CHECKIN_DATE,CHECKOUT_DATE)values('U1','20230330','20230331');

select * from public."T_USER" T1 inner join public."T_RECORD" T2 on T1.USER_ID=T2.USER_ID;
select * from public."T_USER" T1 left join public."T_RECORD" T2 on T1.USER_ID=T2.USER_ID;
select * from public."T_USER" T1 right join public."T_RECORD" T2 on T1.USER_ID=T2.USER_ID;
select * from public."T_USER" T1 full outer join public."T_RECORD" T2 on T1.USER_ID=T2.USER_ID order by T1.USER_ID asc;
select CHECKIN_DATE, COUNT(*) from public."T_USER" T1 full outer join public."T_RECORD" T2 on T1.USER_ID=T2.USER_ID group by T2.CHECKIN_DATE;