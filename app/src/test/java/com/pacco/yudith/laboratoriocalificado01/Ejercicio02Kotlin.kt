package com.pacco.yudith.laboratoriocalificado01

import org.junit.Test

// En esta clase implemento la función para contar cuántas vocales hay en una cadena de texto
class Ejercicio02Kotlin {
    // Esta función recibe un texto y retorna la cantidad de vocales (a, e, i, o, u) que contiene
    fun contarVocales(texto: String): Int {
        // Primero convierto el texto a minúsculas para que la búsqueda de vocales no dependa de mayúsculas o minúsculas
        val textoMinusculas = texto.lowercase()

        // Defino un conjunto con las vocales que quiero contar
        val vocales = setOf('a', 'e', 'i', 'o', 'u')

        // Uso la función count para recorrer cada carácter y sumar uno si es una vocal
        return textoMinusculas.count { it in vocales }
    }
}

// En esta clase hago la prueba de mi función usando JUnit
class Ejercicio02KotlinTest {
    @Test
    fun testContarVocales() {
        // Creo una instancia de mi clase Ejercicio02Kotlin
        val ejercicio = Ejercicio02Kotlin()

        // Pruebo la función con el texto "Hola mundo", que tiene 4 vocales, y muestro el resultado
        println("Vocales en 'Hola mundo': " + ejercicio.contarVocales("Hola mundo")) // 4

        // Pruebo la función con el texto "Kotlin es genial", que tiene 6 vocales, y muestro el resultado
        println("Vocales en 'Kotlin es genial': " + ejercicio.contarVocales("Kotlin es genial")) // 6
    }
}
