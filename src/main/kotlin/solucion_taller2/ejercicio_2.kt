package solucion_taller2
import kotlin.math.ceil
/*
Enunciado: Elpaseo:cuandotermineestapandemia,vamosaorganizarunpaseo.Alpaseo irán estudiantes gordos y flacos.
 Un estudiante gordo ocupa dos sillas de un bus y un estudiante flaco ocupa solo una silla. Si sabemoscuánta
 sillas tiene un bus, cuántos estudiantes gordos van al paseo ycuántos estudiantes flacos van al paseo, escriba
 una función y unprograma que encuentre el número de buses que se necesitan alquilar para llevar todos esos
 estudiantes al paseo.
 */

fun main(){
    //Entradas:
    print("Estudiantes Gordos: ")
    val fat = readLine()!!.toDouble()
    print("Estudiantes Flacos:  ")
    val fit = readLine()!!.toDouble()
    print("Cantidad de sillas")
    val chair= readLine()!!.toDouble()
    //Salidas:
    print("se necesitan ${bus(fat,fit,chair)}")

}

fun bus (fat:Double, fit:Double, chair:Double):Int{
    require(chair >0 && fat >=0 && fit >=0 )
    var bus = ceil(((fat*2+fit)/chair))
    return bus.toInt()
}
