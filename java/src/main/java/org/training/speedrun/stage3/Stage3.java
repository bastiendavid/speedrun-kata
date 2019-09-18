package org.training.speedrun.stage3;

import java.util.Arrays;

/**
 * Uncomment the tests, and make them pass
 */
public class Stage3 {

    enum Items {
        POTATO(1),
        TOMATO(2),
        LETTUCE(2),
        APPLE(1),
        BANANA(3),
        PEER(2);

        final int price;

        Items(int price) {
            this.price = price;
        }
    }
}
