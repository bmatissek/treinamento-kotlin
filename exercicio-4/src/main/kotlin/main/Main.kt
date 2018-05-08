package main

import alunos.EstatisticasAlunos
import alunos.ListaAlunos
import kotlinx.serialization.json.JSON
import java.io.File

/**
 * https://github.com/JetBrains/kotlin-examples/blob/master/gradle/hello-world/build.gradle
 * https://github.com/Kotlin/kotlinx.serialization
 * https://medium.freecodecamp.org/my-favorite-examples-of-functional-programming-in-kotlin-e69217b39112
 */

fun main(args: Array<String>) {

    val inputFile = File("resources/listaAlunos.json")
    val jsonInputString = inputFile.readText()
    val jsonInputObject = (JSON.parse<ListaAlunos>(jsonInputString))

    val listaAlunos = jsonInputObject.listaAlunos

    val listaAprovados = listaAlunos
        .filter { it.nota >= 7 }
        .sortedByDescending { it.nota }

    val numeroAprovados = listaAprovados.count()
    val numeroReprovados = listaAlunos.count() - listaAprovados.count()
    val alguemGabaritou = listaAprovados.any { it.nota == 10 }
    val alguemZerou = listaAlunos.any { it.nota == 0 }
    val notasAbaixoCinco = listaAlunos.count{ it.nota < 5 }
    val mediaTurma = listaAlunos
        .map { it.nota }
        .average()

    val listaAprovadosJsonOutputObject = ListaAlunos(listaAprovados)
    val listaAprovadosJsonOutputString = JSON.stringify(listaAprovadosJsonOutputObject)

    val listaAprovadosOutputFile = File("resources/listaAprovados.json")
    listaAprovadosOutputFile.writeText(listaAprovadosJsonOutputString)

    val estatisticasAlunosJsonOutputObject = EstatisticasAlunos(
        numeroAprovados,
        numeroReprovados,
        alguemGabaritou,
        alguemZerou,
        notasAbaixoCinco,
        mediaTurma
    )
    val estatisticasAlunosJsonOutputString = JSON.stringify(estatisticasAlunosJsonOutputObject)

    val estatisticasAlunosOutputFile = File("resources/estatisticasAlunos.json")
    estatisticasAlunosOutputFile.writeText(estatisticasAlunosJsonOutputString)

}