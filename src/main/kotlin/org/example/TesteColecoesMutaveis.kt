package org.example

fun main() {
    val otavio = Funcionario("Otavio", 1000.0, "CLT")
    val gomes = Funcionario("Gomes", 3000.0, "PJ")
    val temporim = Funcionario("Temporim", 2000.0, "CLT")
    val menezes = Funcionario("Menezes", 4000.0, "PJ")

    val funcionarios = mutableListOf(otavio, gomes)
    funcionarios.forEach { println(it) }

    println("=============== LIST ======================")
    funcionarios.add(temporim)
    funcionarios.forEach { println(it) }

    println("=====================================")
    funcionarios.remove(otavio)
    funcionarios.forEach { println(it) }

    println("=============== SET ======================")
    val funcionairosSet = mutableSetOf(otavio)
    funcionairosSet.forEach { println(it) }

    println("=====================================")
    funcionairosSet.add(gomes)
    funcionairosSet.add(temporim)
    funcionairosSet.add(menezes)

    funcionairosSet.forEach { println(it) }
}