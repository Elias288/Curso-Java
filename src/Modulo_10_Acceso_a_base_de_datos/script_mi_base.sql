DROP TABLE IF EXISTS Jefe;
DROP TABLE IF EXISTS EquipoDeTrabajo;
DROP TABLE IF EXISTS Empleado;

CREATE TABLE Jefe (
	id INTEGER NOT NULl PRIMARY KEY,
  	id_empleado INTEGER
);

CREATE TABLE IF NOT EXISTS EquipoDeTrabajo (
	id INTEGER NOT NULL PRIMARY KEY,
  	nombre VARCHAR(100),
  	id_jefe INTEGER,
  	FOREIGN KEY (id_jefe) REFERENCES Jefe(id)
);

CREATE TABLE IF NOT EXISTS Empleado (
	id INTEGER NOT NULL PRIMARY KEY,
  	nombre VARCHAR(100),
  	apellido VARCHAR(100),
  	telefono VARCHAR(20),
  	id_equipo INTEGER,
  	FOREIGN KEY (id_equipo) REFERENCES EquipoDeTrabajo(id)
);

INSERT INTO Jefe (id, id_empleado) VALUES
(1766, 2969),
(3188, 1478),
(1912, 2819);

INSERT INTO EquipoDeTrabajo (id, nombre, id_jefe) VALUES
(2202, 'equipo1', 1766),
(2323, 'equipo2', 3188),
(3516, 'equipo3', 1912);

INSERT INTO Empleado (id, nombre, apellido, telefono, id_equipo) VALUES
(3001, 'Juan', 'Pérez', '099123456', 2202),
(2961, 'María', 'González', '094876543', 2202),
(3649, 'Pedro', 'Rodríguez', '092334455', 2202),
(2148, 'Laura', 'Fernández', '098223344', 2202),
(1858, 'Sofía', 'López', '091778899', 2202),
(2969, 'Franco', 'Silva', '097556677', 2202),

(2000, 'Martín', 'Castro', '097445566', 2323),
(4881, 'Valentina', 'Suárez', '095667788', 2323),
(3099, 'Nicolás', 'Pereira', '099332211', 2323),
(4074, 'Andrés', 'Varela', '098112233', 2323),
(1478, 'Julieta', 'Romero', '095889900', 2323),

(3539, 'Diego', 'Martínez', '093556677', 3516),
(1152, 'Lucía', 'Morales', '091223344', 3516),
(3489, 'Camila', 'Cabrera', '094998877', 3516),
(2819, 'Tomás', 'Domínguez', '092778899', 3516);
