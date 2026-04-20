<%@ taglib uri="http://jakarta.apache.org/taglibs/standard" prefix="c" %>

<h1>Productos</h1>

<a href="productos?accion=nuevo">Nuevo Producto</a>

<table border="1">
<tr>
    <th>ID</th>
    <th>Nombre</th>
    <th>Precio</th>
    <th>Stock</th>
    <th>Acciones</th>
</tr>

<c:forEach var="p" items="${lista}">
<tr>
    <td>${p.id}</td>
    <td>${p.nombre}</td>
    <td>${p.precio}</td>
    <td>${p.stock}</td>
    <td>
        <a href="productos?accion=editar&id=${p.id}">Editar</a>
        <a href="productos?accion=eliminar&id=${p.id}">Eliminar</a>
    </td>
</tr>
</c:forEach>

</table>