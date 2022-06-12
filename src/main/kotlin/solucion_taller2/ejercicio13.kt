package solucion_taller2

fun main(){
    //Entradas
     print("Digite el sueldo del empleado:")
    val sueldo = readLine()!!.toDouble()
    //Salidas
    println("El aumento del empleado es: ${salario(sueldo)}")

}

fun salario (sueldo:Double): Pair<Double, Double>{
    if(sueldo <= 800000.0){
        val aumento = sueldo * 0.1
        val nuevoSueldo = sueldo + aumento
        return Pair(aumento,nuevoSueldo)
    }else if(sueldo > 800000.0 && sueldo <= 1200000.0){
        val aumento = sueldo * 0.08
        val nuevoSueldo = sueldo + aumento
        return Pair(aumento,nuevoSueldo)
    }else{
        val aumento = sueldo * 0.05
        val nuevoSueldo = sueldo + aumento
        return Pair(aumento,nuevoSueldo)
    }
}

