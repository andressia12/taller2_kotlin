package solucion_taller2
public var numero :Int = 0
fun main (){
    var contador  =0
    //Entradas
    print("Digite el numero a descomponer  de dos cifras o menor: ")
    numero = readLine()!!.toInt()
    uni_dec()

    if(numero <= 0 ){
        print("Error, por favor ingrese un numero  mayor a cero  de dos cifras ")
    }else{

        //Salidas
        print("El numero en romano  es  ${equivalente_romano_decenas()}${equivalente_romano_unidades()}")
    }
}

//Item 1
fun uni_dec():Pair<Int,Int>{

        var decenas = numero/10
        var unidades = numero -(decenas*10)

        return Pair(decenas,unidades)
}
//Item 2
fun equivalente_romano_unidades()=


    when(uni_dec().second){

        1-> "I"
        2-> "II"
        3-> "III"
        4-> "IV"
        5-> "V"
        6-> "VI"
        7-> "VII"
        8-> "VIII"
        9-> "IX"
        else->""
}

//Item 3
fun equivalente_romano_decenas()=
    when(uni_dec().first){

    1-> "X"
    2-> "XX"
    3-> "XXX"
    4-> "XL"
    5-> "L"
    6-> "LX"
    7-> "LXX"
    8-> "LXXX"
    9-> "XC"
    else->""
}


