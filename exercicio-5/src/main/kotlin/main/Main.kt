package main.kotlin.main

fun main(args: Array<String>) {

    val strings = listOf("batata", "cebola", "tomate", "pepino", "berinjela")

    val listaCaracteres = strings.flatMap { it.toList() }
    println(listaCaracteres)

    val arrayCaracteres = strings.flatMap { it.toList() }.toCharArray()
    arrayCaracteres.filter { it == 'a' }
    println(arrayCaracteres)

    val conjuntoCaracteres = listaCaracteres.toSet()
    println(conjuntoCaracteres)

    val conjuntoCaracteresOrdenados = listaCaracteres.toSortedSet()
    println(conjuntoCaracteresOrdenados)

    val mapaCaracteres = mutableMapOf<Char, Int?>()
    val mapaCaracteresHashMap = HashMap<Char, Int?>()

    listaCaracteres.forEach { mapaCaracteres += (it to (mapaCaracteres[it] ?: 0) + 1) }
    listaCaracteres.forEach { mapaCaracteresHashMap += (it to (mapaCaracteresHashMap[it] ?: 0) + 1) }

    println(mapaCaracteres)
    println(mapaCaracteresHashMap)

}