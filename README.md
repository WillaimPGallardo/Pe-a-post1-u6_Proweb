# 📦 MVC Productos - CRUD con Servlets y JSP

## 📖 Descripción

Aplicación web desarrollada con **Jakarta EE** que implementa el patrón **MVC** para gestionar un CRUD de productos.
Utiliza **Servlets como controlador**, **JSP con EL/JSTL como vista** y clases Java para el modelo.

---

## ⚙️ Tecnologías

* Java 17
* Jakarta Servlet API
* JSP + JSTL
* Apache Maven
* Apache Tomcat

---

## 🏗️ Estructura

```text
mvc-productos/
 ├── src/main/java/com/universidad/mvc/
 │   ├── model/
 │   ├── service/
 │   └── controller/
 ├── src/main/webapp/
 │   ├── WEB-INF/views/
 │   └── css/
 └── pom.xml
```

---

## 🚀 Ejecución

1. Compilar:

```bash
mvn clean package
```

2. Copiar el archivo generado:

```text
target/mvc-productos.war
```

3. Pegar en:

```text
apache-tomcat/webapps/
```

4. Ejecutar Tomcat:

```bash
startup.bat
```

5. Abrir en navegador:

```text
http://localhost:8080/mvc-productos/productos
```

---
<img width="1074" height="871" alt="image" src="https://github.com/user-attachments/assets/30372653-0c51-46cd-a1d5-3bba00e6611b" />



Funcionalidades

* Listar productos
* Crear producto
* Editar producto
* Eliminar producto
* Redirección Post/Redirect/Get

---

