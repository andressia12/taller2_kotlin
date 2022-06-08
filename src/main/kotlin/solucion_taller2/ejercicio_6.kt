package solucion_taller2

import kotlin.math.hypot

fun main(){
    //Entradas:
    print("Ingrese el lado A del Terreno: ")
    val a = readLine()!!.toDouble()
    print("Ingrese el lado B del Terreno")
    val b = readLine()!!.toDouble()
    print("Ingrese el lado C del Terreno")
    val c = readLine()!!.toDouble()
    //Salidas:
    print("El área del terreno es: ${areaTerreno(a,b,c)}  y el perimetro es: ${perimetroTerreno(a,b,c)}")

}

/*
Enunciado:  Función que halla el área de un rectángulo
Entradas:
base-->bs-->Double
altura-->at -->Double
Salida:
Área-->area -->Double
 */
fun areaRectangulo(bs:Double, at:Double)=bs*at

/*
Enunciado:  Función que halla la hipotenusa de un tríangulo rectángulo a partir
de los catetos
Entradas:
cateto 1 -->ct1 -->Double
cateto 2 -->ct2 -->Double
Salidas:
hipotenusa -->Double
 */
fun hipotenusaTriangulo(ct1:Double, ct2:Double)= hypot(ct1,ct2)

/*
Enunciado: Función que halla el area de un triangulo
Entradas:
base -->Double-->b
altura -->Double-->a
Salidas:
area-->Double-->area
*/
fun areaTriangulo(b:Double, a:Double)=b*a/2

/*
Enunciado: Función que halla el perimetro del terreno de la inmobiliaria
Entradas:
lado a  -->Double-->a
lado b -->Double-->b
lado c -->Double -->c

Salidas:
perimetro -->Double

*/
fun perimetroTerreno(a:Double, b:Double, c:Double):Double{
    val d = hipotenusaTriangulo(a-c, b)
    return (a+b+c+d)
}
/*
Enunciado:  Función que calcula el area del terreno de la inmobiliaria
Entradas:
lado a  -->Double-->la
lado b -->Double-->lb
lado c -->Double -->,lc
Salida:
Área_del_terreno -->Double
 */
fun areaTerreno(la:Double,lb:Double, lc:Double):Double{
    var area = areaRectangulo(lb,lc)
    area += areaTriangulo(lb,la-lc)
    return area
}