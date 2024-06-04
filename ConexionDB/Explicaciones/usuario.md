# Paso 1: Configurar VS Code para Programar en Java

1. **Instalar la extensión de Java**: Abre VS Code y ve a la sección de Extensiones (icono de cuadrito en la barra lateral izquierda). Busca "Java Extension Pack" y haz clic en `Install`.

2. **Instalar Maven**: Si no tienes Maven instalado, puedes descargarlo desde [Maven Downloads](https://maven.apache.org/download.cgi). Sigue las instrucciones para tu sistema operativo.

## Paso 2: Crear un Nuevo Proyecto Maven en VS Code

1. **Crear Proyecto Maven**:

   - Abre la Terminal en VS Code (Ctrl + `).
   - Ejecuta el siguiente comando para crear un nuevo proyecto Maven:
     ```sh
     mvn archetype:generate -DgroupId=com.example -DartifactId=MiProyecto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
     ```
   - Esto creará una estructura de proyecto básica con un archivo `pom.xml` para gestionar las dependencias.

2. **Abrir el Proyecto**:
   - Abre la carpeta del proyecto creado en VS Code (`File` -> `Open Folder`).

### Paso 3: Configurar `pom.xml` para Incluir la Dependencia SQLite

1. **Editar `pom.xml`**:
   - Abre el archivo `pom.xml` y añade la dependencia `sqlite-jdbc`:
     ```xml
     <dependencies>
         <dependency>
             <groupId>org.xerial</groupId>
             <artifactId>sqlite-jdbc</artifactId>
             <version>3.36.0.3</version>
         </dependency>
     </dependencies>
     ```

### Paso 4: Escribir el Código Java en VS Code

1. **Crear la Estructura del Código**:

   - Navega a `src/main/java/com/example` y abre o crea el archivo `Main.java`.
   - Copia y pega el código del ejemplo proporcionado anteriormente en `Main.java`.

2. **Ejecutar el Código**:
   - Abre la Terminal en VS Code (Ctrl + `).
   - Ejecuta los siguientes comandos para compilar y ejecutar el proyecto:
     ```sh
     mvn compile
     mvn exec:java -Dexec.mainClass="com.example.Main"
     ```

### Ejemplo de Estructura de Proyecto

La estructura del proyecto debería verse así:

```
MiProyecto/
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── example
                    └── Main.java
```

### Contenido Completo del `pom.xml`

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>MiProyecto</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>org.xerial</groupId>
            <artifactId>sqlite-jdbc</artifactId>
            <version>3.36.0.3</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>exec-maven-plugin</artifactId>
                <version>1.6.0</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>java</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <mainClass>com.example.Main</mainClass>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

### Resumen

1. **Configura VS Code** con las extensiones necesarias para programar en Java.
2. **Crea un nuevo proyecto Maven**.
3. **Añade la dependencia SQLite** en el archivo `pom.xml`.
4. **Escribe tu código** en `Main.java`.
5. **Compila y ejecuta** tu proyecto utilizando Maven.

Siguiendo estos pasos, podrás descargar e instalar la dependencia `sqlite-jdbc` y trabajar con tu base de datos SQLite desde un proyecto Java en VS Code.
