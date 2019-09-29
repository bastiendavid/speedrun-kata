package org.training.speedrun.stage1;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Stage1Test {

    private Stage1 stage1 = new Stage1();

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
                Arguments.of(new Stage1.Items[]{Stage1.Items.APPLE, Stage1.Items.TOMATO, Stage1.Items.BANANA}, 6),
                Arguments.of(new Stage1.Items[]{Stage1.Items.POTATO, Stage1.Items.POTATO}, 2),
                Arguments.of(new Stage1.Items[]{Stage1.Items.LETTUCE, Stage1.Items.TOMATO, Stage1.Items.POTATO}, 5),
                Arguments.of(new Stage1.Items[]{Stage1.Items.APPLE, Stage1.Items.PEER, Stage1.Items.BANANA, Stage1.Items.PEER}, 8));
    }

}
