create table public."T_USER"(
USER_ID character(5) PRIMARY KEY,
ROOM_NUM integer,
USER_NAME character varying,
AGE integer,
USER_TYPE character varying,
CHECK_IN_TIME date,
);

Drop table public."T_USER";

insert into public."T_USER" (USER_ID, USER_NAME, AGE, USER_TYPE)
values('K0001', 'dahuang', 5, 'DOG');
insert into public."T_USER" (USER_ID, USER_NAME, AGE, USER_TYPE)
values('K0002', 'dahuang', 5, 'DOG');
insert into public."T_USER" (USER_ID, USER_NAME, AGE, USER_TYPE)
values('K0003', 'dahuang', 5, 'DOG');
insert into public."T_USER" (USER_ID, USER_NAME, AGE, USER_TYPE)
values('K0004', 'dahuang', 5, 'DOG');