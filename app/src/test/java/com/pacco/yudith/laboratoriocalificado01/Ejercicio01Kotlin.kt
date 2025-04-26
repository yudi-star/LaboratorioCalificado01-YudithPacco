package com.pacco.yudith.laboratoriocalificado01

import org.junit.Test

// En esta clase implemento la función para verificar si dos palabras son anagramas
class Ejercicio01Kotlin {
    // Esta función recibe dos palabras y retorna true si son anagramas, false si no lo son
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Primero convierto ambas palabras a minúsculas para que la comparación no dependa de mayúsculas o minúsculas
        val str1 = palabra1.lowercase()
        val str2 = palabra2.lowercase()

        // Verifico si las palabras tienen diferente longitud; si es así, no pueden ser anagramas y retorno false
        if (str1.length != str2.length) {
            return false
        }

        // Convierto ambas palabras a arreglos de caracteres para poder ordenarlos
        val array1 = str1.toCharArray()
        val array2 = str2.toCharArray()

        // Ordeno ambos arreglos de caracteres para comparar letra por letra
        array1.sort()
        array2.sort()

        // Comparo los arreglos ordenados; si son iguales, las palabras son anagramas y retorno true, si no, retorno false
        return array1.contentEquals(array2)
    }
}

// En esta clase hago la prueba de mi función usando JUnit
class Ejercicio01KotlinTest {
    @Test
    fun testSonAnagramas() {
        // Creo una instancia de mi clase Ejercicio01Kotlin
        val ejercicio = Ejercicio01Kotlin()

        // Pruebo la función con las palabras "listen" y "silent", que sí son anagramas, y muestro el resultado
        println("listen y silent: " + ejercicio.sonAnagramas("listen", "silent")) // true

        // Pruebo la función con las palabras "hello" y "world", que no son anagramas, y muestro el resultado
        println("hello y world: " + ejercicio.sonAnagramas("hello", "world"))     // false
    }
}