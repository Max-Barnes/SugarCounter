start transaction;

drop table if exists food_data;

create table food_data (
	id serial primary key,
	restaurant varchar(200),
	item varchar(200),
	cal int,
	cal_fat int,
	total_fat int,
	sat_fat numeric(6,2),
	trans_fat numeric(6,2),
	cholesterol int,
	sodium int,
	total_carb int,
	fiber int,
	sugar int,
	protein int,
	vit_a int,
	vit_c int,
	calcium int,
	salad varchar(50)
);

copy food_data (restaurant, item, cal, cal_fat, total_fat, sat_fat, trans_fat, cholesterol, sodium, total_carb, fiber, sugar, protein, vit_a, vit_c, calcium, salad)
from 'C:\Users\Public\DatabaseCSV\fastfood.csv' delimiter ',' csv header;

commit transaction;