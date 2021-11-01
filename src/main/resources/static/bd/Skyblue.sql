create database if not exists Skyblue;
 use  Skyblue;
select * from conductor;

create table if not exists conductor(
	tr_id int primary key auto_increment not null,
	tr_codigo varchar(10),
    tr_nombre varchar(45),
	tr_apellidoP varchar(45),
    tr_apellidoM varchar(45),
	tr_dni varchar(9),
	tr_telefono varchar(15),
	tr_lic_numero varchar(45),
	tr_lic_clase varchar(4),
	tr_lic_categoria varchar(3),
	tr_lic_fecha_expedicion date,
	tr_lic_fecha_revalidacion date
); 
create table if not exists cargo(
	car_id int primary key auto_increment not null,
    nombre varchar(45),
    detalle varchar(45)
);
select * from cargo;
create table if not exists empleado(
	em_id int primary key auto_increment not null,
	em_codigo varchar(10),
	em_apellidoP varchar(45),
    em_apellidoM varchar(45),
	em_dni varchar(9),
	em_telefono varchar(15),
	em_correo varchar(15),
    car_id int,
    foreign key (car_id) references cargo(car_id)
);
 create table if not exists vehiculos(
	veh_codigo int primary key not null,
	veh_placa char(8),
	veh_marca varchar(15),
	veh_modelo varchar(30),
	veh_color varchar (10)
 );
create table if not exists ruta(
	rta_codigo int primary key not null,
    rta_nombre varchar(45),
    rta_tipo varchar(45)
);
 select * from Vehiculos;
