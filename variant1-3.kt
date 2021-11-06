import kotlin.math.ln;
import kotlin.math.atan;
import kotlin.math.pow;
import kotlin.math.abs;

fun main() {
    firstVar1Function();
    secondVar1Function();
}

fun firstVar1Function () {
    println("Введите занчение z");
    var line = readLine()

    if(line != null) {
        try {
            var z = line.toInt();

            var topFraction = ln(abs(2*z.toDouble())) + atan(2*(z.toDouble().pow(2)));
            var bottomFraction = (3*(z+1).toDouble().pow(2)) + (2.1 * 10.toDouble().pow(7));
            var result = topFraction/bottomFraction;

            println(result)
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}

fun secondVar1Function () {
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

            var result  = ln(abs(x + z).toDouble()) > 0 && b in 1..0;

            println(result);
        }
        catch(e: Exception){
            println("Пожалуйста введите числовое значение");
        }
    }
}
