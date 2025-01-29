package CodeChef

fun main() {
    // Read the input line and split it into parts by space
    val input = readLine()?.split(" ") ?: return

    // Convert the parts into integers
    val N = input[0].toInt()
    val K = input[1].toInt()

    // Calculate the prize money
    val prizeMoney = (N - K) * 10000

    // Output the result
    println(prizeMoney)
}