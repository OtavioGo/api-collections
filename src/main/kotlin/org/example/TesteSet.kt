package org.example

fun main() {
    val otavio = Funcionario("Otavio", 1000.0, "CLT")
    val gomes = Funcionario("Gomes", 3000.0, "PJ")
    val temporim = Funcionario("Temporim", 2000.0, "CLT")
    val menezes = Funcionario("Menezes", 4000.0, "PJ")

    val funcionarios1 = setOf(otavio, gomes)
    val funcionarios2 = setOf(temporim, menezes)

    //Union ira unir os conjuntos
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("===========================================================")
    val funcionarios3 = setOf(gomes, temporim, menezes)

    //subtract ira exibir os dados incomuns entre os conjuntos
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("===========================================================")
    //Intersect exibe os dados comuns entre os conjuntos
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}