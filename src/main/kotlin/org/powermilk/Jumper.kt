package org.powermilk

/**
 * Function extension to jump over [IntArray] and calculate not visited indices.
 */
fun IntArray.jump(): Int {
    var index = 0
    val visited = mutableSetOf<Int>()
    while (index in indices) {
        visited.add(index)
        index += get(index)
        if (visited.contains(index))
            break
    }
    return size - visited.size
}
