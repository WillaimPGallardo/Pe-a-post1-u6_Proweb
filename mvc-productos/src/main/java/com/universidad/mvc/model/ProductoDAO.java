package com.universidad.mvc.model;

import java.util.*;

public class ProductoDAO {

    private static List<Producto> productos = new ArrayList<>();
    private static int contador = 1;

    static {
        productos.add(new Producto(contador++, "Laptop", 2500000, 5));
        productos.add(new Producto(contador++, "Mouse", 80000, 20));
        productos.add(new Producto(contador++, "Teclado", 120000, 15));
    }

    public List<Producto> listar() {
        return productos;
    }

    public Producto buscarPorId(int id) {
        return productos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void guardar(Producto p) {
        p.setId(contador++);
        productos.add(p);
    }

    public void actualizar(Producto p) {
        Producto existente = buscarPorId(p.getId());
        if (existente != null) {
            existente.setNombre(p.getNombre());
            existente.setPrecio(p.getPrecio());
            existente.setStock(p.getStock());
        }
    }

    public void eliminar(int id) {
        productos.removeIf(p -> p.getId() == id);
    }
}