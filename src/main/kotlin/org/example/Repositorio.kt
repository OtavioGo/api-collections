package org.example

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, Value:T) { map[id] = Value }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]

    fun findAll() = map.values
}