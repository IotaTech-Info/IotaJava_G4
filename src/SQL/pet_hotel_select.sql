Drop table public."T_Users";
Drop table public."T_Checkin";



create table public."T_Users"(
USER_ID character(5)PRIMARY KEY,
ROOM_ID integer,
USER_NAME character varying,
USER_AGE integer,
USER_TYPE character varying 
);

create table public."T_Checkin"(
USER_ID character(5)PRIMARY KEY,
CHECKIN_DAY character(10),
CHECKOUT_DAY character(10),
CREAT_DATE character(10),
UPDATE_DATE character(10)
);


insert into public."T_Users"(USER_ID,ROOM_ID,USER_NAME,USER_AGE,USER_TYPE)
values('K0001',101,'A',5,'DOG');
insert into public."T_Users"(USER_ID,ROOM_ID,USER_NAME,USER_AGE,USER_TYPE)
values('K0002',201,'B',6,'CAT');
insert into public."T_Users"(USER_ID,ROOM_ID,USER_NAME,USER_AGE,USER_TYPE)
values('K0003',301,'C',7,'BIRD');
insert into public."T_Users"(USER_ID,ROOM_ID,USER_NAME,USER_AGE,USER_TYPE)
values('K0004',301,'CX',7,'BIRD');
insert into public."T_Users"(USER_ID,ROOM_ID,USER_NAME,USER_AGE,USER_TYPE)
values('K0005',201,'BA',6,'CAT');
insert into public."T_Users"(USER_ID,ROOM_ID,USER_NAME,USER_AGE,USER_TYPE)
values('K0006',101,'AS',5,'DOG');

insert into public."T_Checkin"(USER_ID,CHECKIN_DAY,CHECKOUT_DAY,CREAT_DATE,UPDATE_DATE)
values('K0001',20230101,20230103,20230101,20230103);
insert into public."T_Checkin"(USER_ID,CHECKIN_DAY,CHECKOUT_DAY,CREAT_DATE,UPDATE_DATE)
values('K0002',20230201,20230203,20230201,20230203);
insert into public."T_Checkin"(USER_ID,CHECKIN_DAY,CHECKOUT_DAY,CREAT_DATE,UPDATE_DATE)
values('K0003',20230301,20230303,20230301,20230303);
insert into public."T_Checkin"(USER_ID,CHECKIN_DAY,CHECKOUT_DAY,CREAT_DATE,UPDATE_DATE)
values('K0004',20230305,20230308,20230305,20230308);


select *
from public."T_Users" T1
inner join public."T_Checkin"T2
on T1.USER_ID = T2.USER_ID


select *
from public."T_Users" T1
left join public."T_Checkin"T2
on T1.USER_ID = T2.USER_ID


select *
from public."T_Users" T1
right join public."T_Checkin"T2
on T1.USER_ID = T2.USER_ID


select *
from public."T_Users" T1
full outer JOIN public."T_Checkin"T2
on T1.USER_ID = T2.USER_ID


select USER_AGE
from public."T_Users"T1
inner join public."T_Checkin" T2
on T1.user_id=T2.user_id
group by USER_AGE;

