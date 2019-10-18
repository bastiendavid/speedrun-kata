package org.training.speedrun.stage1

/**
 * Uncomment the tests, and make them pass
 */
class Stage1 {

    enum class Items private constructor(val price: Int) {
        POTATO(1),
        TOMATO(2),
        LETTUCE(2),
        APPLE(1),
        BANANA(3),
        PEER(2)
    }
}
