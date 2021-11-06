import kotlin.math.*

fun main() {
    firstVar28Function();
    secondVar28Function();
}

fun firstVar28Function () {
    println("Введите занчение z");
    var firstArgument = readLine()

    if(firstArgument != null) {
        try {
            var z = firstArgument.toInt();

            var topFraction = (10.0.pow(-7) * ln(abs(3 * z.toDouble().pow(3)))) + sin(2 * z.toDouble().pow(2))
            var bottomFraction = (z + 1).toDouble().pow(0.5) + 10.0.pow(6)
            var result = topFraction/bottomFraction;

            println(result)
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar28Function () {
    println("Введите занчение x");
    var firstArgument = readLine()
    println("Введите занчение z");
    var secondArgument = readLine()
    println("Введите занчение b");
    var thirdArgument = readLine()

    if(firstArgument != null && secondArgument != null && thirdArgument != null) {
        try {
            var x = firstArgument.toInt();
            var z = firstArgument.toInt();
            var b = thirdArgument.toInt();

            var result  = abs(x + z).toDouble() > 0 || b in 1..0;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}