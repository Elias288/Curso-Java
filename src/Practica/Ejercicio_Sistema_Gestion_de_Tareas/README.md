# Sistema de Gestión de Tareas

Una pequeña startup quiere un prototipo de aplicación en Java para gestionar tareas de un equipo. Cada tarea tiene un responsable, una prioridad y un estado. La aplicación debe permitir registrar tareas, filtrarlas, ordenarlas y procesarlas en paralelo.

1. Crear las clases:
    - `Usuario`: 
        - `id`
        - `nombre`
        - `email`.
    - `Tarea`: 
        - `id`
        - `titulo`
        - `descripción`
        - `prioridad` (enum: `BAJA`, `MEDIA`, `ALTA`)
        - `estado` (enum: `PENDIENTE`, `EN_PROGRESO`, `COMPLETADA`)
        - `responsable` (tipo: `Usuario`)
2. Crear clase `Gestor de Tareas` con una lista interna de `Tarea`
    - Métodoos a implementar:
        - `List<Tarea> buscarPorResponsable(Usuario u)`
        - `List<Tarea> filtrarPorPrioridad(Prioridad p)`
        - `List<Tarea> tareasCompletadasOrdenadasPorTitulo()`
        - `Map<Usuario, Long> contarTareasPorUsuario()`
3. Implementar `PrcesadorTareas` que implemente `Runnable`
    - Debe procesar (por ejemplo dormir 1 segundo) y luego marcar una tarea como `COMPLETADA`.
    - Lanzar varios hilos para procesar distintas tareas al mismo tiempo.
4. Final
    - Crear varios Usuarios y tareas de ejemplo
    - Usar los meétodos de filtrado y ordenamiento
    - Lanzar los hilos de `PrcesadorTareas` y verificar que las tareas queden completadas