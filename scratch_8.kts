fun main(){
    var listaCompra: MutableList<String> = mutableListOf()

    println(listaCompra)

    listaCompra.add("Patata")
    listaCompra.add("Tomate")
    listaCompra.add("Lechuga")

    println(listaCompra)

    listaCompra.remove("Tomate")

    print(listaCompra)

}

main()