<%-- 
    Document   : index
    Created on : 24/02/2026, 4:48:47 p. m.
    Author     : RYZEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistemas Pos Kem</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body style="background-color: #f4f6f9">
        <div class="container mt-5">
            <div class="card shadow">
                <div class="card-header bg-dark text-white">
                    <h3>Sistema Pos Kem - Gestion de Productos</h3>
                </div>
                <div class="card-body text-center">
                    <p>Bienvenido al modulo de administracion de productos.</p>
                    <a href="ProductoServlet?accion=listar" class="btn btn-primary">
                        Administrar Productos
                    </a>
                </div>
            </div>
        </div>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
