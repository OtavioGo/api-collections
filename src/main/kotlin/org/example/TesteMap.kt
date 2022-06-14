package org.example

fun main() {
    val pair: Pair<String, Double> = Pair("Otavio", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k = Valor: $v") }

    println("===============================================")

    val map2 = mapOf(
        "Gomes" to 4000.0,
        "Temporim" to 3000.0)

    map2.forEach { (k, v) -> println("Chave: $k = Valor: $v") }
}