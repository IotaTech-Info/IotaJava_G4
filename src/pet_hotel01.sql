create table public."T_Users"(
USER_ID character(5) PRIMARY KEY,
USER_NAME character varying,
AGE INTEGER,
USER_TYPE character varying
);

insert into public."T_Users"(user_id,user_name,age,user_type)values('k0001','owen',5,'dog');
insert into public."T_Users"(user_id,user_name,age,user_type)values('k0002','pangpang',1,'cat');
insert into public."T_Users"(user_id,user_name,age,user_type)values('k0003','niumang',10,'bird');
insert into public."T_Users"(user_id,user_name,age,user_type)values('k0004','lvdeshui',1,'cat');


