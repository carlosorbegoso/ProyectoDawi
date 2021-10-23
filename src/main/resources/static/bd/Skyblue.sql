create database if not exists Skyblue;
 use  Skyblue;
 create table if not exists Vehiculos(
	Vehiculo_codigo int primary key not null,
	Vehiculo_placa char(8),
	Vehiculo_marca varchar(15),
	Vehiculo_modelo varchar(30),
	Vehiculo_color varchar (10)
 );
create table if not exists Trabajador(
	Trabajador_codigo int primary key not null,
	Trabajador_nombre varchar(45),
	Trabajador_apellidos varchar(45),
	Trabajador_dni varchar(9),
	Trabajador_cargo varchar(45),
	Trabajador_telefono varchar(15)
	
);

create table if not exists Ruta(
	ruta_codigo int primary key not null,
    ruta_nombre varchar(45),
    ruta_tipo varchar(45)
);
 select * from Vehiculos;
insert into Vehiculos (Vehiculo_codigo, Vehiculo_placa, Vehiculo_marca, Vehiculo_modelo, Vehiculo_color) values (3, 'fsa', 'Tompkinson', 'mtompkinson2@weibo.com', '#062a2a');
insert into Vehiculos (Vehiculo_codigo, Vehiculo_placa, Vehiculo_marca, Vehiculo_modelo, Vehiculo_color) values (4, 'afs', 'Spenclay', 'tspenclay3@ameblo.jp', '#56775b');
insert into Vehiculos (Vehiculo_codigo, Vehiculo_placa, Vehiculo_marca, Vehiculo_modelo, Vehiculo_color) values (5, 'asdf', 'Abramov', 'aabramov4@chron.com', '#a6e1cc');
insert into Vehiculos (Vehiculo_codigo, Vehiculo_placa, Vehiculo_marca, Vehiculo_modelo, Vehiculo_color) values (6, 'asf', 'Clemas', 'fclemas5@chronoengine.com', '#027aad');
insert into Vehiculos (Vehiculo_codigo, Vehiculo_placa, Vehiculo_marca, Vehiculo_modelo, Vehiculo_color) values (7, 'asdf', 'Bummfrey', 'dbummfrey6@usda.gov', '#bf278b');
insert into Vehiculos (Vehiculo_codigo, Vehiculo_placa, Vehiculo_marca, Vehiculo_modelo, Vehiculo_color) values (8, 'fasd', 'Carvil', 'mcarvil7@go.com', '#209870');
insert into Vehiculos (Vehiculo_codigo, Vehiculo_placa, Vehiculo_marca, Vehiculo_modelo, Vehiculo_color) values (9, 'asdf', 'Karsh', 'kkarsh8@51.la', '#0df879');
insert into Vehiculos (Vehiculo_codigo, Vehiculo_placa, Vehiculo_marca, Vehiculo_modelo, Vehiculo_color) values (10, 'adfs', 'Quinney', 'hquinney9@mlb.com', '#fe69c4');