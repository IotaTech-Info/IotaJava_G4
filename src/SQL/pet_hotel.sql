Drop table public."USER";

create table public."USER"(
USER_ID character(5)PRIMARY KEY,
ROOM_ID integer,
USER_NAME character varying,
USER_AGE integer,
USER_TYPE character varying 
);

insert into public."USER"(USER_ID,ROOM_ID,USER_NAME,USER_AGE,USER_TYPE)
values('K0001',101,'A',5,'DOG');
insert into public."USER"(USER_ID,ROOM_ID,USER_NAME,USER_AGE,USER_TYPE)
values('K0002',201,'B',6,'CAT');
insert into public."USER"(USER_ID,ROOM_ID,USER_NAME,USER_AGE,USER_TYPE)
values('K0003',301,'C',7,'BIRD');
