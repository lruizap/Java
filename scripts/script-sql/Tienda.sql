-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS Tienda;
USE Tienda;

-- Crear la tabla de usuarios
CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    fecha_nacimiento DATE
);

-- Crear la tabla de productos
CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL
);

-- Crear la tabla de pedidos
CREATE TABLE IF NOT EXISTS pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,
    producto_id INT NOT NULL,
    cantidad INT NOT NULL,
    fecha_pedido DATE NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE,
    FOREIGN KEY (producto_id) REFERENCES productos(id) ON DELETE CASCADE
);

-- Insertar datos de ejemplo en usuarios
INSERT INTO usuarios (nombre, correo, direccion, fecha_nacimiento) VALUES 
('Juan Perez', 'juan.perez@example.com', '123 Calle Falsa', '1980-01-01'),
('Maria Lopez', 'maria.lopez@example.com', '456 Avenida Siempreviva', '1990-02-02'),
('Carlos Sanchez', 'carlos.sanchez@example.com', '789 Boulevard Central', '1975-03-03'),
('Ana Rodriguez', 'ana.rodriguez@example.com', '1010 Calle Luna', '1985-04-04'),
('Pedro Martinez', 'pedro.martinez@example.com', '2020 Calle Sol', '1995-05-05'),
('Lucia Hernandez', 'lucia.hernandez@example.com', '3030 Calle Estrella', '1983-06-06'),
('Miguel Torres', 'miguel.torres@example.com', '4040 Calle Cometa', '1992-07-07'),
('Sofia Gomez', 'sofia.gomez@example.com', '5050 Calle Meteoro', '1988-08-08'),
('Javier Ramirez', 'javier.ramirez@example.com', '6060 Calle Planeta', '1979-09-09'),
('Laura Diaz', 'laura.diaz@example.com', '7070 Calle Galaxia', '1996-10-10'),
('Fernando Morales', 'fernando.morales@example.com', '8080 Calle Universo', '1981-11-11'),
('Sara Lopez', 'sara.lopez@example.com', '9090 Calle Constelación', '1986-12-12'),
('Pablo Gonzalez', 'pablo.gonzalez@example.com', '1111 Calle Nebulosa', '1977-01-13'),
('Elena Suarez', 'elena.suarez@example.com', '2222 Calle Cuásar', '1991-02-14'),
('Diego Ruiz', 'diego.ruiz@example.com', '3333 Calle Pulsar', '1984-03-15'),
('Clara Vega', 'clara.vega@example.com', '4444 Calle Asteroide', '1993-04-16'),
('Luis Soto', 'luis.soto@example.com', '5555 Calle Satélite', '1982-05-17'),
('Marta Flores', 'marta.flores@example.com', '6666 Calle Luna Nueva', '1989-06-18'),
('Roberto Aguilar', 'roberto.aguilar@example.com', '7777 Calle Eclipse', '1976-07-19'),
('Teresa Castillo', 'teresa.castillo@example.com', '8888 Calle Cometa Halley', '1994-08-20');

-- Insertar datos de ejemplo en productos
INSERT INTO productos (nombre, descripcion, precio) VALUES 
('Producto A', 'Descripción del Producto A', 19.99),
('Producto B', 'Descripción del Producto B', 29.99),
('Producto C', 'Descripción del Producto C', 39.99),
('Producto D', 'Descripción del Producto D', 49.99),
('Producto E', 'Descripción del Producto E', 59.99),
('Producto F', 'Descripción del Producto F', 69.99),
('Producto G', 'Descripción del Producto G', 79.99),
('Producto H', 'Descripción del Producto H', 89.99),
('Producto I', 'Descripción del Producto I', 99.99),
('Producto J', 'Descripción del Producto J', 109.99),
('Producto K', 'Descripción del Producto K', 119.99),
('Producto L', 'Descripción del Producto L', 129.99),
('Producto M', 'Descripción del Producto M', 139.99),
('Producto N', 'Descripción del Producto N', 149.99),
('Producto O', 'Descripción del Producto O', 159.99),
('Producto P', 'Descripción del Producto P', 169.99),
('Producto Q', 'Descripción del Producto Q', 179.99),
('Producto R', 'Descripción del Producto R', 189.99),
('Producto S', 'Descripción del Producto S', 199.99),
('Producto T', 'Descripción del Producto T', 209.99);

-- Insertar datos de ejemplo en pedidos
INSERT INTO pedidos (usuario_id, producto_id, cantidad, fecha_pedido) VALUES 
(1, 1, 2, '2023-01-01'),
(2, 2, 1, '2023-02-02'),
(3, 3, 5, '2023-03-03'),
(4, 4, 3, '2023-04-04'),
(5, 5, 4, '2023-05-05'),
(6, 6, 2, '2023-06-06'),
(7, 7, 1, '2023-07-07'),
(8, 8, 6, '2023-08-08'),
(9, 9, 3, '2023-09-09'),
(10, 10, 4, '2023-10-10'),
(11, 11, 2, '2023-11-11'),
(12, 12, 1, '2023-12-12'),
(13, 13, 5, '2023-01-13'),
(14, 14, 3, '2023-02-14'),
(15, 15, 4, '2023-03-15'),
(16, 16, 2, '2023-04-16'),
(17, 17, 1, '2023-05-17'),
(18, 18, 6, '2023-06-18'),
(19, 19, 3, '2023-07-19'),
(20, 20, 4, '2023-08-20');
