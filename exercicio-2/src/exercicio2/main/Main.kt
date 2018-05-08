package exercicio2.main

import exercicio2.formasgeometricas.Circulo
import exercicio2.formasgeometricas.Retangulo
import exercicio2.formasgeometricas.Triangulo

fun main(args: Array<String>) {
    val retangulo = Retangulo(2.5,4.0)
    val triangulo = Triangulo(2.0,8.0)
    val circulo = Circulo(5.0)

    val listaFormasGeometricas = listOf(retangulo,triangulo,circulo)

    for (forma in listaFormasGeometricas){
        forma.printFormaGeometrica()
    }
}