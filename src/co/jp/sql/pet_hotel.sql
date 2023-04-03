create table public."T_USER"(
	USER_ID character(5) PRIMARY KEY,
	USER_NAME character varying,
	AGE integer,
	USER_TYPE character varying
)

create table public."T_ROOM"(
	USER_ID character(5) PRIMARY KEY,
	USER_NAME character varying,
	STATUS character varying,
	CHECKIN_DAY date,
	CHECKIN_OUT date,
	CREATE_DAY date,
	UPDATE_DAY date
)

INSERT INTO public."T_USER"(
	user_id, user_name, age, user_type)
	VALUES ('K0001', '旺财', 3, 'DOG');
INSERT INTO public."T_USER"(
	user_id, user_name, age, user_type)
	VALUES ('K0002', '咪咪', 1, 'CAT');
INSERT INTO public."T_USER"(
	user_id, user_name, age, user_type)
	VALUES ('K0003', '皮皮', 2, 'BIRD');

INSERT INTO public."T_ROOM"(
	user_id, user_name, status, checkin_day, checkout_day, create_day, update_day)
	VALUES ('K0001', '旺财', '入住', '2023-03-01', '2023-03-02', '2023-03-01', '2023-03-02');
INSERT INTO public."T_ROOM"(
	user_id, user_name, status, checkin_day, checkout_day, create_day, update_day)
	VALUES ('K0002', '咪咪', '预约', '2023-03-05', '2023-03-06', '2023-03-02', '2023-03-03');
INSERT INTO public."T_ROOM"(
	user_id, user_name, status, checkin_day, checkout_day, create_day, update_day)
	VALUES ('K0003', '皮皮', '入住', '2023-03-02', '2023-03-03', '2023-03-02', '2023-03-03');
