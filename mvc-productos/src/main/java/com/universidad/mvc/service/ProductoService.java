package com.universidad.mvc.service;

import com.universidad.mvc.model.*;
import java.util.List;

public class ProductoService {

    private ProductoDAO dao = new ProductoDAO();

    public List<Producto> listarProductos() {
        return dao.listar();
    }

    public Producto obtenerProducto(int id) {
        return dao.buscarPorId(id);
    }

    public void crearProducto(Producto p) {
        if (p.getPrecio() <= 0 || p.getStock() < 0) {
            throw new IllegalArgumentException("Datos inválidos");
        }
        dao.guardar(p);
    }

    public void actualizarProducto(Producto p) {
        dao.actualizar(p);
    }

    public void eliminarProducto(int id) {
        dao.eliminar(id);
    }
}