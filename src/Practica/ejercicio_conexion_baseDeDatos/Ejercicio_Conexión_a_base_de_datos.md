# Ejercicio Conexión a base de datos

## Descripción del problema

Se desea desarrollar una aplicación de consola en Java que permita a un usuario iniciar sesión ingresando su nombre de usuario y contraseña.
El sistema deberá verificar las credenciales contra una base de datos, y mostrar un mensaje indicando si el inicio de sesión fue exitoso o no.

Además, el sistema deberá permitir crear nuevos usuarios (registro) y almacenarlos en la base de datos.

## Estructura

El proyecto deberá tener al menos las siguientes clases:

- **Conexión**: Encargada de establecer la conexión con la base de datos.
- **UsuarioDAO**: Contendrá los métodos para registrar y validar usuarios.
- **Usuario**: Represetna un objeto usuario

## Requerimientos funcionales

### A. Base de datos

1. Crear una base de datos `sistema_login`.

2. Crear dentro de ella una tabla usuarios con los campos:

- `id`: (entero, autoincremental, clave primaria)
- `nombre` (texto, único, no nulo)
- `password`: (texto, no nulo)
- `rol`: (texto, por defecto `usuario`)

3. Inserta al menos un usuario administrador.

### B. Funcionalidades mínimas del programa

El sistema debe mostrar un menú con las siguientes opciones:

```sh
=== Sistema de Login ===
1. Iniciar sesión
2. Registrar nuevo usuario
0. Salir
Seleccionar opcion:
```

1. Iniciar Sesión.
- Solicitar nombre de usuario y contraseña.
- Verificar si existe en la base de datos.
- Si la credenciales son válidas, mostrar un mensaje de bienvenida indicando el rol del usuario.
- Si no, mostrar un mensaje de error.

2. Registrar nuevo usuario
- Solicitar nombre de usuario y contraseña
- Verificar si existe en la base de datos.
- Insertar el nuevo registro en la base de datos.
- Confirmar que el usuario fue creado correctamente.