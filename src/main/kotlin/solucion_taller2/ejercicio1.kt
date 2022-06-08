package solucion_taller2

import kotlin.math.pow

fun main(){
    //Entradas
    print("Ingresa x: ")
    val x = readLine()!!.toDouble()
    print("Ingrese Y: ")
    val y = readLine()!!.toDouble()
    //Salidas
    println("El resultado es: ${ejercicioUno(x,y)}")

}

fun ejercicioUno(x:Double, y:Double)= x.pow(2.0) -(2*x*y)+ y.pow(2.0)