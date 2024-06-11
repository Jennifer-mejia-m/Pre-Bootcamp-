SELECT charged_datetime AS month, SUM(amount) as total FROM billing
WHERE charged_datetime LIKE "%2012-03%";

/*2*/

SELECT client_id, SUM(amount) AS total FROM billing
WHERE client_id = 2;

/*3*/

SELECT domain_name, client_id FROM sites
WHERE client_id = 10;

/*4*/

SELECT MONTHNAME (created_datetime) AS mes, YEAR (created_datetime) AS año, COUNT(created_datetime) FROM sites
WHERE client_id = 1
GROUP BY created_datetime;

/*5*/

SELECT sites.domain_name, COUNT(leads_id) FROM leads
JOIN sites ON leads.site_id = sites.site_id
WHERE registered_datetime >= "2011-01-01"
AND registered_datetime <= "2011-02-15"
GROUP BY leads_id;

/*6*/

SELECT * FROM sites
LEFT JOIN clients ON sites.client_id = clients.client_id;
