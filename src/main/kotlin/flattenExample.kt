fun simpleFlattenedList(list: List<List<Any>>): List<Any> {
    return list.flatten()
}

fun flattenedArray(array: Array<Array<Int>>): List<Int> {
    return array.flatten()
}

fun main() {
    println(simpleFlattenedList(listOf(listOf(1, 2, 3), listOf("one", "two", "three"))))
    // [1, 2, 3, one, two, three]

    println(flattenedArray(arrayOf(arrayOf(1), arrayOf(2, 3), arrayOf(4, 5))))
    // [1, 2, 3, 4, 5]
}
