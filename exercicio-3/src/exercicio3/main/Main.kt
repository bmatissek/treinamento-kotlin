package exercicio3.main

import java.util.Random
import kotlin.math.abs

fun main(args: Array<String>) {
    val random = Random().nextInt(101)
    var userInput : Int?
    var diff : Int?
    var isDone : Boolean = false
    var numeroPalpites : Int = 0

    println ("Gerei um número aleatório!")
    do {
        print ("Digite seu palpite: ")
        userInput = readLine()?.toValidInputOrNull()
        userInput?:println("Input Inválido")
        userInput?.let{
            numeroPalpites++
            diff = abs(userInput - random)
            when (diff){
                0 -> {
                    println("Acertou! Você precisou de $numeroPalpites palpites")
                    isDone = true
                }
                in 1..10 -> println ("Quase lá...")
                in 11..25 -> println ("Ainda está um pouquinho longe!")
                in 26..50 -> println ("Está bem distante ainda!")
                in 51..100 -> println("Errou feio, errou rude...")
            }
        }
    } while (!isDone)
}

fun String?.toValidInputOrNull() : Int? {
    this?: return null
    var integerInput: Int? = this.toIntOrNull()
    integerInput = if (integerInput in 0..100) integerInput else null
    return integerInput
}