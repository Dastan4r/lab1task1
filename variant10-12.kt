import kotlin.math.ln;
import kotlin.math.pow;
import kotlin.math.abs;

fun main() {
    firstVar10Function();
    secondVar10Function();
}

fun firstVar10Function () {
    println("Введите занчение z");
    var firstArgument = readLine();
    println("Введите занчение b");
    var secondArgument = readLine();

    if(firstArgument != null && secondArgument != null) {
        try {
            var z = firstArgument.toInt();
            var b = secondArgument.toInt();

            var topFraction = ((10.toDouble().pow(-7)) * ln(abs(2*z).toDouble())) + b.toDouble().pow(0.4);
            var bottomFraction = (ln(z + 1.0).pow(2))  + (4.2 * 10.0.pow(4));
            var result = topFraction/bottomFraction;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar10Function () {
    println("Введите занчение x");
    var firstArgument = readLine()
    println("Введите занчение b");
    var secondArgument = readLine();

    if(firstArgument != null && secondArgument != null) {
        try {
            var x = firstArgument.toInt();
            var b = secondArgument.toInt();

            var result  = abs(x) > 2 || b in 3..0;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}