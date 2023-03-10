create table public."T_Checkin"(
USER_ID character(5) PRIMARY KEY,
USER_NAME character varying,
ROOM_NO Integer,
TimeOfCheckin date,
TimeOfCheckout date
);

insert into public."T_Checkin"(user_id,user_name,room_no,TimeOfCheckin,TimeOfCheckout)values('k0002','pangpang',102,'2019-09-07','2019-09-10');
insert into public."T_Checkin"(user_id,user_name,room_no,TimeOfCheckin,TimeOfCheckout)values('k0004','lvdeshui',101,'2019-10-01','2019-10-05');
