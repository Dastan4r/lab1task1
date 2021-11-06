import kotlin.math.ln;
import kotlin.math.sin;
import kotlin.math.pow;
import kotlin.math.abs;

fun main() {
    firstVar7Function();
    secondVar7Function();
}

fun firstVar7Function () {
    println("Введите занчение z");
    var line = readLine()

    if(line != null) {
        try {
            var z = line.toInt();

            var topFraction = ((10.toDouble().pow(-7)) * ln(abs(2*z).toDouble())) + sin(2 * z.toDouble().pow(3));
            var bottomFraction = (3*(z+3).toDouble().pow(2)) + (2.1 * 10.toDouble().pow(7));
            var result = topFraction/bottomFraction;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar7Function () {
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

            var result  = abs(x + z).toDouble() > 1 && b in 2..1;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}