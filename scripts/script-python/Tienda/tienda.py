import sqlite3

# Conectar a la base de datos (si no existe, se creará automáticamente)
conn = sqlite3.connect('tienda.db')

# Crear un cursor para ejecutar comandos SQL
cursor = conn.cursor()

# Crear la tabla de usuarios
cursor.execute('''CREATE TABLE IF NOT EXISTS usuarios (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nombre VARCHAR(100) NOT NULL,
                    correo VARCHAR(100) NOT NULL,
                    direccion VARCHAR(255),
                    fecha_nacimiento DATE
                )''')

# Crear la tabla de productos
cursor.execute('''CREATE TABLE IF NOT EXISTS productos (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nombre VARCHAR(100) NOT NULL,
                    descripcion TEXT,
                    precio DECIMAL(10, 2) NOT NULL
                )''')

# Crear la tabla de pedidos
cursor.execute('''CREATE TABLE IF NOT EXISTS pedidos (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    usuario_id INT NOT NULL,
                    producto_id INT NOT NULL,
                    cantidad INT NOT NULL,
                    fecha_pedido DATE NOT NULL,
                    FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE,
                    FOREIGN KEY (producto_id) REFERENCES productos(id) ON DELETE CASCADE
                )''')

# Insertar datos de ejemplo en usuarios
usuarios_data = [
    ('Juan Perez', 'juan.perez@example.com', '123 Calle Falsa', '1980-01-01'),
    ('Maria Lopez', 'maria.lopez@example.com',
     '456 Avenida Siempreviva', '1990-02-02'),
    ('Carlos Sanchez', 'carlos.sanchez@example.com',
     '789 Boulevard Central', '1975-03-03'),
    # Agrega aquí los demás datos de ejemplo
]

cursor.executemany(
    '''INSERT INTO usuarios (nombre, correo, direccion, fecha_nacimiento) VALUES (?, ?, ?, ?)''', usuarios_data)

# Insertar datos de ejemplo en productos
productos_data = [
    ('Producto A', 'Descripción del Producto A', 19.99),
    ('Producto B', 'Descripción del Producto B', 29.99),
    ('Producto C', 'Descripción del Producto C', 39.99),
    # Agrega aquí los demás datos de ejemplo
]

cursor.executemany(
    '''INSERT INTO productos (nombre, descripcion, precio) VALUES (?, ?, ?)''', productos_data)

# Insertar datos de ejemplo en pedidos
pedidos_data = [
    (1, 1, 2, '2023-01-01'),
    (2, 2, 1, '2023-02-02'),
    (3, 3, 5, '2023-03-03'),
    # Agrega aquí los demás datos de ejemplo
]

cursor.executemany(
    '''INSERT INTO pedidos (usuario_id, producto_id, cantidad, fecha_pedido) VALUES (?, ?, ?, ?)''', pedidos_data)

# Guardar los cambios
conn.commit()

# Cerrar la conexión
conn.close()

print("Base de datos 'Tienda' creada con éxito.")
