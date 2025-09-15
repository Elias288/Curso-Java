# Concurrencia y programación multihilo

![alt text](<Módulo 9 - Concurrencia y programación multihilo.png>)

## Ejemplos

- [Ejemplo extención Thread](./A_ejemplo_thread.java)
- [Ejemplo implementación Runnable](./B_ejemplo_Runnable.java)
- [Ejemplo concurrencia](./C_ejemplo_concurrencia_multihilo.java)
- [Ejemplo Sincronización y comunicación](./D_ejemplo_Sincronizacion_y_Comunicacion.java)
- [Ejemplo Sincronización con wait y notify](./E_ejemplo_semaforo.java)

## Tareas

### 1. Caja de Ahorros

Crear una clase `CuentaBancaria` con un saldo inicial, definir métodos `depositar(int monto)` y `retirar(int monto)`.
- Lanzar 2 hilos, uno que deposite y otro que retire varias veces.
- Modifica el código para asegurar que el saldo nunca sea negativo o inconsistente.

```java
CuentaBancaria banco = new CuentaBancaria():

Thread empleado = new Thread(() -> {
    try {
        for(int i = 1; i <= 5; i++){
            banco.retirar(i + 5);
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
});

Thread jefe = new Thread(() -> {
    try {
        for(int i = 1; i <= 5; i++){
            banco.depositar(i + 5);
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
});

empleado.start();
jefe.start();
```

### 2. Productor-Consumidor

Implementar una clase `Buffer` que contenga un `int valor` y un indicador si está disponible `boolean disponible`, esta clase debe contar con 2 métodos `producir(int valor)` y `consumir()`.

- El método **Productor** debe modificar el valor e indicar al `Buffer` que el valor está disponible. Si ya hay un valor que no haya sido consumido espera.
- El método **Consumidor** debe indicar al `Buffer` que el valor no está disponible. Si no hay un valor disponible espera.

> Simula producción y consumo con hilos

```java
Buffer buffer = new Buffer();

// Productor
Thread productor = new Thread(() -> {
    try {
        for (int i = 1; i <= 5; i++) {
            buffer.producir(i);
            Thread.sleep(500); // simula tiempo de producción
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
});

// Consumidor
Thread consumidor = new Thread(() -> {
    try {
        for (int i = 1; i <= 5; i++) {
            buffer.consumir();
            Thread.sleep(1000); // simula tiempo de consumo
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
});

productor.start();
consumidor.start();
```

### 3. Lista compartida

Crear una clase `ListaCompartida implements Runnable` que contenga un `ArrayList<Integer> lista`.

- Implementa métodos `agregar(int n)` y `mostrar()` con bloques sincronizados.
- Lanzar varios hilos:
    - Agregar números a la lista.
    - Mostrar la lista.
- Verificar que no se produzacan errores de concurrencia ni lecturas inconsistentes.