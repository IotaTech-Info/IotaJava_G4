SELECT name
FROM "T_CHECKIN"
INNER JOIN "T_USER"
ON "T_CHECKIN"."memberID" = "T_USER"."memberID";

SELECT name, "T_CHECKIN"."checkinDate"
FROM "T_CHECKIN"
LEFT JOIN "T_USER"
ON "T_CHECKIN"."memberID" = "T_USER"."memberID";

SELECT name, "T_USER"."type"
FROM "T_CHECKIN"
RIGHT JOIN "T_USER"
ON "T_CHECKIN"."memberID" = "T_USER"."memberID";

SELECT name, "T_USER"."type"
FROM "T_CHECKIN"
FULL OUTER JOIN "T_USER"
ON "T_CHECKIN"."memberID" = "T_USER"."memberID";

SELECT name, SUM("T_USER"."age") FROM "T_USER" GROUP BY name;