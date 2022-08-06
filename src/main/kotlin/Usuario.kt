class Usuario {
    var nombre: String = "" // Inicializar (Dar un valor inicial)
    var apellido: String = ""

    fun mostrarNombreCompleto() {
        println("$nombre $apellido")
    }

    fun mostrarConPrefijo(prefijo: String) {
        println("$prefijo $apellido")
    }
    fun actualizarNombre(nuevoNombre: String) {
        nombre = nuevoNombre
    }
    fun mostrarLongitudNombre() {
        println(nombre.length)
    }
}