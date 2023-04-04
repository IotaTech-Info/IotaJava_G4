 create table public."Pet_USER"(
USER_ID character(10) PRIMARY KEY,
USER_NAME character varying(10),
AGE integer,
USER_TYPE character varying
);
Drop table public."Pet_USER";
insert into public."Pet_USER" (USER_ID, USER_NAME, AGE,USER_TYPE) values('K0001', 'dahuang', 5 ,'DOG');
insert into public."Pet_USER" (USER_ID, USER_NAME, AGE, USER_TYPE) values('K1', 'dahuang',5,'DOG');
insert into public."Pet_USER" (USER_ID,USER_NAME,AGE,USER_TYPE) values('K0009', 'dahuang123,5,'DOG');