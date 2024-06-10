# Empresa

````markdown
# Base de Datos Empresa

Este proyecto crea una base de datos SQLite llamada `empresa.db` que contiene tres tablas: `Departamentos`, `Empleados` y `Proyectos`. También inserta registros de ejemplo en cada una de las tablas.

## Tabla de Contenidos

- [Descripción](#descripción)
- [Estructura de la Base de Datos](#estructura-de-la-base-de-datos)
- [Requisitos](#requisitos)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)

## Descripción

El script en Python `crear_base_de_datos.py` crea una base de datos SQLite con tres tablas: `Departamentos`, `Empleados` y `Proyectos`. Después de crear las tablas, el script inserta registros de ejemplo en cada tabla.

## Estructura de la Base de Datos

- **Departamentos**

  - `id`: INTEGER, PRIMARY KEY, AUTOINCREMENT
  - `nombre`: TEXT, NOT NULL
  - `ubicacion`: TEXT

- **Empleados**

  - `id`: INTEGER, PRIMARY KEY, AUTOINCREMENT
  - `nombre`: TEXT, NOT NULL
  - `apellido`: TEXT, NOT NULL
  - `email`: TEXT, NOT NULL
  - `departamento_id`: INTEGER, FOREIGN KEY (REFERENCES Departamentos(id))

- **Proyectos**
  - `id`: INTEGER, PRIMARY KEY, AUTOINCREMENT
  - `nombre`: TEXT, NOT NULL
  - `descripcion`: TEXT
  - `departamento_id`: INTEGER, FOREIGN KEY (REFERENCES Departamentos(id))

## Requisitos

- Python 3.x
- SQLite3 (generalmente incluido con Python)

## Uso

1. Clona el repositorio o descarga el script `crear_base_de_datos.py`.
2. Ejecuta el script desde la línea de comandos:

   ```sh
   python crear_base_de_datos.py
   ```
````

3. La base de datos `empresa.db` se creará en el mismo directorio donde se encuentra el script.

## Estructura del Proyecto

El proyecto contiene el siguiente archivo:

- `crear_base_de_datos.py`: Script en Python que crea la base de datos, las tablas y añade registros de ejemplo.

```python
import sqlite3

def crear_base_de_datos():
    # Conectar a la base de datos (se crea automáticamente si no existe)
    conn = sqlite3.connect('empresa.db')
    cursor = conn.cursor()

    # Crear tabla Departamentos
    cursor.execute('''CREATE TABLE IF NOT EXISTS Departamentos (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        nombre TEXT NOT NULL,
                        ubicacion TEXT)''')

    # Crear tabla Empleados
    cursor.execute('''CREATE TABLE IF NOT EXISTS Empleados (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        nombre TEXT NOT NULL,
                        apellido TEXT NOT NULL,
                        email TEXT NOT NULL,
                        departamento_id INTEGER,
                        FOREIGN KEY (departamento_id) REFERENCES Departamentos(id))''')

    # Crear tabla Proyectos
    cursor.execute('''CREATE TABLE IF NOT EXISTS Proyectos (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        nombre TEXT NOT NULL,
                        descripcion TEXT,
                        departamento_id INTEGER,
                        FOREIGN KEY (departamento_id) REFERENCES Departamentos(id))''')

    # Insertar registros en la tabla Departamentos
    departamentos = [
        ('Recursos Humanos', 'Edificio A'),
        ('Desarrollo', 'Edificio B'),
        ('Marketing', 'Edificio C'),
        ('Finanzas', 'Edificio D')
    ]
    cursor.executemany('INSERT INTO Departamentos (nombre, ubicacion) VALUES (?, ?)', departamentos)

    # Insertar registros en la tabla Empleados
    empleados = [
        ('Juan', 'Perez', 'juan.perez@empresa.com', 1),
        ('Maria', 'Lopez', 'maria.lopez@empresa.com', 2),
        ('Carlos', 'Garcia', 'carlos.garcia@empresa.com', 2),
        ('Laura', 'Martinez', 'laura.martinez@empresa.com', 3),
        ('Jose', 'Rodriguez', 'jose.rodriguez@empresa.com', 4),
        ('Ana', 'Gomez', 'ana.gomez@empresa.com', 1),
        ('Luis', 'Hernandez', 'luis.hernandez@empresa.com', 2),
        ('Marta', 'Fernandez', 'marta.fernandez@empresa.com', 3),
        ('Pedro', 'Sanchez', 'pedro.sanchez@empresa.com', 4),
        ('Elena', 'Diaz', 'elena.diaz@empresa.com', 1),
        ('Miguel', 'Torres', 'miguel.torres@empresa.com', 2),
        ('Sara', 'Ramirez', 'sara.ramirez@empresa.com', 3),
        ('David', 'Flores', 'david.flores@empresa.com', 4),
        ('Sofia', 'Cruz', 'sofia.cruz@empresa.com', 1),
        ('Diego', 'Morales', 'diego.morales@empresa.com', 2),
        ('Patricia', 'Ortiz', 'patricia.ortiz@empresa.com', 3),
        ('Javier', 'Gutierrez', 'javier.gutierrez@empresa.com', 4),
        ('Paula', 'Ruiz', 'paula.ruiz@empresa.com', 1),
        ('Alberto', 'Jimenez', 'alberto.jimenez@empresa.com', 2),
        ('Teresa', 'Navarro', 'teresa.navarro@empresa.com', 3)
    ]
    cursor.executemany('INSERT INTO Empleados (nombre, apellido, email, departamento_id) VALUES (?, ?, ?, ?)', empleados)

    # Insertar registros en la tabla Proyectos
    proyectos = [
        ('Proyecto Alfa', 'Desarrollo de la nueva plataforma web', 2),
        ('Proyecto Beta', 'Campaña de marketing para el lanzamiento del nuevo producto', 3),
        ('Proyecto Gamma', 'Optimización del proceso de reclutamiento', 1),
        ('Proyecto Delta', 'Auditoría interna de finanzas', 4),
        ('Proyecto Epsilon', 'Implementación de nuevas políticas de recursos humanos', 1),
        ('Proyecto Zeta', 'Desarrollo de la app móvil', 2),
        ('Proyecto Eta', 'Rebranding de la empresa', 3),
        ('Proyecto Theta', 'Análisis de riesgos financieros', 4),
        ('Proyecto Iota', 'Mejora del portal del empleado', 1),
        ('Proyecto Kappa', 'Investigación de mercado para nuevos productos', 3),
        ('Proyecto Lambda', 'Automatización de reportes financieros', 4),
        ('Proyecto Mu', 'Integración de sistemas de desarrollo', 2),
        ('Proyecto Nu', 'Estrategia de publicidad en redes sociales', 3),
        ('Proyecto Xi', 'Capacitación y desarrollo de empleados', 1),
        ('Proyecto Omicron', 'Rediseño de la página de inicio', 2),
        ('Proyecto Pi', 'Plan de sucesión empresarial', 4),
        ('Proyecto Rho', 'Programa de bienestar para empleados', 1),
        ('Proyecto Sigma', 'Optimización de bases de datos', 2),
        ('Proyecto Tau', 'Estrategia de contenidos para el blog', 3),
        ('Proyecto Upsilon', 'Evaluación de desempeño', 4)
    ]
    cursor.executemany('INSERT INTO Proyectos (nombre, descripcion, departamento_id) VALUES (?, ?, ?)', proyectos)

    # Guardar (commit) los cambios
    conn.commit()

    # Cerrar la conexión
    conn.close()

if __name__ == "__main__":
    crear_base_de_datos()
    print("Base de datos creada y registros insertados correctamente.")
```

Este archivo `README.md` proporciona una guía detallada sobre cómo usar el script `crear_base_de_datos.py` para crear la base de datos `empresa.db` y agregar los registros iniciales.
