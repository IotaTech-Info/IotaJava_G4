create table public."LOG"(
	LOG_ID character(5)PRIMARY KEY,
	ROOM_ID integer,
	PET_NAME character varying,
	PRICE double precision,
	CHECKIN_DATE date,
	CHECKOUT_DATE date
);

insert into public."LOG"(LOG_ID, ROOM_ID, PET_NAME, PRICE, CHECKIN_DATE, CHECKOUT_DATE)
values('00001', 101, 'Harry', 25000, '2023-2-1', '2023-2-4');
insert into public."LOG"(LOG_ID, ROOM_ID, PET_NAME, PRICE, CHECKIN_DATE, CHECKOUT_DATE)
values('00002', 202, 'Potter', 20000.5, '2023-3-1', '2023-3-3');
insert into public."LOG"(LOG_ID, ROOM_ID, PET_NAME, PRICE, CHECKIN_DATE, CHECKOUT_DATE)
values('00003', 303, 'Ron', 15000, '2023-3-3', '2023-3-4');
insert into public."LOG"(LOG_ID, ROOM_ID, PET_NAME, PRICE, CHECKIN_DATE, CHECKOUT_DATE)
values('00004', 404, 'Wesley', 250000, '2023-3-1', '2023-3-31');
