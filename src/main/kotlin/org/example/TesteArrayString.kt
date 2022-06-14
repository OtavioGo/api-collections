package org.example

fun main() {
    val nomes = Array(4) {""}

    nomes[0] = "Otavio"
    nomes[1] = "Gomes"
    nomes[2] = "Temporim"
    nomes[3] = "Menezes"

    for (nome in nomes){ print("$nome ") }

    println()

    //sort na String ordena ela a ficar em ordem alfabética
    nomes.sort()
    nomes.forEach { print("$it ") }

    println()

    val nome2 = arrayOf("Otavio", "Gomes", "Temporim", "Menezes")
    nome2.sort()
    nome2.forEach { print("$it ") }

}