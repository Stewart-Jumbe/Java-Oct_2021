DROP TABLE if exists `human` CASCADE;
create table 
	`human` 

(

	id integer AUTO_INCREMENT, 
	age_of_birth integer not null, 
	bionic_tech boolean not null, 
	implanted_ability varchar(255), 
	name varchar(255), 
	planet_of_orgin varchar(255), 
	update_version double not null,
	primary key (id)

);