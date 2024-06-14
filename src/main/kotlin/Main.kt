
package org.example;


fun main(args: Array<String>) {
    val num = 10;
    val num2: Int = 5;
    val num3 = 7f;
    var num4 : Float = 13.14f;
    var resultado = num + num4

    resultado = num2.toFloat() + num.toInt()

    print("Esto es una suma: " +  (num + num2 ) + "\n")
    print("Esto es una resta: " +  (num - num2 ) + "\n")
    print("Esto es una multiplicacion: " +  (num * num2 ) + "\n")
    print("Esto es una división: ${num + num2}" + "\n")
    print("Este es el mudulo resto (%): " +  (num % num3 ) + "\n")
    print("Esta es la variable resultado: " + resultado)

}
