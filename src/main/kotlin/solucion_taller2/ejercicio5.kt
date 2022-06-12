package solucion_taller2

fun main(){
 //Entradas
    print("Digite el valor del radio del circulo grande:")
    val r1 = readLine()!!.toDouble()
    print("Digite el valor del radio del circulo pequeño:")
    val r2 = readLine()!!.toDouble()
    //Salidas
    print("El area de la corona circular es: ${area_corona(r1, r2)}")

}

fun area_corona (r1:Double, r2: Double): Double{
    val area1 = Math.PI * Math.pow(r1,2.0)
    val area2 = Math.PI * Math.pow(r2,2.0)
    var a = area1 - area2
    return a
}