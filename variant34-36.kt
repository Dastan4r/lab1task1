import kotlin.math.*

fun main() {
    firstVar34Function();
    secondVar34Function();
}

fun firstVar34Function () {
    println("Введите занчение z");
    var firstArgument = readLine()
    println("Введите занчение f");
    var secondArgument = readLine()
    println("Введите занчение e");
    var thirdArgument = readLine()

    if(firstArgument != null && secondArgument != null && thirdArgument != null) {
        try {
            var z = firstArgument.toInt();
            var f = secondArgument.toInt();
            var e = thirdArgument.toInt();

            var topFraction = (10.0.pow(-5) * e.toDouble().pow(-3 * f)) + ln(abs(z.toDouble().pow(-3)))
            var bottomFraction = 2 * (z + 2).toDouble().pow(2.5);
            var result = topFraction/bottomFraction;

            println(result)
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar34Function () {
    println("Введите занчение x");
    var firstArgument = readLine()
    println("Введите занчение z");
    var secondArgument = readLine()
    println("Введите занчение f");
    var thirdArgument = readLine()

    if(firstArgument != null && secondArgument != null && thirdArgument != null) {
        try {
            var x = firstArgument.toInt();
            var z = firstArgument.toInt();
            var f = thirdArgument.toInt();

            var result  = x + z < 0 || f.toDouble() in 0.2..0.0;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}