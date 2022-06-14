package org.example

fun main() {
    val salarios = doubleArrayOf(4000.0, 1000.0, 6000.0, 2000.0, 3000.0)

    //Função count ira mostrar a quantidade de elementos que tem dentro da expressão
    println(salarios.count { it in 2000.0..5000.0 })

    println("======================================")

    //find ira ixibir o valor procurado pelo oque foi passado na expressão
    println(salarios.find { it == 1000.0 })

    //Ira procurar o valor e retorna true ou false
    println(salarios.any { it == 1000.0 })
}