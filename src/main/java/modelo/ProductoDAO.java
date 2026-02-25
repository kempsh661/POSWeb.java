/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RYZEN
 */
public class ProductoDAO {
    public boolean insertar(Producto p){
        String sql = "INSERT INTO productos(nombre, descripcion, precio, stock,estado) VALUES (?,?,?,?,?)";
        
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps =con.prepareStatement(sql)){
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.setString(5, "ACTIVO");
            
            int filas = ps.executeUpdate();

            return filas > 0;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public List<Producto> listar() {

    List<Producto> lista = new ArrayList<>();
    String sql = "SELECT * FROM productos";

    try (Connection con = Conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            Producto p = new Producto();

            p.setId(rs.getInt("id"));
            p.setNombre(rs.getString("nombre"));
            p.setDescripcion(rs.getString("descripcion"));
            p.setPrecio(rs.getDouble("precio"));
            p.setStock(rs.getInt("stock"));
            p.setEstado(rs.getString("estado"));

            lista.add(p);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return lista;
}
    public boolean eliminar(int id) {

    String sql = "DELETE FROM productos WHERE id = ?";

    try (Connection con = Conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, id);
        return ps.executeUpdate() > 0;

    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    public Producto obtenerPorId(int id) {

    String sql = "SELECT * FROM productos WHERE id = ?";
    Producto p = null;

    try (Connection con = Conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, id);
        var rs = ps.executeQuery();

        if (rs.next()) {
            p = new Producto();
            p.setId(rs.getInt("id"));
            p.setNombre(rs.getString("nombre"));
            p.setDescripcion(rs.getString("descripcion"));
            p.setPrecio(rs.getDouble("precio"));
            p.setStock(rs.getInt("stock"));
            p.setEstado(rs.getString("estado"));
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return p;
}
    public boolean actualizar(Producto p) {

    String sql = "UPDATE productos SET nombre=?, descripcion=?, precio=?, stock=? WHERE id=?";

    try (Connection con = Conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, p.getNombre());
        ps.setString(2, p.getDescripcion());
        ps.setDouble(3, p.getPrecio());
        ps.setInt(4, p.getStock());
        ps.setInt(5, p.getId());

        return ps.executeUpdate() > 0;

    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
}
