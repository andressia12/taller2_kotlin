package solucion_taller2

fun main(){
    print("¿Cuál es el día de hoy?")
    val dia = readln()
    print("El día de mañana es ${dia(dia)}")

}

fun dia(x:String)=when(x){
    "Lunes"->"Martes"
    "Martes"->"Miercoles"
    "Miercoles"->"Jueves"
    "Jueves"->"viernes"
    "Sabado"->"Domingo"
    "Domingo"->"Lunes"
    else->"Es un día de la semana"
}