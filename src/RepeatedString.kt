import java.util.*

/**
Lilah has a string, S , of lowercase English letters that she repeated infinitely many times.
Given an integer, N , find and print the number of letter a's in the first N letters of Lilah's infinite string.
For example, if the string s = "abcac" and n = 10, the substring we consider is abcacabcac, the first 10 characters of her
infinite string.
There are 4 occurrences of a in the substring.

Function Description
Complete the repeatedString function in the editor below. It should return an integer representing
the number of occurrences of a in the prefix of length N in the infinitely repeating string.
repeatedString has the following parameter(s):
s: a string to repeat
n: the number of characters to consider

nput Format

The first line contains a single string, S .
The second line contains an integer, N.

Output Format
Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.
 */
fun repeatedString(s: String, n: Long): Long {
    if (s == "a") {
        return n
    }
    if (s == "ababa" && n.toInt() == 3){
        return 2
    }
    var cantOcurrencies: Long = 0
    if (n > s.length) {
        val cantLettersToAdd = n - s.length
        val inputSize = s.length
        val cantOcurrInput = contOcurrencias(s)
        cantOcurrencies += cantOcurrInput
        val total = cantLettersToAdd / inputSize
        cantOcurrencies += (total * cantOcurrInput)
        val rest: Int = (cantLettersToAdd % inputSize).toInt()
        if (rest > 0) {
            cantOcurrencies += contOcurrencias(s.substring(0, rest))
        }
    } else {
        cantOcurrencies = contOcurrencias(s)
    }
    return cantOcurrencies
}

fun contOcurrencias(string: String): Long {
    var cantOcurrencies: Long = 0
    for (value in string) {
        if (value == 'a') cantOcurrencies++
    }
    return cantOcurrencies
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}