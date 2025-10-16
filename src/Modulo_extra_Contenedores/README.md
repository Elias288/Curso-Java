# Módulo extra - Contenedores

![alt text](<Módulo extra - contenedores.png>)

```sh
# Importar imagen
docker pull mariadb:noble

# Crear y configurar contenedor
docker run -d \
  --name mariadb \
  -e MARIADB_ROOT_PASSWORD=clave_root \
  -e MARIADB_DATABASE=mi_base \
  -e MARIADB_USER=usuario \
  -e MARIADB_PASSWORD=clave_usuario \
  -p 3306:3306 \
  mariadb:latest

# Ver estado del contenedor
docker ps

# Entrar al contenedor
docker exec -it mariadb -u root -p
```