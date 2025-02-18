SELECT PRODUCT_ID, NAME, AVAILABLE_STOCK
FROM Product
WHERE AVAILABLE_STOCK = (SELECT max(AVAILABLE_STOCK)
                         FROM Product)

//-------------------------------------------------------------

SELECT p.PRODUCT_ID, p.NAME, p.AVAILABLE_STOCK
FROM product p
GROUP BY p.PRODUCT_ID, p.NAME, p.AVAILABLE_STOCK
HAVING p.AVAILABLE_STOCK = (
    SELECT MAX(AVAILABLE_STOCK)
    FROM product
);

//-------------------------------------------------------------

SELECT vehicle_part_id , arrived_timestamp
FROM vehicle_part_location
where location_id IN (3, 6, 12)
AND left_timestamp IS NOT NULL

//-------------------------------------------------------------

SELECT first_name , last_name
FROM baseball_player_stats
where ba >= 0.300
AND
hr >= 30
ORDER BY last_name asc

//-------------------------------------------------------------

//Alcohol consumption

SELECT COUNTRY
FROM alcohol_consumption
where TOTAL_CONSUMPTION = 0
order by country asc

//-------------------------------------------------------------

//State Province

SELECT distinct(state_province)
FROM location
order by state_province asc

//-------------------------------------------------------------

//Nombre de pièce (véhicule part)

SELECT v.vin, COUNT(vp.vehicle_part_id)
FROM VEHICLE v
INNER JOIN VEHICLE_PART vp on v.vehicle_id = vp.vehicle_id
GROUP BY v.vin

//-------------------------------------------------------------

// Fonction DENSE_RANK

SELECT
    po.customer_id,
    p.product_name,
    ROW_NUMBER() OVER (PARTITION BY po.customer_id ORDER BY po.order_date) AS order_number
FROM
    purchase_order po
JOIN
    order_product op ON po.order_id = op.order_id
JOIN
    product p ON op.product_id = p.product_id
ORDER BY
    po.customer_id, order_number;

//-------------------------------------------------------------


    SELECT SUM(
     CASE WHEN rating IS NULL THEN 0
     ELSE 1 END)
    FROM ratings

//-------------------------------------------------------------

SELECT
    a.column1,
    b.column2,
    c.column3,
    d.column4
FROM
    table_a a
JOIN
    table_b b ON a.common_column = b.common_column
JOIN
    table_c c ON b.common_column2 = c.common_column2
JOIN
    table_d d ON c.common_column3 = d.common_column3;

//-------------------------------------------------------------

//Alias and GROUP BY error

SELECT NAME, COUNT(PRODUCT_ID)
FROM PRODUCT
GROUP BY NAME

//-------------------------------------------------------------


SELECT first_name , last_name
FROM basketball_player_stats
WHERE PPG>=20
AND
RPG >=5.0
AND
APG>=5.0
AND
games_played >=50
ORDER BY last_name,first_name

//-------------------------------------------------------------

SELECT DISTINCT v.vin , vp.part_name
FROM vehicle v
LEFT JOIN vehicle_part vp on v.vehicle_id = vp.vehicle_id
ORDER BY v.vin;

//-------------------------------------------------------------

SELECT first_name , last_name , satisfaction
FROM employees
ORDER BY satisfaction desc, last_name asc
LIMIT 3

//-------------------------------------------------------------

SELECT c.LASTNAME as "LASTNAME" ,c.FIRSTNAME as "FIRSTNAME"
FROM customer c
where c.ZIPCODE in ('75000','34000')
and c.BIRTH_DATE is not null

//-------------------------------------------------------------

SELECT
    CONCAT(pickup_state, '-', dropoff_state) AS lane,
    EXTRACT(MONTH FROM shipment_date) AS calendar_month,
    COUNT(*) AS monthly_shipments,
    (SELECT COUNT(*)
     FROM shipments
     WHERE EXTRACT(MONTH FROM shipment_date) = EXTRACT(MONTH FROM s.shipment_date)
     AND EXTRACT(YEAR FROM shipment_date) = 2020) AS total
FROM
    shipments s
WHERE
    EXTRACT(YEAR FROM shipment_date) = 2020
    AND EXTRACT(MONTH FROM shipment_date) BETWEEN 1 AND 4
GROUP BY
    CONCAT(pickup_state, '-', dropoff_state), EXTRACT(MONTH FROM shipment_date)
ORDER BY
    calendar_month ASC,
    lane ASC;

//-------------------------------------------------------------

SELECT v.vehicle_name,
       COUNT(DISTINCT vp.vehicle_part_id) AS vehicle_part_count,
       COUNT(DISTINCT s.supplier_id) AS supplier_count
FROM vehicle v
JOIN vehicle_part vp ON v.vehicle_id = vp.vehicle_id
JOIN vehicle_part_supplier s ON vp.supplier_id = s.supplier_id
GROUP BY v.vehicle_name
HAVING COUNT(DISTINCT s.supplier_id) >= 2;

//-------------------------------------------------------------

SELECT v.MAKE,v.MODEL
FROM vehicle v
where v.VEHICLE_NAME like 'G%'
order by v.MAKE , v.MODEL

//--------------------------------------

SELECT
    c.customer_id,
    c.firstname,
    c.lastname,
    AVG(CAST(item_counts.item_count AS DECIMAL(10,2))) AS AVG
FROM
    customer c
JOIN
    purchase_order po ON c.customer_id = po.customer_id
JOIN (
    SELECT
        op.order_id,
        COUNT(op.product_id) AS item_count
    FROM
        order_product op
    GROUP BY
        op.order_id
) AS item_counts ON po.order_id = item_counts.order_id
GROUP BY
    c.customer_id,
    c.firstname,
    c.lastname
HAVING
    AVG(CAST(item_counts.item_count AS DECIMAL(10,2))) > 2
ORDER BY
    AVG DESC;


