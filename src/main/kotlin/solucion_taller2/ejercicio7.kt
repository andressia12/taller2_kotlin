package solucion_taller2

fun main(){
    //Entradas
    print("Digite la coordenada x del primer punto :")
    val x1 = readLine()!!.toDouble()
    print("Digite la coordenada y del primer punto :")
    val y1 = readLine()!!.toDouble()
    print("Digite la coordenada x del segundo punto :")
    val x2 = readLine()!!.toDouble()
    print("Digite la coordenada y del segundo punto :")
    val y2 = readLine()!!.toDouble()

    //Salidas
    println("La distancia entre los dos puntos es: ${distancia(x1, y1, x2, y2)}")
    println("La pendiente de la recta es: ${ pendiente_recta(x1, y1, x2, y2) }")
    println("Las cooredenas del punto medio son: ${punto_medio(x1, y1, x2, y2)}")

}

fun distancia (x1:Double,y1:Double, x2:Double, y2:Double):Double{

    val d = Math.pow(y2-y1, 2.0) + Math.pow(x2-x1, 2.0)
    return d
}

fun pendiente_recta(x1:Double,y1:Double, x2:Double, y2:Double):Double{

    val p = (y2-y1)/(x2-x1)
    return p
}

fun punto_medio(x1:Double,y1:Double, x2:Double, y2:Double):Pair<Double,Double>{
    val xm = Math.pow(x1+x2,2.0)
    val ym = Math.pow(y1+y2,2.0)
    return Pair(xm,ym)
}