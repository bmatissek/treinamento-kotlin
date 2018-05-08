package exercicio2.formasgeometricas

import kotlin.math.PI

interface FormaGeometrica{
    fun calcularArea() : Double
    fun printFormaGeometrica()
}

class Retangulo(private val largura : Double, private val altura: Double) : FormaGeometrica {
    override fun calcularArea() = largura * altura
    override fun printFormaGeometrica(){
        println("Sou um retangulo de largura $largura e altura $altura. Minha área é ${calcularArea()}.")
    }
}

class Triangulo(private val base : Double, private val altura: Double) : FormaGeometrica {
    override fun calcularArea() = base * altura / 2
    override fun printFormaGeometrica(){
        println("Sou um triangulo de base $base e altura $altura. Minha área é ${calcularArea()}.")
    }
}

class Circulo(private val raio : Double) : FormaGeometrica {
    override fun calcularArea(): Double = PI * raio * raio
    override fun printFormaGeometrica(){
        println("Sou um circulo de raio $raio. Minha área é ${calcularArea()}.")
    }
}