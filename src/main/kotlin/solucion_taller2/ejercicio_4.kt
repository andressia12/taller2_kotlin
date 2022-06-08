package solucion_taller2

/*
Enunciado:  Pedroacabóderecibirelsueldomensual.Sisegastael40%deese sueldo en el arriendo
y el 15% del sueldo en comida, determinecuánto dinero se gastó en cada uno de esos dos
ítems (en arriendo y encomida)y cuantodinero lequeda al final.
 */

fun main(){
    //Entradas:
    print("Ingresa tu Sueldo: ")
    val sueldo = readLine()!!.toInt()
    //salidas
    val(x,y,z)= sueldoFinal(sueldo)
    print("Arriendo: $x  Comida: $y Sueldo Restante: $z")
}

fun sueldoFinal(sueldo:Int):Triple<Int,Int,Int>{
    require(sueldo >0)
    val arriendo = (sueldo*0.4).toInt()
    val comida = (sueldo*0.15).toInt()
    val sueldoF = sueldo-(arriendo+comida)
return Triple(arriendo, comida, sueldoF)
}

