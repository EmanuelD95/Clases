/** CLASES */

fun main() {
    val alumno = Usuario() // Instanciar (Sirve para solicitar algo)
    alumno.nombre = "Emanuel"
    alumno.apellido = "Munoz"
    alumno.mostrarNombreCompleto()
    alumno.mostrarConPrefijo("Alumno")
    alumno.actualizarNombre("Daniel")
    alumno.mostrarNombreCompleto()
    alumno.mostrarLongitudNombre()
    println("---------------")


    val profesor = Usuario()
    profesor.nombre = "Alexander"
    profesor.actualizarNombre("Joe")
    profesor.apellido = "Ramirez"
    profesor.mostrarNombreCompleto()
    profesor.mostrarConPrefijo("Profe")
    profesor.mostrarLongitudNombre()


}


/**
 * class NombreDeClase {
 *     // Propiedades o Atributos
 *     // Funciones o Metodos
 * }
 */

/**
 * PARADIGMAS DE PROGRAMACIÓN
 *
 * ¿Qué es un Paradigma?
 * Es un ejemplo o modelo de algo.
 * ¿Qué es un Paradigma de Programación?
 * Es una manera o estilo de programación
 * de software.
 *
 * La Programación Orientada a Objetos (POO)
 * es un paradigma de programación.
 *
 * ¿Qué es un Objeto en Programación?
 * Es un ente abstracto usado en programación
 * que permite separar los diferentes
 * componentes de un programa, simplificando
 * así su elaboración, depuración y
 * posteriores mejoras.
 */