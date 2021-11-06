import kotlin.math.*

fun main() {
    firstVar22Function();
    secondVar22Function();
}

fun firstVar22Function () {
    println("Введите занчение z");
    var firstArgument = readLine()
    println("Введите занчение b");
    var secondArgument = readLine()

    if(firstArgument != null && secondArgument != null) {
        try {
            var z = firstArgument.toInt();
            var b = secondArgument.toInt();

            var topFraction = (10.0.pow(-7) * sin(abs(3 * z).toDouble())) + b.toDouble().pow(1.2);
            var bottomFraction = ((z + 1).toDouble().pow(2)) + (1.2 * 10.0.pow(6));
            var result = topFraction/bottomFraction;

            println(result)
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar22Function () {
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

            var result  = ln(abs(x + z).toDouble()) > 0 || b in 1..0;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}