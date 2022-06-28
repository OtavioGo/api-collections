package org.example

// Abaixo segue um exemplo de código que você pode ou não utilizar
fun main() {
    val v = readLine()!!.toInt()
    val a = IntArray(10).toMutableList()

    for (i in 0 until 10) {
        a[i] = if(i == 0) v
        else a[i-1] * 2
    }
    for (k in  0  until  10 ) { println("N[$k] = ${a[k]}") }
}
