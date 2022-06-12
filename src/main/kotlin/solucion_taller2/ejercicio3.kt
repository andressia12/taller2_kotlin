package solucion_taller2
import kotlin.math.sin
fun main(){
    //Entradas
    print("Digite el angulo de inclinacion:")
    val tetha = readLine()!!.toDouble()
    print("Digite la altura:")
    val altura = readLine()!!.toDouble()
    //Salidas
    print("La longitud de la escalera es: ${inclinacion(tetha,altura)}")
}
fun inclinacion (tetha:Double, altura:Double):Double{
    var y = altura/ sin(tetha)
    return y
}

