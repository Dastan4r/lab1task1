import kotlin.math.*

fun main() {
    firstVar25Function();
    secondVar25Function();
}

fun firstVar25Function () {
    println("Введите занчение z");
    var firstArgument = readLine()

    if(firstArgument != null) {
        try {
            var z = firstArgument.toInt();

            var topFraction = (10.0.pow(-6) * ln(abs(z.toDouble().pow(3)))) + ln(z.toDouble().pow(3)).pow(2)
            var bottomFraction = (6 * (z + 1).toDouble().pow(6)) + 10.0.pow(6);
            var result = topFraction/bottomFraction;

            println(result)
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar25Function () {
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

            var result  = cos(abs(x + z).toDouble()) > 0 || b in 3..0;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}