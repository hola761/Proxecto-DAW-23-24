/*CREACIÓN DB, TABLAS Y RELACIONES NECESARIAS*/
/*Crear y usar base de datos*/
create database proxectodaw;
use proxectodaw;

/*Crear tabla rol*/
create table roles(
	id_rol int not null,
    rol varchar(15) not null
);
alter table roles add constraint pk_roles primary key (id_rol);
alter table roles modify column id_rol int not null AUTO_INCREMENT;

/*Crear tabla usuario*/
create table usuarios(
	id_usuario int not null,
	dni VARCHAR(9) NOT NULL,
    nombre VARCHAR(45) not null,
    telefono varchar(9) not null,
    direccion varchar(70),
    email varchar(45),
    n_usuario varchar(45) not null,
    c_usuario varchar(45) not null,
    id_rol int not null
);
alter table usuarios add constraint pk_usuarios primary key (id_usuario);
alter table usuarios add constraint fk_roles_usuarios foreign key usuarios (id_rol) references roles (id_rol);
alter table usuarios modify column id_usuario int not null AUTO_INCREMENT;

/*Crear tabla coche*/
create table coches(
	id_coche int not null,
	matricula varchar(7) not null,
    marca varchar(20) not null,
    modelo varchar(45),
    id_usuario int not null,
    id_rol int not null
);
alter table coches add constraint pk_coches primary key (id_coche);
alter table coches add constraint fk_usuarios_coches foreign key coches (id_usuario) references usuarios (id_usuario);
alter table coches add constraint fk_rol_coche foreign key coches (id_rol) references roles (id_rol);
alter table coches modify column id_coche int not null AUTO_INCREMENT;


/*Crear tabla servicio*/
create table servicios(
	id_servicio int not null,
    nombre varchar(45) not null,
    precio double not null
);
alter table servicios add constraint pk_servicios primary key (id_servicio);
alter table servicios modify column id_servicio int not null AUTO_INCREMENT;

/*Crear tabla relación servicio-coche*/
create table s_aplica_c(
	id_s_aplica_c int not null,
	id_coche int not null,
    id_usuario int not null,
    id_rol int not null,
    id_servicio int not null,
    fecha timestamp not null default current_timestamp
);
alter table s_aplica_c add constraint pk_s_aplica_c primary key (id_s_aplica_c);
alter table s_aplica_c add constraint fk_s_aplica_c_coches foreign key s_aplica_c (id_coche) references coches (id_coche);
alter table s_aplica_c add constraint fk_s_aplica_c_usuarios foreign key s_aplica_c (id_usuario) references usuarios (id_usuario);
alter table s_aplica_c add constraint fk_s_aplica_c_roles foreign key s_aplica_c (id_rol) references roles (id_rol);
alter table s_aplica_c add constraint fk_s_aplica_c_servicios foreign key s_aplica_c (id_servicio) references servicios (id_servicio);
alter table s_aplica_c modify column id_s_aplica_c int not null AUTO_INCREMENT;

/*Crear tabla relación usuario-servicio*/
create table u_realiza_s(
	id_u_realiza_s int not null,
	id_usuario int not null,
    id_rol int not null,
    id_servicio int not null
);
alter table u_realiza_s add constraint pk_u_realiza_s primary key (id_u_realiza_s);
alter table u_realiza_s add constraint fk_u_realiza_s_usuario foreign key u_realiza_s (id_usuario) references usuarios (id_usuario);
alter table u_realiza_s add constraint fk_u_realiza_s_rol foreign key u_realiza_s (id_rol) references roles (id_rol);
alter table u_realiza_s add constraint fk_u_realiza_s_servicio foreign key u_realiza_s (id_servicio) references servicios (id_servicio);
alter table u_realiza_s modify column id_u_realiza_s int not null AUTO_INCREMENT;

/*INSERCIÓN DE DATOS DE PRUEBA*/
/*Datos de prueba tabla rol*/
insert into roles (rol) values ("admin"), ("empleado"), ("cliente");

/*Datos de prueba tabla usuario*/
insert into usuarios (dni, nombre, telefono, direccion, email, n_usuario, c_usuario, id_rol)
values ("56987415j", "Paco", "666555444", "Calle infinita, 86", "paco@mail.com", "pacouser", "abc123.", 1),
("54789162o", "Virtudes", "666777111", "", "", "virtuser", "abc123.", 2),
("87412356h", "Eustaquio", "658923147", "Calle falsa, 123", "eustaquio@mail.com", "eustuser", "abc123.", 3),
("54123698b", "Muriel", "654789321", "", "", "murieluser", "abc123.", 3);

/*Datos de prueba tabla coche*/
insert into coches (matricula, marca, modelo, id_usuario, id_rol)
values ("5412ijh", "ford", "fiesta", 3, 3),
("6587kkj", "volkswagen", "touran", 4, 3);

/*Datos de prueba tabla servicio*/
insert into servicios (nombre, precio)
values ("limpieza exterior", 20.00), ("limpieza interior", 30.00);

/*Datos de prueba tabla relación servicio-coche*/
insert into s_aplica_c (id_s_aplica_c, id_coche, id_usuario, id_rol, id_servicio)
values (1, 1, 3, 3, 1), (2, 2, 4, 3, 2);

/*Datos de prueba tabla relación usuario-servicio*/
insert into u_realiza_s (id_u_realiza_s, id_usuario, id_rol, id_servicio)
values (1, 1, 1, 1), (2, 2, 2, 2);