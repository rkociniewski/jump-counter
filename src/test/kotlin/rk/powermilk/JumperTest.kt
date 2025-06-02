package rk.powermilk

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JumperTest {
    @ParameterizedTest(name = "{index} => array={0}, expected={1}")
    @MethodSource("arraysProvider")
    fun `should pass`(array: IntArray, expected: Int) = assertEquals(expected, array.jump())

    private fun arraysProvider() = listOf(
        // Edge and basic cases
        Arguments.of(intArrayOf(), 0),                            // Empty array
        Arguments.of(intArrayOf(1), 0),                           // One jump out of bounds
        Arguments.of(intArrayOf(0), 0),                           // Infinite loop on itself
        Arguments.of(intArrayOf(100), 0),                         // Immediate jump out of bounds

        // Cases with cycles and loops
        Arguments.of(intArrayOf(1, 1, -1, 1), 1),                 // Loop between indices
        Arguments.of(intArrayOf(3, -5, 0, -1, -3), 2),            // Complex jumps, ends out of bounds
        Arguments.of(intArrayOf(2, 3, 1, 1, 3), 1),               // Forward jumps ending in a loop
        Arguments.of(intArrayOf(1, 2, 3), 1),                     // Jumps: 0→1→3 (out of bounds)

        // Full cycles
        Arguments.of(intArrayOf(1, 1, 1, 1, 1, -5), 0),           // Full cycle covering all indices
        Arguments.of(intArrayOf(2, 2, -1, -1), 0),                // Loop: 0→2→1→3→2...

        // Negative jumps and quick exits
        Arguments.of(intArrayOf(3, -10, 2, 2), 2),                // Ends out of bounds after a few steps

        // Large arrays
        Arguments.of(IntArray(100) { 1 }, 0),                     // Visits all indices one by one
        Arguments.of(IntArray(100) { 100 }, 99),                 // Immediate exit, only index 0 visited
    )
}
