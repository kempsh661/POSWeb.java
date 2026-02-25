/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import modelo.ProductoDAO;
import modelo.Producto;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ProductoServlet")
public class ProductoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        ProductoDAO dao = new ProductoDAO();

        if (accion != null && accion.equals("listar")) {

            List<Producto> lista = dao.listar();
            request.setAttribute("lista", lista);

            request.getRequestDispatcher("/productos.jsp").forward(request, response);
        }
        if (accion != null && accion.equals("eliminar")) {

            int id = Integer.parseInt(request.getParameter("id"));
            dao.eliminar(id);

            response.sendRedirect("ProductoServlet?accion=listar");
        }
        if (accion != null && accion.equals("editar")) {

    int id = Integer.parseInt(request.getParameter("id"));
    Producto producto = dao.obtenerPorId(id);

    request.setAttribute("producto", producto);
    request.getRequestDispatcher("/editarProducto.jsp").forward(request, response);
}
    }
    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    String accion = request.getParameter("accion");
    ProductoDAO dao = new ProductoDAO();

    if (accion != null && accion.equals("guardar")) {

        Producto p = new Producto();

        p.setNombre(request.getParameter("nombre"));
        p.setDescripcion(request.getParameter("descripcion"));
        p.setPrecio(Double.parseDouble(request.getParameter("precio")));
        p.setStock(Integer.parseInt(request.getParameter("stock")));

        dao.insertar(p);

        response.sendRedirect("ProductoServlet?accion=listar");
    }
    if (accion != null && accion.equals("actualizar")) {

    Producto p = new Producto();

    p.setId(Integer.parseInt(request.getParameter("id")));
    p.setNombre(request.getParameter("nombre"));
    p.setDescripcion(request.getParameter("descripcion"));
    p.setPrecio(Double.parseDouble(request.getParameter("precio")));
    p.setStock(Integer.parseInt(request.getParameter("stock")));

    dao.actualizar(p);

    response.sendRedirect("ProductoServlet?accion=listar");
}
}
}
