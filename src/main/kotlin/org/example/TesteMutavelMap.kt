package org.example

fun main() {
    val otavio = Funcionario("Otavio", 1000.0, "CLT")
    val gomes = Funcionario("Gomes", 3000.0, "PJ")
    val temporim = Funcionario("Temporim", 2000.0, "CLT")
    val menezes = Funcionario("Menezes", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(otavio.nome, otavio)
    repositorio.create(gomes.nome, gomes)
    repositorio.create(temporim.nome, temporim)
    repositorio.create(menezes.nome, menezes)

    println(repositorio.findById(otavio.nome))

    println("================================")
    repositorio.findAll().forEach { println(it) }

    println("================================")
    repositorio.remove(otavio.nome)
    repositorio.findAll().forEach { println(it) }
}