package solucion_taller2

import java.lang.StrictMath.pow
import kotlin.math.pow

/*
Enunciado:Escriba una función y un programa en el que a partir de
dos números y un operador aritmético  (que puede ser "+", "-", "*", "/", "%" o "**")
, aplica la operación correspondiente y muestra el nombre de la operación y el resultado.
 */

/*
Funcion que recibe dos numeros y un operador y devuelve el resultado de la operacion y su nombre
Entrada:
numero_1 -->Double-->n1
numero_2 -->Double-->n2
operador -->String-->op
*/

fun operacion(n1:Double, n2:Double, op:String):Pair<Double,String>{

    require((op == "+") || (op == "-") || (op == "*") || (op == "/") || (op == "%") || (op == "**"))
    when(op){
        "+" ->return Pair((n1+n2), "Suma")
        "-" ->return Pair((n1-n2), "Resta")
        "*" ->return Pair((n1*n2), "Multiplicación")
        "/" ->return Pair((n1/n2), "División")
        "%" ->return Pair((n1%n2), "Modulo División")
        else ->return Pair((pow(n1,n2)), "Potencia")

    }
}


fun main(){
    print("Escribe el número uno:  ")
    val n1 = readln()!!.toDouble()
    print("Escribe el operador '+' , '-', '*', '/', '%', o '**' : ")
    val opr = readln()
    print("Escribe el numero 2:  ")
    val n2 = readln()!!.toDouble()

    val (x,y) = operacion(n1,n2,opr)
    print("El resultado de la $y es: $x ")

}
