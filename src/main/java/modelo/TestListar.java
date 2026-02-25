/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author RYZEN
 */

import java.util.List;

public class TestListar {

    public static void main(String[] args) {

        ProductoDAO dao = new ProductoDAO();
        List<Producto> lista = dao.listar();

        for (Producto p : lista) {
            System.out.println(
                    p.getId() + " - " +
                    p.getNombre() + " - $" +
                    p.getPrecio() + " - Stock: " +
                    p.getStock()
            );
        }
    }
}
