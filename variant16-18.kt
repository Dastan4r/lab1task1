import kotlin.math.ln;
import kotlin.math.pow;
import kotlin.math.abs;
import kotlin.math.cos;

fun main() {
    firstVar16Function();
    secondVar16Function();
}

fun firstVar16Function () {
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

            var topFraction = (10.0.pow(-4) * e.toDouble().pow(-2 * f)) + ln(abs(z.toDouble().pow(3)))
            var bottomFraction = 2 * (z + 2).toDouble().pow(1.5);
            var result = topFraction/bottomFraction;

            println(result)
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar16Function () {
    println("Введите занчение x");
    var firstArgument = readLine()
    println("Введите занчение z");
    var secondArgument = readLine()
    println("Введите занчение b");
    var thirdArgument = readLine();

    if(firstArgument != null && secondArgument != null && thirdArgument != null) {
        try {
            var x = firstArgument.toInt();
            var z = firstArgument.toInt();
            var b = thirdArgument.toInt();

            var result = cos(abs(x + z).toDouble()) > 0 || b in 3..0

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}