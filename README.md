# Paw2Go-backend
## Descripción

El proyecto de Paw2Go nace con fines didácticos para la creación de un e-commerce, mezclando diferentes tecnologías utilizadas en el bootcamp Generation Mexico GDL. El objetivo de este proyecto es realizar un proyecto de página web funcional desde el lado del cliente y el servidor.

- Un e-commerce amigable e intuitiva
- Sencilla de navegar entre sus paginas
- Conectado a una base de datos para nuestros diferentes servicios

![](https://github.com/santosmc93/Paw2Go/blob/main/capturas/icono%20paw2go.png?raw=true)

## Programas necesarios
### Editor de texto
En este caso se utilizó el editor de texto de Visual Studio Code

### IDE 
Para este proyecto se utilizó el lenguaje de Java para realizar la conexión de la base de datos con la parte del frontend, el código se escribió en el IDE [Intellij Idea](https://www.jetbrains.com/es-es/idea/ "Intellij Idea") donde trabajamos con un framework llamado [Spring boot](https://spring.io/projects/spring-boot "Spring boot")
 que nos permite realizar las peticiones al servidor en la pagina web.
 
 ### MySQL Workbench
 Nuestra base de datos fue creada en MySQL con el entorno de [MySQL Workbench](https://www.mysql.com/products/workbench/ "MySQL Workbench"), para generar las tablas necesarias para almacenar todo lo necesario de nuestra pagina web, como usuarios, administradores, articulos, citas etc. 
 
 ### POSTMAN
 Utilizamos el software de [POSTMAN](https://www.postman.com/ "POSTMAN") para poder hacer las peticiones a nuestro servidor local y poder ejecutar nuestros metodos HTTP como POST, PUT, DELETE & GET.
 
 ## Resumen del proyecto
 
 ### Java & Spring boot
 Para crear un nuevo proyecto de Spring boot es necesario crearlo en [Spring Initializr](https://start.spring.io/ "Spring Initializr")  Aqui debemos seleccionar el tipo de proyecto, en este caso, utilizamos “Gradle Project”, despues seleccionamos el lenguaje de programación “Java”, La versión de Spring boot, en este caso se utiliza la versión 2.5.6.
Después debemos agregar las dependencias, estas son 
- Spring web
- Spring Data JPA 
- H2 Database
- Spring Boot DevTools

Al terminar el paso anterior, solo es asignarle un nombre a nuestro paquete y el formato de Packaging, en este caso se utilizo “Jar” y en Java 11. 
El último paso es descargar el archivo para empezar a utilizarlo.

### Intellij Idea
Al abrir nuestro proyecto nuevo de Spring boot contaremos con bastantes carpetas creadas por Spring Initializr, aqui trabajaremos en la carpeta main
> src > main > java > nombreCarpeta > 

Aquí crearemos una carpeta para cada tabla que tengamos en nuestra base de datos. En este caso, empezamos con la carpeta para administradores “admin”. Aquí tenemos 2 clases y una interfaz, La clase “Admin” es nuestro modelo.

#### Modelo
```java
package com.paw2go.adminsusers.admin;
import javax.persistence.*;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_admin;
    @Column
    private String adminUsername;
    @Column
    private String admin_password;
    @Column
    private String admin_email;

    //Getter and Setters


    public Integer getId_admin() {
        return id_admin;
    }

    public void setId_admin(Integer id_admin) {
        this.id_admin = id_admin;
    }

    public String getAdmin_username() {
        return adminUsername;
    }

    public void setAdmin_username(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }
}
```

Con el comando @Entity aquí crearemos una carpeta para cada tabla que tengamos en nuestra base de datos. En este caso, empezamos con la carpeta para administradores “admin”. Aquí tenemos 2 clases y una interfaz, La clase “Admin” es nuestro modelo.

le estamos diciendo que esta clase se refiere a la tabla en nuestra base de datos, donde tenemos la clase Admin con sus respectivos atributos y métodos getter y setter. Para este caso la variable id_admin es nuestra llave primaria, por esa razón utilizamos 

#### Vista

En esta parte creamos la interfaz de "AdminRepository" que hereda de la clase "JpaRepository"

```java
package com.paw2go.adminsusers.admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByAdminUsername(String adminUsername);
}
```

#### Controlador
En la parte del controlador utilizamos el RestController para generar nuestros métodos GET, PUT, POST y DELETE, en el RequestMapping le decimos como se llamara nuestra pagina donde hará las peticiones en nuestro servidor local.
```java
package com.paw2go.adminsusers.admin;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin")
public class AdminRestController {

    private final AdminRepository adminRepository;

    public AdminRestController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    @CrossOrigin(origins = "*", methods = {RequestMethod.POST})
    @PostMapping("/newAdmin") //http://localhost:8080/admin/newAdmin
    public void add(@RequestBody Admin admin){
        adminRepository.save(admin);
    }
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping ("/display") //localhost:8080/admin/display
    public  List<Admin>display(){
        return adminRepository.findAll();
    }
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping( "/displayId/{adminusername}" ) //http://localhost:8080/admin/display/id
    public Admin selectiveDisplay(@PathVariable("adminusername") String adminUsername)
    {
        return adminRepository.findByAdminUsername(adminUsername);
    }
    @CrossOrigin(origins = "*", methods = {RequestMethod.DELETE})
    @DeleteMapping("/delete/{id}") //localhost:8080/admin/delete/id
    public void remove(@PathVariable("id") Integer id_admin){
        adminRepository.deleteById(id_admin);
    }
    @CrossOrigin(origins = "*", methods = {RequestMethod.PUT})
    @PutMapping ("/update") //localhost:8080/admin/update
    public void update(@RequestBody Admin admin) {
        adminRepository.save(admin);
    }
}
```

Este proceso es similar en las demas carpetas, es necesario un Modelo, Vista, Controlador. MVC

AdminUsersApplication es nuestra clase principal donde se va a correr nuestro proyecto Spring Boot.

```java
package com.paw2go.adminsusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AdminsUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminsUsersApplication.class, args);}


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*")
                        .allowedOrigins("")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .maxAge(3600);
            }
        };
    }
}
```

## MySQL Workbench

Por la parte de la base de datos, utilizamos el entorno de MySQL Workbench, donde aqui generamos las tablas necesarias para nuestro proyecto, a continuación se encuentra un pequeño Script donde se crean las tablas 

```sql
CREATE DATABASE  IF NOT EXISTS `paw2go` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `paw2go`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: paw2go
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id_admin` int NOT NULL AUTO_INCREMENT,
  `admin_username` varchar(45) NOT NULL,
  `admin_name` varchar(45) NOT NULL,
  `admin_password` varchar(45) NOT NULL,
  `admin_email` varchar(45) NOT NULL,
  PRIMARY KEY (`id_admin`,`admin_name`,`admin_password`,`admin_email`,`admin_username`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Karina','Karina0001','12345678','grace@gmail.com'),(2,'Carlos','Carlos0002','12345678','grace@gmail.com'),(3,'Jairo','Jairo0003','12345678','grace@gmail.com'),(4,'Bryan','Bryan0004','12345678','grace@gmail.com'),(5,'Krizia','Krizia0005','12345678','grace@gmail.com'),(6,'Marco','Marco0006','12345678','grace@gmail.com');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
```
### JavaScript Fetch
Ahora que tenemos la parte del Intellij corriendo y nuestra base de datos con las tablas necesarias, ahora pasamos a la parte del JavaScript, donde utilizamos la función fetch para ejecutar los métodos GET, PUT, DELETE y POST, a continuacion dejo un ejemplo del metodo POST

```javascript
 fetch('http://localhost:8080/products/newProduct', {  
            method: 'POST',
            body: productJson,
            headers: {
                'Content-Type': 'application/json'
            }
            })
                .then(res => res.json())
                .then(data => {
                    console.log(data);
            })
            .catch((error) => {
                console.error("error",error);
            });
```
### Postman
Con el software de Postman lo utilizamos para poder hacer pruebas y debug con las peticiones al servidor.

## Cierre
Utilizando esta parte del backend y complementandolo con la parte del frontend que tambien se encuentra disponible en mi perfil de Github,  aseguramos una página web funcional con conexión a una base de datos.

**Gracias**
