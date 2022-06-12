package solucion_taller2
import java.lang.Math
fun main (){
    //Entradas
    print("Ingrese X:")
    val x = readLine()!!.toDouble()
    print("Ingrese y:")
    val y = readLine()!!.toDouble()
    //Salidas
    println("El resultado es: ${ejercico_uno(x,y)}")
}
fun ejercico_uno(x:Double, y:Double) = Math.pow(x, 2.0)-(2*x*y)+Math.pow(y, 2.0)