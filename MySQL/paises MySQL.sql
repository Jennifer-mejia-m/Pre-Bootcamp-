/*1*/

SELECT countries.name, languages.language, languages.percentage FROM languages
JOIN countries ON countries.id=languages.country_id
WHERE language = "Slovene" 
ORDER BY percentage DESC;

/*2*/

SELECT countries.name, max(languages.language) AS language, COUNT(countries.name) AS ciudades FROM countries
JOIN languages ON countries.id=languages.country_id
GROUP BY countries.name
ORDER  BY ciudades DESC;

/*3*/

SELECT name, population FROM cities
WHERE country_code="MEX" AND population > 500000
ORDER BY population DESC;

/*4*/

SELECT countries.name, languages.language, languages.percentage FROM languages
JOIN countries ON languages.country_id=countries.id
WHERE percentage > 89
ORDER BY percentage DESC;

/*5*/

SELECT name, surface_area, population FROM countries
WHERE surface_area < 501
AND population > 100000;

/*6*/

SELECT name, government_form, capital, life_expectancy FROM countries
WHERE government_form LIKE "%Constitutional Monarchy%"
AND capital > 200
AND life_expectancy > 75;

/*7*/

SELECT countries.name, cities.name AS city, cities.district, countries.population FROM countries
JOIN cities ON countries.id=cities.country_id
WHERE countries.name = "Argentina"
AND countries.population > 500000
AND cities.district = "Buenos Aires";

/*8*/

SELECT region, COUNT(region) AS paises FROM countries
GROUP BY region
ORDER BY paises DESC;







