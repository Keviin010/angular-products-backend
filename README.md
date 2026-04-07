# angular-products-backend

REST API con Spring Boot y MySQL para gestion de productos.

> Frontend disponible en [angular-products-app](https://github.com/Keviin010/angular-products-app).

## Tecnologias

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-6DB33F?style=flat&logo=springboot)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=flat&logo=java)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=flat&logo=mysql)

## Endpoints

| Metodo | Ruta | Descripcion |
|--------|------|-------------|
| GET | /api/products | Listar productos |
| GET | /api/products/{id} | Obtener producto |
| POST | /api/products | Crear producto |
| PUT | /api/products/{id} | Actualizar producto |
| DELETE | /api/products/{id} | Eliminar producto |

## Estructura
```
src/main/java/com/kevinroyo/products_backend/
├── controller/
├── model/
├── repository/
└── service/
```

## Configuracion

Crea la base de datos en MySQL y configura `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/productos_db
spring.datasource.username=root
spring.datasource.password=tu_password
```

## Correr el proyecto
```bash
./mvnw spring-boot:run
```
## Autor
Kevin Royo.
