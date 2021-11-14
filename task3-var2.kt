fun main() {
    println("Введите номер варианта 2-6");
    var maxValue: String? = readLine();

    if(maxValue != null) {
        var maxLoopValue: Int = maxValue.toInt() * 50;
        var count = 0;

        for (i in 2..maxLoopValue step 2 ) {
            count += i;
        }

        println(count);
    }
}