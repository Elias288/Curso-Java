# Ejercicio final - Biblioteca

## Letra

Una Biblioteca quiere digitalizar su gestión de libros y préstamos. Para ello necesita un programa que permita:

1. Registrar libros disponibles, evitando duplicados (cada libro tiene: titulo, autor, ISBN(identificador único))
2. Registrar usuarios por nombre, sin repeticiones.
3. Llevar un control de préstamos con un `Map<String, List<Libro>>` (donde la clave es el nombre del usuario y el valor de la lista de libros prestados)
4. Recorrer y mostrar:
    - Todos los libros disponibles (usando `for-each`)
    - Todos los usuarios (usando `iterator`)
    - Todos los préstamos con libros asociados (usando `Map.Entry)

## Requisitos técnicos

- Crear una clase `Libro` con atributos y métodos mencionados.
- Usar `Set<Libro>` para los libros disponibles (usar `HashSet` o `TreeSet`)
- Usar `Set<String` para los usuarios.
- Usar `Map<String, List<Libro>>` para representar los préstamos.
- Usar Genéricos correctamente en todas las estructuras.
- Usar `Iterator` y `for-each` en recorridos.

## Operaciones mínimas

- Agregar libros nuevos (sin duplicados)
- Agregar usuarios nuevo (sin duplicados)
- Prestar libros a usuarios (verificar que el libro esté disponible)
- Mostrar:
    - Libros disponibles.
    - Usuarios registrados.
    - Préstamos actuales.