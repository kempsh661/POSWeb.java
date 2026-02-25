<%-- 
    Document   : guardarProducto
    Created on : 24/02/2026, 11:02:56 p. m.
    Author     : RYZEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Nuevo Producto</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow">
        <div class="card-header bg-success text-white">
            <h4>Registrar Nuevo Producto</h4>
        </div>

        <div class="card-body">

            <form action="ProductoServlet" method="post">

                <input type="hidden" name="accion" value="guardar">

                <div class="mb-3">
                    <label class="form-label">Nombre</label>
                    <input type="text" name="nombre" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Descripción</label>
                    <input type="text" name="descripcion" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">Precio</label>
                    <input type="number" step="0.01" name="precio" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Stock</label>
                    <input type="number" name="stock" class="form-control" required>
                </div>

                <button type="submit" class="btn btn-success">Guardar</button>
                <a href="ProductoServlet?accion=listar" class="btn btn-secondary">Cancelar</a>

            </form>

        </div>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
