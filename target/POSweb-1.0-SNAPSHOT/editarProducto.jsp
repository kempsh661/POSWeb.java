<%-- 
    Document   : editarProducto
    Created on : 24/02/2026, 11:23:15 p. m.
    Author     : RYZEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Producto"%>

<%
    Producto p = (Producto) request.getAttribute("producto");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Producto</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow">
        <div class="card-header bg-warning text-dark">
            <h4>Editar Producto</h4>
        </div>

        <div class="card-body">

            <form action="ProductoServlet" method="post">

                <input type="hidden" name="accion" value="actualizar">
                <input type="hidden" name="id" value="<%= p.getId() %>">

                <div class="mb-3">
                    <label>Nombre</label>
                    <input type="text" name="nombre" class="form-control"
                           value="<%= p.getNombre() %>" required>
                </div>

                <div class="mb-3">
                    <label>Descripción</label>
                    <input type="text" name="descripcion" class="form-control"
                           value="<%= p.getDescripcion() %>">
                </div>

                <div class="mb-3">
                    <label>Precio</label>
                    <input type="number" step="0.01" name="precio"
                           class="form-control"
                           value="<%= p.getPrecio() %>" required>
                </div>

                <div class="mb-3">
                    <label>Stock</label>
                    <input type="number" name="stock"
                           class="form-control"
                           value="<%= p.getStock() %>" required>
                </div>

                <button type="submit" class="btn btn-warning">Actualizar</button>
                <a href="ProductoServlet?accion=listar" class="btn btn-secondary">Cancelar</a>

            </form>

        </div>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
