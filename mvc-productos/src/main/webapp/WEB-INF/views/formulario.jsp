<h1>Formulario Producto</h1>

<form action="productos" method="post">

    <input type="hidden" name="id" value="${producto.id}" />

    Nombre: <input type="text" name="nombre" value="${producto.nombre}" /><br>
    Precio: <input type="number" name="precio" value="${producto.precio}" /><br>
    Stock: <input type="number" name="stock" value="${producto.stock}" /><br>

    <button type="submit">Guardar</button>

</form>