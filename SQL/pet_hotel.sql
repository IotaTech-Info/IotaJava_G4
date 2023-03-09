create table public."T_USER"(
USER_ID character(5) PRIMARY KEY,
ROOM_NUM integer,
USER_NAME character varying,
AGE integer,
USER_TYPE character varying,
CHECK_IN_TIME date,
);

Drop table public."T_USER";

insert into public."T_USER" (USER_ID, ROOM_NUM, USER_NAME, AGE, USER_TYPE, CHECK_IN_TIME)
values('K0001', 101, 'dahuang', 5, 'DOG', '20230306');
insert into public."T_USER" (USER_ID, ROOM_NUM, USER_NAME, AGE, USER_TYPE, CHECK_IN_TIME)
values('K0002', 102, 'dahuang', 5, 'DOG', '20230306');
insert into public."T_USER" (USER_ID, ROOM_NUM, USER_NAME, AGE, USER_TYPE, CHECK_IN_TIME)
values('K0003', 103, 'dahuang', 5, 'DOG', '20230306');
insert into public."T_USER" (USER_ID, ROOM_NUM, USER_NAME, AGE, USER_TYPE, CHECK_IN_TIME)
values('K0004', 104, 'dahuang', 5, 'DOG', '20230306');
insert into public."T_USER" (USER_ID, ROOM_NUM, USER_NAME, AGE, USER_TYPE, CHECK_IN_TIME)
values('K0005', 105, 'dahuang', 5, 'DOG', '20230306');