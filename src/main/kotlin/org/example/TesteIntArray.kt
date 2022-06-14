package org.example

fun main() {
    //Testes com o Array do tipo Int
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values){ println(valor) }

    for (index in values.indices){ println(values[index]) }

    //sort ordena os values do menor para o maior
    values.sort()
    for (valor in values){ println(valor) }

    //Tem a mesma função do for mostrado acima
    values.forEach { println(it) }

    values.forEach { valor -> println(valor) }
}