package org.powermilk

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JumperTest {
    @ParameterizedTest
    @MethodSource("arrays")
    fun `should pass`(array: IntArray, expected: Int) = assertEquals(expected, array.jump())

    private fun arrays() = listOf(
        Arguments.of(intArrayOf(), 0),
        Arguments.of(intArrayOf(1, 2, 3), 1),
        Arguments.of(intArrayOf(3, -5, 0, -1, -3), 2),
        Arguments.of(intArrayOf(2, 3, 1, 1, 3), 1),
        Arguments.of(intArrayOf(1, 1, -1, 1), 1)
    )
}
