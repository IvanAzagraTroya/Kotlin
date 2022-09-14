fun main(args: Array<String>) {
    print("Introduce el primer número: ")
    var n1 = readLine()!!.toInt()
    print("Introduce el segundo número: ")
    var n2 = readLine()!!.toInt()

    for (num in n1..n2) {
        var resultado = 0
        println("valor: " + num)
        for (i in n1..num) {
            resultado = num*i
            println("Resultado de ${num} * ${i}: ${resultado}")
        }
    }
    println("FIN EJERCICIO NÚMEROS.")
    println("------------------------------------------------")
    println("EJERCICIO DE REGEX")

    println("Introduce el email")

    var email = readln()
    if(email.matches(Regex("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}"))){
        println("Email válido")
    } else {
        println("Email inválido")
    }

    println("Introduce el número de la tarjeta")
    var dni = readln()
    dni = when {
        dni.matches(Regex("[0-9]{10}[A-Za-z]{1}")) -> "dni válido"
        else -> "dni inválido"
    }
    println("Valor de dni: ${dni}")

}