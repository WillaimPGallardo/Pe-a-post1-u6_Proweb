package com.universidad.mvc.controller;

import com.universidad.mvc.model.Producto;
import com.universidad.mvc.service.ProductoService;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/productos")
public class ProductoServlet extends HttpServlet {

    private ProductoService service = new ProductoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String accion = req.getParameter("accion");

        if (accion == null) accion = "listar";

        switch (accion) {

            case "nuevo":
                req.getRequestDispatcher("/WEB-INF/views/formulario.jsp").forward(req, resp);
                break;

            case "editar":
                int id = Integer.parseInt(req.getParameter("id"));
                req.setAttribute("producto", service.obtenerProducto(id));
                req.getRequestDispatcher("/WEB-INF/views/formulario.jsp").forward(req, resp);
                break;

            case "eliminar":
                service.eliminarProducto(Integer.parseInt(req.getParameter("id")));
                resp.sendRedirect("productos");
                break;

            default:
                req.setAttribute("lista", service.listarProductos());
                req.getRequestDispatcher("/WEB-INF/views/lista.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int id = req.getParameter("id") == null || req.getParameter("id").isEmpty()
                ? 0
                : Integer.parseInt(req.getParameter("id"));

        String nombre = req.getParameter("nombre");
        double precio = Double.parseDouble(req.getParameter("precio"));
        int stock = Integer.parseInt(req.getParameter("stock"));

        Producto p = new Producto(id, nombre, precio, stock);

        if (id == 0) {
            service.crearProducto(p);
        } else {
            service.actualizarProducto(p);
        }

        resp.sendRedirect("productos");
    }
}