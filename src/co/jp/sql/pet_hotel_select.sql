select * from public."T_USER"
--inner join
SELECT public."T_USER".petname,public."T_CHECKIN".CHECKIN_DATE
FROM public."T_USER"
INNER JOIN public."T_CHECKIN"
ON "T_USER".USER_ID = "T_CHECKIN".USER_ID;

--left join
SELECT public."T_USER".petname,public."T_CHECKIN".CHECKIN_DATE
FROM public."T_USER"
LEFT JOIN public."T_CHECKIN"
ON "T_USER".USER_ID = "T_CHECKIN".USER_ID;

--right join
SELECT public."T_USER".petname,public."T_CHECKIN".CHECKIN_DATE
FROM public."T_USER"
RIGHT JOIN public."T_CHECKIN"
ON "T_USER".USER_ID = "T_CHECKIN".USER_ID;

--full outer join
SELECT public."T_USER".petname,public."T_CHECKIN".CHECKIN_DATE
FROM public."T_USER"
FULL OUTER JOIN public."T_CHECKIN"
ON "T_USER".USER_ID = "T_CHECKIN".USER_ID;

--group by
SELECT public."T_USER".petname
FROM public."T_USER"
GROUP BY USER_ID