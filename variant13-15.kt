import kotlin.math.cos;
import kotlin.math.pow;
import kotlin.math.abs;

fun main() {
    firstVar13Function();
    secondVar13Function();
}

fun firstVar13Function () {
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

            var topFraction = (10.0.pow(-5) * e.toDouble().pow(-5* f)) + ((1 - cos(2 * abs(z.toDouble().pow(3)))) / 2);
            var bottomFraction = (5 * (z + 1.0).pow(5)) + 10.0.pow(6);
            var result = topFraction/bottomFraction;

            println(result)
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar13Function () {
    println("Введите занчение x");
    var firstArgument = readLine()
    println("Введите занчение z");
    var secondArgument = readLine()
    println("Введите занчение f");
    var thirdArgument = readLine();

    if(firstArgument != null && secondArgument != null && thirdArgument != null) {
        try {
            var x = firstArgument.toInt();
            var z = firstArgument.toInt();
            var f = thirdArgument.toInt();

            var result = x + z < 0 || f.toDouble() in 0.2..0.0;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}