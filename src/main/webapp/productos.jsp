<%-- 
    Document   : Productos
    Created on : 24/02/2026, 10:52:57 p. m.
    Author     : RYZEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Producto"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Productos</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow">
        <div class="card-header bg-primary text-white">
            <h4>Lista de Productos</h4>
        </div>

        <div class="card-body">

            <a href="index.jsp" class="btn btn-secondary mb-3">Volver</a>
            <a href="guardarProducto.jsp" class="btn btn-success mb-3">
                Nuevo Producto
            </a>
            <table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Precio</th>
                        <th>Stock</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>

                <%
                    List<Producto> lista = (List<Producto>) request.getAttribute("lista");

                    if (lista != null) {
                        for (Producto p : lista) {
                %>
                    <tr>
                        <td><%= p.getId() %></td>
                        <td><%= p.getNombre() %></td>
                        <td><%= p.getDescripcion() %></td>
                        <td>$ <%= p.getPrecio() %></td>
                        <td><%= p.getStock() %></td>

                        <td>
                             <a href="ProductoServlet?accion=editar&id=<%= p.getId() %>"
                                class="btn btn-warning btn-sm">
                                Editar
                            </a>
                            <a href="ProductoServlet?accion=eliminar&id=<%= p.getId() %>"
                               class="btn btn-danger btn-sm"
                               onclick="return confirm('¿Seguro que deseas eliminar este producto?')">
                               Eliminar
                            </a>
                        </td>
                    </tr>
                <%
                        }
                    }
                %>

                </tbody>
            </table>

        </div>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>