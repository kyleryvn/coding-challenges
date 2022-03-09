/* MySQL */

SELECT cities.city_name AS city_name, FLOOR(AVG(revenue.revenue)) AS average_revenue
FROM cities
JOIN revenue ON cities.city_code = revenue.city_code
GROUP BY cities.city_name;