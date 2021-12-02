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
select * from propietario;
CREATE TABLE propietario (
  pr_id int primary key auto_increment not null,
  pr_codigo varchar(10),
  pr_nombre varchar(45),
  pr_apellidoP varchar(45),
  pr_apellidoM varchar(45),
  pr_dni varchar(9),
  pr_telefono varchar(25),
  pr_correo varchar(45),
  car_id int,
  FOREIGN KEY (car_id) REFERENCES cargo (car_id)
) ;
CREATE TABLE vehiculos (
  vehi_id int primary key auto_increment not null,
  veh_codigo varchar(10),
  veh_nro_placa varchar(10),
  veh_nro_serie varchar(25),
  veh_nro_vin varchar(25),
  veh_nro_motor varchar(25),
  veh_color varchar(10),
  veh_marca varchar(45),
  veh_modelo varchar(45),
  vehi_placa_vigente varchar(10),
  vehi_placa_anterior varchar(10),
  vehi_estado varchar(25),
  vehi_anotaciones varchar(45),
  vehi_sede varchar(25),
  pr_id int,
 FOREIGN KEY (pr_id) REFERENCES propietario(pr_id)
) 

create table if not exists viaje(
vj_id int primary key not null auto_increment,
vj_fecha date,
vj_hora_inicial time,
vj_hora_final time,
vj_hora_total time,
vj_hora_frecuencia time,
vj_ruta char(5),
vj_lado char(2),
vj_nro_viaje int,
id_conductor int,
id_vehiculo int,
foreign key (id_conductor) references conductor(tr_id),
foreign key (id_vehiculo) references vehiculo(vehi_id)
);




create table if not exists ruta(
	rta_codigo int primary key not null,
    rta_nombre varchar(45),
    rta_tipo varchar(45)
);
 select * from Vehiculos;
