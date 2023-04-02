create table public."T_USER"(
USER_ID character(5) PRIMARY KEY,
USER_NAME character varying(20),
USER_AGE integer,
USER_TYPE character varying(20)
);

insert into public."T_USER"(USER_ID,USER_NAME,USER_AGE,USER_TYPE)
values('T0001','AA',1,'CAT');
insert into public."T_USER"(USER_ID,USER_NAME,USER_AGE,USER_TYPE)
values('T0002','BB',2,'DOG');
insert into public."T_USER"(USER_ID,USER_NAME,USER_AGE,USER_TYPE)
values('T0003','CC',5,'BIRD');	
insert into public."T_USER"(USER_ID,USER_NAME,USER_AGE,USER_TYPE)
values('T0004','DD',8,'CAT');
insert into public."T_USER"(USER_ID,USER_NAME,USER_AGE,USER_TYPE)
values('T0005','EE',3,'CAT');
