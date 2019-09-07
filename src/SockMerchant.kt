import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/**
John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
Given an array of integers representing the color of each sock,
determine how many pairs of socks with matching colors there are.

For example, there are n = 7 socks with colors ar = [1,2,1,2,1,3,2]. There is one pair of color 1 and one of color 2 .
There are three odd socks left, one of each color. The number of pairs is 2.

Function Description

Complete the sockMerchant function in the editor below.
It must return an integer representing the number of matching pairs of socks that are available.
sockMerchant has the following parameter(s):
n: the number of socks in the pile
ar: the colors of each sock

Input Format

The first line contains an integer n, the number of socks represented in ar.
The second line contains n space-separated integers describing the colors ar[i] of the socks in the pile.

Output Format

Return the total number of matching pairs of socks that John can sell.
**/
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val arrayList = ar.toMutableList()
    var count = 0
    while (arrayList.size > 1){
        val aux = checkWtihTheOthers(arrayList[0], arrayList)
        if (aux != -1){
            count ++
            arrayList.removeAt(aux)
            arrayList.removeAt(0)
        }else{
            arrayList.removeAt(0)
        }
    }
    return count
}

private fun checkWtihTheOthers(value: Int, array: MutableList<Int>): Int {
    for ((index, item) in array.withIndex()){
        if (index == 0) continue
        if (value == item) {
            return index
        }
    }
    return -1
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}