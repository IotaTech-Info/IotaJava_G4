create table public."T_USER"(USER_ID character(5) primary key,USER_NAME character varying(20) not null,USER_AGE integer);
create table public."T_PET"(PET_ID character(5) primary key,USER_ID character(5) not null,PET_NAME character varying(20) not null,PET_TYPE character varying not null,PET_GENDER integer,PET_AGE integer);

insert into public."T_USER"(USER_ID,USER_NAME)values('U1','Sato');
insert into public."T_USER"(USER_ID,USER_NAME)values('U2','Jun');
insert into public."T_PET"(PET_ID,USER_ID,PET_NAME,PET_TYPE)values('P1','U1','Poppo','BIRD');
insert into public."T_PET"(PET_ID,USER_ID,PET_NAME,PET_TYPE,PET_GENDER)values('P3','U1','Kame','TURTLE','0');
insert into public."T_PET"(PET_ID,USER_ID,PET_NAME,PET_TYPE,PET_AGE)values('P2','U2','Kodaku','BIRD','3');
insert into public."T_USER"(USER_ID,USER_NAME) values('U3','LI');
insert into public."T_PET"(PET_ID,USER_ID,PET_NAME,PET_TYPE)values('P4','U3','Dahuanger','DOG')