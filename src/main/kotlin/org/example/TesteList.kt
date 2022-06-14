package org.example

fun main() {
    val otavio = Funcionario("Otavio", 1000.0, "CLT")
    val gomes = Funcionario("Gomes", 3000.0, "PJ")
    val temporim = Funcionario("Temporim", 2000.0, "CLT")
    val menezes = Funcionario("Menezes", 4000.0, "PJ")

    val funcionarios = listOf(otavio, gomes, temporim, menezes)

    funcionarios.forEach { println(it) }

    println("===========================")
    println(funcionarios.find { it.nome == "Otavio" })

    println("===========================")
    funcionarios.sortedBy { it.salario }
        .forEach { println(it) }

    println("===========================")
    funcionarios.groupBy { it.tipoContrato }
        .forEach { println(it) }
}
