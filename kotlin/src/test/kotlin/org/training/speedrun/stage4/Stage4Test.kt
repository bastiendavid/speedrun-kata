package org.training.speedrun.stage4

import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Stage4Test {

    private val stage4 = Stage4()

    companion object {
        @JvmStatic
        private fun generateCart(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(doubleArrayOf(), false, false, 0),
                Arguments.of(doubleArrayOf(2.0, 3.0), false, false, 5),
                Arguments.of(doubleArrayOf(10.0, 10.0), true, true, 15),
                Arguments.of(doubleArrayOf(10.0, 10.0), true, false, 19),
                Arguments.of(doubleArrayOf(10.0, 10.0), false, true, 16),
                Arguments.of(doubleArrayOf(1.0, 1.0, 1.0, 1.0, 1.0), false, false, 4.8),
                Arguments.of(doubleArrayOf(1.0, 1.0, 1.0, 1.0, 1.0), true, false, 4.55),
                Arguments.of(doubleArrayOf(1.0, 1.0, 1.0, 1.0, 1.0), false, true, 3.8),
                Arguments.of(doubleArrayOf(1.0, 1.0, 1.0, 1.0, 1.0), true, true, 3.55),
                Arguments.of(doubleArrayOf(2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0), false, false, 18),
                Arguments.of(doubleArrayOf(2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0), true, false, 17),
                Arguments.of(doubleArrayOf(2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0), false, true, 14),
                Arguments.of(doubleArrayOf(2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0), true, true, 13)
            )
        }
    }



    @ParameterizedTest
    @MethodSource("generateCart")
    fun compute_cart_price(c: DoubleArray, v: Boolean, b: Boolean, expectedPrice: Double) {
        Assertions.assertThat(stage4.compute(c, v, b)).isEqualTo(expectedPrice)
    }
}
