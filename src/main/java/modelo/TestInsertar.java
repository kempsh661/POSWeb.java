/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.SQLException;

/**
 *
 * @author RYZEN
 */
public class TestInsertar {
     public static void main(String[] args) throws SQLException {

        ProductoDAO dao = new ProductoDAO();

        Producto p = new Producto();
        p.setNombre("Mouse Gamer");
        p.setDescripcion("Mouse RGB 7200 DPI");
        p.setPrecio(85000);
        p.setStock(10);

        boolean resultado = dao.insertar(p);

        if (resultado) {
            System.out.println("Producto insertado correctamente");
        } else {
            System.out.println("Error al insertar producto");
        }
    }
}
