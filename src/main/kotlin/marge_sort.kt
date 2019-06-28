package sort


fun main(args: Array<String>) {

    val array = readLine()!!.split(" ").map { it.toInt() }

    for (i in margeSort(array)) {
        print(i)
    }
    println()
}

fun margeSort(input: List<Int>): List<Int> {

    val size = input.size

    if (size <= 1) {
        return input
    }

    val middle = size / 2

    val left = input.subList(0, middle)
    val right = input.subList(middle, size)

    return marge(margeSort(left), margeSort(right))

}

fun marge(left: List<Int>, right: List<Int>): List<Int> {

    var leftIndex = 0
    var rightIndex = 0

    val margeList: MutableList<Int> = mutableListOf()


    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] <= right[rightIndex]) {
            margeList.add(left[leftIndex])
            leftIndex++
        } else {
            margeList.add(right[rightIndex])
            rightIndex++
        }
    }

    while (leftIndex < left.size) {
        margeList.add(left[leftIndex])
        leftIndex++
    }

    while (rightIndex < right.size) {
        margeList.add(right[rightIndex])
        rightIndex++
    }

    return margeList.toList()
}