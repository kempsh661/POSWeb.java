/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;

/**
 *
 * @author RYZEN
 */
public class TestConexion {
    public static void main(String[] args) {

        Connection con = Conexion.getConnection();

        if (con != null) {
            System.out.println("Conexion exitosa a la base de datos");
        } else {
            System.out.println("Error en la conexion");
        }
    }
}
