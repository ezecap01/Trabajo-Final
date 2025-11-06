# Trabajo-Final
html
<head>
    <title>UrbanS</title>
    <link rel="stylesheet" href="style.css">
    <script src="parte.java"></script>

</head>
<body>
    <h1>Bienvenido a UrbanS</h1>
    <p>Tu tienda de zapatillas urbanas</p>

    <button onclick="mostrarOcultarFormulario()" class="button">
        Mostrar formulario de ventas
    </button>
 <form id="RegistroVenta" action="guardar.php" method="post">
        <fieldset>
            <legend>Formulario de Ventas</legend>

            <label for="fecha">Fecha de venta:</label>
            <input type="date" id="fecha" name="fecha" required>

            <label for="cliente">Nombre del cliente:</label>
            <input type="text" id="cliente" name="cliente" required>

            <label for="producto">Producto:</label>
            <select id="producto" name="producto" required onchange="actualizarPrecio()">
                <option value="">Seleccione un producto</option>
                <option value="Zapatillas">Zapatillas</option>
                <option value="Remera">Remera</option>
                <option value="Pantalón">Pantalón</option>
            </select>

            <label for="precio">Precio:</label>
            <input type="text" id="precio" name="precio" readonly>

            <button type="button" id="mostrarLista">Mostrar Lista de Precios</button>

            <div id="tablaPrecios" class="oculto">
                <table>
                    <tr><th>Producto</th><th>Precio</th></tr>
                    <tr><td>Zapatillas</td><td>$125.000</td></tr>
                    <tr><td>Remera</td><td>$70.000</td></tr>
                    <tr><td>Pantalón</td><td>$90.000</td></tr>
                </table>
                <button type="button" id="cerrarLista">Cerrar Lista</button>
            </div>

            <label for="cantidad">Cantidad:</label>
            <input type="number" id="cantidad" name="cantidad" required min="1">

            <label for="vendedor">Vendedor:</label>
            <select id="vendedor" name="vendedor" required>
                <option value="">Seleccione un vendedor</option>
                <option value="Ezequiel">Ezequiel</option>
                <option value="Marta">Marta</option>
                <option value="Carlos">Carlos</option>
                <option value="Lucas">Carlos</option>
            </select>

            <div class="botones">
                <input type="submit" value="Registrar" class="btn">
                <input type="reset" value="Limpiar" class="btn limpiar">
            </div>
        </fieldset>
    </form>

    
    
   

</body>
<footer>
  
css
@font-face {
  font-family: 'Hatch';
  src: url('fonts/Hatch.woff') format('woff');
  font-weight: normal;
  font-style: normal;
}

body{

    background-image: url(fondo.png);
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;

}

h1, p {
    font-family: 'hatch';
    background: rgba(0, 0, 0, 0);
    color: white;
    text-align: center;
}
#RegistroVenta {
    background: white;
    padding: 20px;
    border-radius: 8px;
    width: 400px;
    box-shadow: 0 2px 6px rgba(0, 0, 0, 0.2);
}

fieldset {
    border: 1px solid #ccc;
    padding: 15px;
}

legend {
    font-weight: bold;
}

label {
    display: block;
    margin-top: 10px;
}

input, select {
    width: 100%;
    padding: 6px;
    margin-top: 5px;
    box-sizing: border-box;
}

table {
    border-collapse: collapse;
    width: 100%;
    margin-top: 10px;
}

th, td {
    border: 1px solid #ccc;
    padding: 8px;
    text-align: center;
}

th {
    background-color: #eee;
}

.btn {
    background-color: #ca2020;
    color: white;
    border: none;
    padding: 10px 20px;
    font-size: 16px;
    cursor: pointer;
    border-radius: 6px;
}

.limpiar {
    background-color: #125aad;
}

.botones {
    margin-top: 20px;
    display: flex;
    justify-content: space-between;
}

.oculto {
    display: none;
}

java

const precios = {
    "Zapatillas", 125.000,
    "Remera", 70.000,
    "Pantalón", 90.000
};

function actualizarPrecio() {
    const producto = document.getElementById("producto").value;
    const precioInput = document.getElementById("precio");

    if (producto && precios[producto]) {
        precioInput.value = "$" + precios[producto].toLocaleString();
    } else {
        precioInput.value = "";
    }
}

// Mostrar / ocultar lista de precios
document.getElementById("mostrarLista").addEventListener("click", () => {
    document.getElementById("tablaPrecios").classList.remove("oculto");
});

document.getElementById("cerrarLista").addEventListener("click", () => {
    document.getElementById("tablaPrecios").classList.add("oculto");
});
