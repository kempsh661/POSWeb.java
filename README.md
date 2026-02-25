🧾 CRUD de Productos - Sistema POS (JSP + Servlet)

Aplicación web desarrollada en Java (JSP y Servlets) bajo arquitectura MVC, que permite gestionar productos para un sistema POS.

🚀 Tecnologías

Java 17+

JSP / Servlets

MySQL

JDBC

Apache Tomcat 10

Bootstrap 5

📌 Funcionalidades

Crear productos

Listar productos

Editar productos

Eliminar productos

Conexión a base de datos con JDBC

Uso de PreparedStatement (seguridad básica)

🗄 Base de Datos
CREATE DATABASE pos_jsp;

USE pos_jsp;

CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(150),
    precio DOUBLE NOT NULL,
    stock INT NOT NULL,
    estado VARCHAR(20) DEFAULT 'activo'
);
⚙ Configuración

Clonar el repositorio:

git clone https://github.com/kempsh661/POSWeb.java.git

Configurar credenciales en Conexion.java.

Ejecutar en Apache Tomcat.

🏗 Arquitectura

Modelo: Producto, ProductoDAO, Conexion

Vista: productos.jsp, editarProducto.jsp

Controlador: ProductoServlet

Proyecto académico enfocado en comprender el patrón MVC y el flujo completo de un CRUD en Java Web.
