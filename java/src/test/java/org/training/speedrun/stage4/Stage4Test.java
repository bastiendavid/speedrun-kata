package org.training.speedrun.stage4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Stage4Test {

    private final Stage4 stage4 = new Stage4();

    private static Stream<Arguments> generateCart() {
        return Stream.of(
                Arguments.of(new double[]{}, false, false, 0),
                Arguments.of(new double[]{2, 3}, false, false, 5),
                Arguments.of(new double[]{10, 10}, true, true, 15),
                Arguments.of(new double[]{10, 10}, true, false, 19),
                Arguments.of(new double[]{10, 10}, false, true, 16),
                Arguments.of(new double[]{1, 1, 1, 1, 1}, false, false, 4.8),
                Arguments.of(new double[]{1, 1, 1, 1, 1}, true, false, 4.55),
                Arguments.of(new double[]{1, 1, 1, 1, 1}, false, true, 3.8),
                Arguments.of(new double[]{1, 1, 1, 1, 1}, true, true, 3.55),
                Arguments.of(new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, false, 18),
                Arguments.of(new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, false, 17),
                Arguments.of(new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, true, 14),
                Arguments.of(new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, true, 13)
        );
    }

    @ParameterizedTest
    @MethodSource("generateCart")
    void compute_cart_price(double[] c, boolean v, boolean b, double expectedPrice) {
        Assertions.assertThat(stage4.compute(c, v, b)).isEqualTo(expectedPrice);
    }
}
