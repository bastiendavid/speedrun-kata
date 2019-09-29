package org.training.speedrun.stage1

import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

internal class Stage1Test {

    private val stage1 = Stage1()

//    @ParameterizedTest
//    @MethodSource("provideCarts")
//    fun compute_price(cart: Array<Stage1.Items>, expectedPrice: Int) {
//        // When
//        val price = stage1.computePrice(cart)
//        // Then
//        assertThat(price).isEqualTo(expectedPrice)
//    }

    private fun provideCarts(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(arrayOf(Stage1.Items.APPLE, Stage1.Items.TOMATO, Stage1.Items.BANANA), 6),
            Arguments.of(arrayOf(Stage1.Items.POTATO, Stage1.Items.POTATO), 2),
            Arguments.of(arrayOf(Stage1.Items.LETTUCE, Stage1.Items.TOMATO, Stage1.Items.POTATO), 5),
            Arguments.of(arrayOf(Stage1.Items.APPLE, Stage1.Items.PEER, Stage1.Items.BANANA, Stage1.Items.PEER), 8)
        )
    }

}
