import kotlin.math.*

fun main() {
    firstVar31Function();
    secondVar31Function();
}

fun firstVar31Function () {
    println("Введите занчение z");
    var firstArgument = readLine()

    if(firstArgument != null) {
        try {
            var z = firstArgument.toInt();

            var topFraction = (ln(abs(4 * z).toDouble())) + atan(2 * z.toDouble()).pow(3)
            var bottomFraction =(4 * (z + 1).toDouble().pow(0.2)) + 1.7 * 10.0.pow(3)
            var result = topFraction/bottomFraction;

            println(result)
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar31Function () {
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

            var result  = abs(x + z).toDouble() > 0 || b in 7..0;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}