USE bd_ike;

INSERT INTO Usuario (nombre, telefono, correo_electronico, direccion, tipo_de_asistencia, clave) 
VALUES ('Juan Pérez', '123456789', 'juan@example.com', 'Calle 123', 'Asistencia Técnica', 'clave123');

INSERT INTO Usuario (nombre, telefono, correo_electronico, direccion, tipo_de_asistencia, clave) 
VALUES ('María López', '987654321', 'maria@example.com', 'Avenida 456', 'Asistencia General', 'clave456');

INSERT INTO Usuario (nombre, telefono, correo_electronico, direccion, tipo_de_asistencia, clave) 
VALUES ('Pedro García', '555555555', 'pedro@example.com', 'Plaza Principal', 'Asistencia Técnica', 'clave789');


SELECT * FROM Usuario;
