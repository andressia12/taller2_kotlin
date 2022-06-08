package solucion_taller2

import kotlin.math.ceil

/*
Enunciado:
Enelnuevoedificiodelauniversidad,cadapisotendráelmismonúmerode salones y en todos
los salones tendrán la misma capacidad (cantidaddeestudiantesquecabenenelsalón).
Escribaunafunciónyunprogramaque calcule el número de salones y el número de pisos
que tendrá elnuevo edificio a partir del número de estudiantes que tiene la universidad
,lacapacidad del salón y el número de salones que tendrá un piso del edificio.
 */


/*
Función que devuelve la cantidad de pisos que debe tener el nuevo edificio de la universidad

Entradas:
capacidad_salones -> cs -->Int
numero_salones_por_piso --> nsp -->Int
numero_estudiantes -->ns -->Int

Salidas:
pisos -->Int
*/
fun pisosEdificio(cs:Int, nsp:Int, ns:Int):Int{
    require(cs>0 && ns>0 && nsp>0)
    val salones= ceil(ns.toDouble() / cs.toDouble()).toInt()
    val pisos = ceil(salones.toDouble()/nsp.toDouble()).toInt()
    return pisos
}

fun main(){
    print("Escribe la cantidad de estudiantes de la universidad: ")
    val cts = readln()!!.toInt()
    print("¿Que capacidad tienen los salones?")
    val cps = readln()!!.toInt()
    print("¿Cuantos salones tendra cada piso? ")
    val sp = readln()!!.toInt()
    print("Necesias contruir ${pisosEdificio(cps,sp,cts)} pisos")

}
