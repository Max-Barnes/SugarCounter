-- Category,Item,Serving Size,Calories,Calories from Fat,Total Fat,Total Fat (% Daily Value),Saturated Fat,Saturated Fat (% Daily Value),Trans Fat,Cholesterol,Cholesterol (% Daily Value),Sodium,Sodium (% Daily Value),
--Carbohydrates,Carbohydrates (% Daily Value),Dietary Fiber,Dietary Fiber (% Daily Value),Sugars,Protein,Vitamin A (% Daily Value),Vitamin C (% Daily Value),Calcium (% Daily Value),Iron (% Daily Value)

-- pod acronym for percent of daily value
START TRANSACTION;

DROP TABLE IF EXISTS food_sugar;

CREATE TABLE food_sugar (
	id serial PRIMARY KEY,
	name varchar(200),
	sugar int	
);

CREATE TABLE sugar_mcdonalds_temp(
	Category varchar(100),
	Item varchar(100) not null,
	serving_size varchar(20), 
	calories varchar(10),
	calories_from_fat numeric(6,2),
	totalfat numeric(6,2),
	totalfat_pod numeric(6,2),
	saturatedfat numeric(6,2),
	saturatedfat_pod numeric(6,2),
	trans_fat numeric(6,2),
	cholesterol numeric(6,2),
	cholesterol_pod numeric(6,2),
	sodium numeric(6,2), 
	sodium_pod numeric(6,2),
	carbs numeric(6,2),
	carbs_pod numeric(6,2), 
	dietary_fiber numeric(6,2),
	dietary_fiber_pod numeric(6,2),
	sugars int not null,
	protein numeric(6,2),
	vitamina numeric(6,2),
	vitaminc numeric(6,2), 
	calcium numeric(6,2),
	iron numeric(6,2)
);

copy sugar_mcdonalds_temp from 'C:\Users\Public\SugarCSV\menu.csv' DELIMITER ',' CSV HEADER;

insert into food_sugar (name, sugar)
select item, sugars 
from sugar_mcdonalds_temp;

DROP TABLE sugar_mcdonalds_temp;



COMMIT;