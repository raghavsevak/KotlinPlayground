package CodeChef

fun main() {
    val S = readLine()!!.trim() // Read input string S
    val target = "ADVITIYA" // The target string

    var totalSteps = 0

    for (i in S.indices) {
        val currentChar = S[i]
        val targetChar = target[i]

        // Calculate the steps to move from currentChar to targetChar
        val steps = (targetChar - currentChar + 26) % 26
        totalSteps += steps
    }

    // Output the result: the minimum number of steps required
    println(totalSteps)
}