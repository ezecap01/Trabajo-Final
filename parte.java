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