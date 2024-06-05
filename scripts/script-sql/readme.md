# Script SQL para MySQL Workbench

```sql
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
('Carlos Sanchez', 'carlos.sanchez@example.com', '789 Boulevard Central', '1975-03-03');

-- Insertar datos de ejemplo en productos
INSERT INTO productos (nombre, descripcion, precio) VALUES
('Producto A', 'Descripción del Producto A', 19.99),
('Producto B', 'Descripción del Producto B', 29.99),
('Producto C', 'Descripción del Producto C', 39.99);

-- Insertar datos de ejemplo en pedidos
INSERT INTO pedidos (usuario_id, producto_id, cantidad, fecha_pedido) VALUES
(1, 1, 2, '2023-01-01'),
(2, 2, 1, '2023-02-02'),
(3, 3, 5, '2023-03-03');
```

### Explicación del Script

1. **Crear la Base de Datos**:

   ```sql
   CREATE DATABASE IF NOT EXISTS Tienda;
   USE Tienda;
   ```

   Esto crea la base de datos `Tienda` si no existe y la selecciona para su uso.

2. **Crear la Tabla `usuarios`**:

   ```sql
   CREATE TABLE IF NOT EXISTS usuarios (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nombre VARCHAR(100) NOT NULL,
       correo VARCHAR(100) NOT NULL,
       direccion VARCHAR(255),
       fecha_nacimiento DATE
   );
   ```

   Esta tabla almacena información sobre los usuarios, incluyendo un identificador único (`id`), nombre, correo, dirección y fecha de nacimiento.

3. **Crear la Tabla `productos`**:

   ```sql
   CREATE TABLE IF NOT EXISTS productos (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nombre VARCHAR(100) NOT NULL,
       descripcion TEXT,
       precio DECIMAL(10, 2) NOT NULL
   );
   ```

   Esta tabla almacena información sobre los productos, incluyendo un identificador único (`id`), nombre, descripción y precio.

4. **Crear la Tabla `pedidos`**:

   ```sql
   CREATE TABLE IF NOT EXISTS pedidos (
       id INT AUTO_INCREMENT PRIMARY KEY,
       usuario_id INT NOT NULL,
       producto_id INT NOT NULL,
       cantidad INT NOT NULL,
       fecha_pedido DATE NOT NULL,
       FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE,
       FOREIGN KEY (producto_id) REFERENCES productos(id) ON DELETE CASCADE
   );
   ```

   Esta tabla almacena información sobre los pedidos, incluyendo un identificador único (`id`), identificadores de usuario y producto (`usuario_id` y `producto_id`), cantidad y fecha del pedido. También establece claves foráneas para referenciar a las tablas `usuarios` y `productos`.

5. **Insertar Datos de Ejemplo**:
   - Insertar datos en `usuarios`:
     ```sql
     INSERT INTO usuarios (nombre, correo, direccion, fecha_nacimiento) VALUES
     ('Juan Perez', 'juan.perez@example.com', '123 Calle Falsa', '1980-01-01'),
     ('Maria Lopez', 'maria.lopez@example.com', '456 Avenida Siempreviva', '1990-02-02'),
     ('Carlos Sanchez', 'carlos.sanchez@example.com', '789 Boulevard Central', '1975-03-03');
     ```
   - Insertar datos en `productos`:
     ```sql
     INSERT INTO productos (nombre, descripcion, precio) VALUES
     ('Producto A', 'Descripción del Producto A', 19.99),
     ('Producto B', 'Descripción del Producto B', 29.99),
     ('Producto C', 'Descripción del Producto C', 39.99);
     ```
   - Insertar datos en `pedidos`:
     ```sql
     INSERT INTO pedidos (usuario_id, producto_id, cantidad, fecha_pedido) VALUES
     (1, 1, 2, '2023-01-01'),
     (2, 2, 1, '2023-02-02'),
     (3, 3, 5, '2023-03-03');
     ```

### Ejecución en MySQL Workbench

1. Abre MySQL Workbench y conéctate a tu servidor de MySQL.
2. Crea una nueva pestaña de consulta (`Query Tab`) (`File -> New Query Tab`).
3. Copia y pega el script SQL proporcionado en la nueva pestaña de consulta.
4. Ejecuta el script completo (`Query -> Execute (All or Selection)`). Esto creará la base de datos, las tablas y llenará las tablas con los datos de ejemplo.
