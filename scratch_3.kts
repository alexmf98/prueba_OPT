print("Dame un numero ")
val numero = readLine()?.toInt()

if(numero != null){
    if(numero < 0){
        print("El numero es negativo")
    }else if(numero > 0){
        print("El numero es positivo")
    }else{
        print("El numero es cero")
    }
}