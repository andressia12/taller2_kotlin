package solucion_taller2

/*
Funcion que recibe los nombres y edades de tres hermanos y determinar cúal es el mayor

Entrada:
Nombre_Hermano_1-->String-->nh1
Edad_hermano_1-->Int-->eh1

Nombre_Hermano_2-->String-->nh2
Edad_hermano_2-->Int-->eh2

Nombre_Hermano_3-->String-->nh3
Edad_hermano_3-->Int-->eh3

Salida:
Nombre_hermano_mayor-->String
 */

fun hermanoMayor(hermano1: Pair<String,Int>, hermano2: Pair<String,Int>, hermano3: Pair<String, Int>):String{
    require(hermano1.second >0 && hermano2.second >0 && hermano3.second >0)
    if (hermano1.second > hermano2.second && hermano1.second > hermano3.second){
        return hermano1.first
    }else if (hermano2.second > hermano3.second){
        return hermano2.first
    }
    return hermano3.first

}

fun main(){
    print("Digite el nombre del primer hermano:  ")
    val n1 = readln()
    print("Digite la edad: ")
    val y1 = readln().toInt()
    val pair1 = Pair(n1,y1)
    print("Digite el nombre del segundo hermano:  ")
    val n2 = readln()
    print("Digite la edad: ")
    val y2 = readln().toInt()
    val pair2 = Pair(n2,y2)

    print("Digite el nombre del tercer hermano:  ")
    val n3 = readln()
    print("Digite la edad: ")
    val y3 = readln().toInt()
    val pair3 = Pair(n3,y3)

    print("El nombre del hermano mayor es ${hermanoMayor(pair1,pair2, pair3)}")
}