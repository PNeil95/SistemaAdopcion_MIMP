DROP DATABASE IF EXISTS proyecto_lp2;

CREATE DATABASE proyecto_lp2;

USE proyecto_lp2;

CREATE TABLE TipoInforme(
	IdTipoInforme INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Descripcion VARCHAR(45)
);
insert into tipoinforme value(default,'Ficha'); 
CREATE TABLE Cargo(
	IdCargo INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Descripcion VARCHAR(45)
);

CREATE TABLE Usuario(
	IdUsuario INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Usuario VARCHAR(45),
    Contrasena VARCHAR(45),
    Nombre VARCHAR(45),
    IdCargo INT,
    FOREIGN KEY (IdCargo) REFERENCES Cargo(IdCargo)
);
select*from reporteinformacion;


CREATE TABLE ReporteInformacion(
	IdReporteInformacion INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
    NombreResponsable VARCHAR(45),
    FechaReporte DATE,
    FechaUltimaActualizacion DATE,
    Contacto VARCHAR(45),
    NumInternacional VARCHAR(20),
    NumLocal VARCHAR(15),
    DirInternacional VARCHAR(200),
    IdTipoInforme INT,
    IdUsuario INT,
    estado varchar(15) default 'Registrado',
    FOREIGN KEY (IdTipoInforme) REFERENCES TipoInforme(IdTipoInforme),
    FOREIGN KEY (IdUsuario) REFERENCES Usuario(IdUsuario)
);
select*from usuario;

INSERT INTO CARGO VALUES 
(default, 'Secretario'), 
(default, 'Tecnico Administrativo'), 
(default, 'Director General');
SELECT * FROM CARGO;

INSERT INTO Usuario VALUES (default, 'pvalladares@cibertec.edu.pe', 'admin1234', 'Paolo Valladares', 1), (default, 'eortega@cibertec.edu.pe', 'admin1234', 'Estunder Ortega', 2), (default, 'rvelasquez@cibertec.edu.pe', 'admin1234', 'Roger Velasquez', 3);
SELECT * FROM Usuario;

INSERT INTO TipoInforme VALUES (default,'Informe Inicial de renovación'), (default,'Informe de aprobación'),(default,'Informe de Negación'),(default,'Informe Final de renovación'),(default,'Informe de Auditoría'),(default,'Informe de investigación'),(default,'Informe de actividades');
SELECT*FROM TipoInforme;



INSERT INTO ReporteInformacion VALUES (default,'Sonrisas SAC','2019-01-01','2019-05-01','Edwar Roosvelt','930270203','2391598','Av. 28 Julio 240','1','1',default);
INSERT INTO ReporteInformacion VALUES (default,'Hogar Forever','2020-01-11','2020-08-22','Fer Tesla','910220203','2381564','Av. Sucre 271','5','3',default);
INSERT INTO ReporteInformacion VALUES (default,'Desterllos SI','2020-01-10','2021-05-21','Ed Stuart','998984412','2371448','Jr. Ugarte 209','2','3',default);
INSERT INTO ReporteInformacion VALUES (default,'SLP House','2021-10-09','2021-07-21','Jose Tello','969636215','2921598','Calle Alpamayo 280','3','3',default);
INSERT INTO ReporteInformacion VALUES (default,'Wonderfoul TI','2019-11-11','2020-05-01','Moises Silva','987411230','2321516','Av. San Martin 298','4','2',default);
INSERT INTO ReporteInformacion VALUES (default,'BT Adopcion','2018-01-20','2019-05-05','Brenda Canales','901020368','2331618','Av. Independencia 277','7','2',default);
INSERT INTO ReporteInformacion VALUES (default,'Medallas Hogar','2017-01-01','2020-06-11','Adriana Soriano','99998987','2331717','Av. Tupac Amaru 221','6','3',default);
INSERT INTO ReporteInformacion VALUES (default,'Tour House','2019-02-01','2021-05-01','Xiomy Tze','987788978','2323118','Urb.Los Cipreces 193','2','3',default);
INSERT INTO ReporteInformacion VALUES (default,'Home Smile','2019-03-02','2020-06-03','Stephany Bazalar','910002630','2323120','Av.Benavides 111','1','1',default);
INSERT INTO ReporteInformacion VALUES (default,'Smiles Forever','2020-03-05','2020-05-03','Neil Carrillo','998899451','2310220','Av.Jesus Maria 789','4','2',default);
INSERT INTO ReporteInformacion VALUES (default,'Grupo LATAM House','2020-05-01','2021-05-16','Manuel Quispe','978798623','2310111','Av.Los Olivos 198','4','2',default);
INSERT INTO ReporteInformacion VALUES (default,'American Adoption','2020-06-05','2021-06-06','Edgar Chinga','932323361','2402058','Av. San Juan de Miraflores 293','1','1','Pre-aprobado');
INSERT INTO ReporteInformacion VALUES (default,'African Adoption','2019-01-01','2021-05-01','Maria Souza','984814652','2412269','Av. 8 de Octubre 288','3','3',default);
INSERT INTO ReporteInformacion VALUES (default,'European Adoption','2019-07-13','2020-07-01','Mario Bros','987878741','2390199','Av. Miraflores 350','5','3',default);
INSERT INTO ReporteInformacion VALUES (default,'BlackHouse Adoption','2019-01-10','2021-05-10','Luigi Alcantara','933635698','2512036','Jr. Bellavista 199','6','3',default);





