fun main() {
    println("Введите номер варианта 7-11");
    var maxValue: String? = readLine();

    if(maxValue != null) {
        var divider: Int = maxValue.toInt();
        var count = 0;

        for (i in 10..100 step 2 ) {
            if( i % divider == 0) {
                count += i;
            }
        }

        println(count);
    }
}