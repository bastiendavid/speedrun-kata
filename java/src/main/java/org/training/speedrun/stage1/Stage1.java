package org.training.speedrun.stage1;

/**
 * Uncomment the tests, and make them pass
 */
public class Stage1 {

    enum Items {
        POTATO(1),
        TOMATO(2),
        LETTUCE(2),
        APPLE(1),
        BANANA(3),
        PEER(2);

        private final int price;

        Items(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
}
