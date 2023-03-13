create table public. "T_CHECKIN" (
USER_ID character(5), 
CHECKIN_DATE date,
CHECKOUT_DATE date,
USER_CLAIM boolean)


INSERT INTO public. "T_USER" (USER_ID, PetName, OwnerName, PetType, PetAge, VIP)
VALUES ('001', 'Snoopy', 'Charlie', 'DOG', '3', 'Yes');

select * from public."T_USER"

insert into public."T_CHECKIN" (USER_ID, CHECKIN_DATE, CHECKOUT_DATE, USER_CLAIM)
VALUES ('001','20230310','20230312','no')

select * from public."T_CHECKIN"