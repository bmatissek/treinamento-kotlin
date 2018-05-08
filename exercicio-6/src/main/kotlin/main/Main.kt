package main.kotlin.main

import main.kotlin.meuhashmap.MeuHashMap

fun main(args: Array<String>) {

    val strings = listOf("batata", "cebola", "tomate", "pepino", "berinjela")
    val listaCaracteres = strings.flatMap { it.toList() }

    val mapaCaracteresHashMap = HashMap<Char, Int?>()
    listaCaracteres.forEach { mapaCaracteresHashMap += (it to (mapaCaracteresHashMap[it] ?: 0) + 1) }
    println(mapaCaracteresHashMap)

    val meuMapaCaracteresHashMap = MeuHashMap<Char, Int?>()
    listaCaracteres.forEach { meuMapaCaracteresHashMap.add (it ,(meuMapaCaracteresHashMap.get(it) ?: 0) + 1) }
    meuMapaCaracteresHashMap.printMap()

}