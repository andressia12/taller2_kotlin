package solucion_taller2

import kotlin.math.max

fun main(){
    //Entradas
    print("Digite el primer numero entero:")
    val n1 = readLine()!!.toInt()
    print("Digite el segundo numero entero:")
    val n2 = readLine()!!.toInt()
    //Salidas
    print("El numero mayor es: ${num_mayor(n1, n2)}")
}
 fun num_mayor(n1:Int,n2:Int):Int{
     val mayor = max(n1,n2)
     return mayor
 }