create table public."T_Users"(
USER_ID character(5) PRIMARY KEY,
USER_NAME character varying(20),
AGE INTEGER,
USER_TYPE character varying
);

insert into public."T_Users"(user_id,user_name,age,user_type)
values('k0001','123',5,'dog');

insert into public."T_Users"(user_id,user_name,age,user_type)
values('k0002','asfa',6,'dog');

insert into public."T_Users"(user_id,user_name,age,user_type)
values('k0003','gwgagsa',10,'bird');

insert into public."T_Users"(user_id,user_name,age,user_type)
values('k0004','waerara',4,'cat');




create table public."T_Checkin"(
USER_ID character(5) PRIMARY KEY,
USER_NAME character varying(20),
ROOM_NUM Integer,
Checkin date,
Checkout date
);

insert into public."T_Checkin"(user_id,user_name,room_num,Checkin,Checkout)
values('k0002','asfa',102,'2023-03-10','2023-03-14');

insert into public."T_Checkin"(user_id,user_name,room_num,Checkin,Checkout)
values('k0003','gwgagsa',204,'2023-02-28','2023-03-05');