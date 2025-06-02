package rk.powermilk

/**
 * Function extension to jump over [IntArray] and calculate not visited indices.
 */
fun IntArray.jump(): Int {
    var index = 0
    val visited = BooleanArray(size)
    var count = 0

    while (index in indices && !visited[index]) {
        visited[index] = true
        count++
        index += this[index]
    }

    return size - count
}

