# Script para Crear la Base de Datos 'Tienda'

Este script de Python crea una base de datos llamada 'Tienda' utilizando SQLite3 y carga datos de ejemplo en las tablas de usuarios, productos y pedidos.

## Requisitos

- Python 3.x
- SQLite3 (la mayoría de las distribuciones de Python ya incluyen SQLite3)

## Instrucciones de Uso

1. Clona este repositorio o descarga el archivo `create_database.py`.
2. Abre una terminal y navega hasta la ubicación del archivo `create_database.py`.
3. Ejecuta el script utilizando el siguiente comando:

   ```bash
   python create_database.py
   ```

4. El script creará la base de datos 'tienda.db' en el mismo directorio y cargará los datos de ejemplo en las tablas.

## Estructura de la Base de Datos

La base de datos 'Tienda' consta de las siguientes tablas:

- **usuarios**: Almacena información sobre los usuarios de la tienda.
- **productos**: Almacena información sobre los productos disponibles en la tienda.
- **pedidos**: Almacena información sobre los pedidos realizados por los usuarios.

## Datos de Ejemplo

El script carga los siguientes datos de ejemplo en la base de datos:

- Datos de ejemplo para usuarios, incluyendo nombre, correo electrónico, dirección y fecha de nacimiento.
- Datos de ejemplo para productos, incluyendo nombre, descripción y precio.
- Datos de ejemplo para pedidos, incluyendo el ID del usuario, el ID del producto, la cantidad y la fecha del pedido.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún problema o tienes alguna sugerencia de mejora, por favor abre un issue o envía un pull request.
