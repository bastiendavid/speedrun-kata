package org.training.speedrun.stage3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Stage3Test {

    private Stage3 stage3 = new Stage3();

//    @ParameterizedTest
//    @MethodSource("provideCarts")
//    void compute_price(Stage3.Items[] cart, int expectedPrice) {
//        // When
//        int price = stage3.computePrice(cart);
//        // Then
//        assertThat(price).isEqualTo(expectedPrice);
//    }

    private static Stream<Arguments> provideCarts() {
        return Stream.of(
                Arguments.of(new Stage3.Items[]{Stage3.Items.APPLE, Stage3.Items.TOMATO, Stage3.Items.BANANA}, 6),
                Arguments.of(new Stage3.Items[]{Stage3.Items.POTATO, Stage3.Items.POTATO}, 2),
                Arguments.of(new Stage3.Items[]{Stage3.Items.LETTUCE, Stage3.Items.TOMATO, Stage3.Items.POTATO}, 5),
                Arguments.of(new Stage3.Items[]{Stage3.Items.APPLE, Stage3.Items.PEER, Stage3.Items.BANANA, Stage3.Items.PEER}, 8));
    }

}
