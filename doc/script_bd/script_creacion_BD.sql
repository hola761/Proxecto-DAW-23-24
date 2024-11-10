/*CREACIÓN DB, TABLAS Y RELACIONES NECESARIAS*/
/*Crear y usar base de datos*/
create database proxectodaw;
use proxectodaw;

/*Crear tabla cliente*/
create table cliente(
	dni VARCHAR(9) NOT NULL,
    nombre VARCHAR(45) not null,
    telefono varchar(9) not null,
    direccion varchar(70),
    email varchar(45),
    n_usuario varchar(45) not null,
    c_usuario varchar(45) not null
);
alter table cliente add constraint pk_cliente primary key (dni);

/*Crear tabla coche*/
create table coche(
	matricula varchar(7) not null,
    marca varchar(20) not null,
    modelo varchar(45),
    c_dni varchar(9) not null
);
alter table coche add constraint pk_coche primary key (matricula);
alter table coche add constraint fk_cliente_coche foreign key coche (c_dni) references cliente (dni);

/*Crear tabla servicio*/
create table servicio(
    nombre varchar(45) not null,
    precio double not null
);
alter table servicio add constraint pk_servicio primary key (nombre);

/*Crear tabla relación servicio-coche*/
create table s_aplica_c(
	c_matricula varchar(7) not null,
    c_dni varchar(9) not null,
    s_nombre varchar(45) not null,
    fecha_s timestamp not null default current_timestamp
);
alter table s_aplica_c add constraint pk_s_aplica_c primary key (c_matricula, c_dni, s_nombre);
alter table s_aplica_c add constraint fk_s_aplica_c_coche foreign key s_aplica_c (c_matricula) references coche (matricula);
alter table s_aplica_c add constraint fk_s_aplica_c_cliente foreign key s_aplica_c (c_dni) references cliente (dni);
alter table s_aplica_c add constraint fk_s_aplica_c_servicio foreign key s_aplica_c (s_nombre) references servicio (nombre);

/*Crear tabla empleado*/
create table empleado(
	dni varchar(9) not null,
    nombre varchar(45) not null,
    n_usuario varchar(45) not null,
    c_usuario varchar(45) not null
);
alter table empleado add constraint pk_empleado primary key (dni);

/*Crear tabla relación empleado-servicio*/
create table e_realiza_s(
	e_dni varchar(9) not null,
    s_nombre varchar(45) not null
);
alter table e_realiza_s add constraint pk_e_realiza_s primary key (e_dni, s_nombre);
alter table e_realiza_s add constraint fk_e_realiza_s_empleado foreign key e_realiza_s (e_dni) references empleado (dni);
alter table e_realiza_s add constraint fk_e_realiza_s_servicio foreign key e_realiza_s (s_nombre) references servicio (nombre);

/*Crear table especialización usuario admin*/
create table u_admin(
	e_dni varchar(9) not null
);
alter table u_admin add constraint pk_u_admin primary key (e_dni);
alter table u_admin add constraint fk_u_admin_empleado foreign key u_admin (e_dni) references empleado (dni);

/*Crear tabla especialización usuario trabajador*/
create table u_trabajador(
	e_dni varchar(9) not null
);
alter table u_trabajador add constraint pk_u_trabajador primary key (e_dni);
alter table u_trabajador add constraint fk_u_trabajador_empleado foreign key u_trabajador (e_dni) references empleado (dni);

/*Crear tabla especialización usuario cliente*/
create table u_cliente(
	c_dni varchar(9) not null
);
alter table u_cliente add constraint pk_u_cliente primary key (c_dni);
alter table u_cliente add constraint fk_u_cliente_cliente foreign key u_cliente (c_dni) references cliente (dni);

/*INSERCIÓN DE DATOS DE PRUEBA*/
/*Datos de prueba tabla cliente*/
insert into cliente (dni, nombre, telefono, direccion, email, n_usuario, c_usuario)
values ("56987415j", "Paco", "666555444", "Calle infinita, 86", "paco@mail.com", "pacouser", "abc123."),
("54789162o", "Virtudes", "666777111", "Calle para nada, 54", "virtudes@mail.com", "virtuser", "abc123.");

/*Datos de prueba tabla coche-FUNCIONA*/
insert into coche (matricula, marca, modelo, c_dni)
values ("5412ijh", "ford", "fiesta", "56987415j"),
("6587kkj", "volkswagen", "touran", "54789162o");

/*Datos de prueba tabla empleado*/
insert into empleado (dni, nombre, n_usuario, c_usuario)
values ("74125896u", "Jesús", "jesuser", "abc123."),
("96325874i", "Paca", "pacuser", "abc123.");

/*Datos de prueba tabla servicio*/
insert into servicio (nombre, precio)
values ("limpieza exterior", 20.00),
("limpieza interior", 30.00);

/*Datos de prueba tabla relación servicio-coche*/
insert into s_aplica_c (c_matricula, c_dni, s_nombre)
values ("5412ijh", "56987415j", "limpieza exterior"),
("6587kkj", "54789162o", "limpieza interior");

/*Datos de prueba tabla relación empleado-servicio*/
insert into e_realiza_s (e_dni, s_nombre)
values ("74125896u", "limpieza exterior"),
("96325874i", "limpieza interior");

/*Datos de prueba tabla usuario administrador*/
insert into u_admin (e_dni)
values ("74125896u");

/*Datos de prueba tabla usuario trabajador*/
insert into u_trabajador (e_dni)
values ("96325874i");

/*Datos de prueba tabla usuario cliente*/
insert into u_cliente (c_dni)
values ("56987415j"), ("54789162o");