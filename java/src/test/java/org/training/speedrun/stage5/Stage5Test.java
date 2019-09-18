package org.training.speedrun.stage5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Stage5Test {

    private static Stream<Arguments> generateCart() {
        return Stream.of(
                Arguments.of(new double[]{}, false, false, 0),
                Arguments.of(new double[]{2, 3}, false, false, 5),
                Arguments.of(new double[]{10, 10}, true, true, 25),
                Arguments.of(new double[]{10, 10}, true, false, 21),
                Arguments.of(new double[]{10, 10}, false, true, 24),
                Arguments.of(new double[]{1, 1, 1, 1, 1}, false, false, 5.2),
                Arguments.of(new double[]{1, 1, 1, 1, 1}, true, false, 5.45),
                Arguments.of(new double[]{1, 1, 1, 1, 1}, false, true, 6.2),
                Arguments.of(new double[]{1, 1, 1, 1, 1}, true, true, 6.45),
                Arguments.of(new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, false, 22),
                Arguments.of(new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, false, 23),
                Arguments.of(new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, true, 26),
                Arguments.of(new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, true, 27)
        );
    }

    @ParameterizedTest
    @MethodSource("generateCart")
    void compute_cart_price(double[] c, boolean v, boolean b, double expectedPrice) {
        Assertions.assertThat(new Stage5().compute(c, v, b)).isEqualTo(expectedPrice);
    }
}
