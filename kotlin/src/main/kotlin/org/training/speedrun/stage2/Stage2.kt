package org.training.speedrun.stage2

/**
 * Refactor until there is only one level of indentation, you think the code is clean, and all the tests pass.
 */
class Stage2 {

    internal fun computeScore(dice1: Int, dice2: Int, dice3: Int): Int {
        val score: Int
        if (dice1 == dice2 && dice1 == dice3) {
            score = 0
        } else {
            if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
                score = (dice1 + dice2 + dice3) * 2
            } else {
                if (dice1 == 1 && dice2 == 2 && dice3 == 3) {
                    score = 100
                } else {
                    if (dice1 == 1 && dice2 == 3 && dice3 == 2) {
                        score = 100
                    } else {
                        if (dice1 == 2 && dice2 == 1 && dice3 == 3) {
                            score = 100
                        } else {
                            if (dice1 == 2 && dice2 == 3 && dice3 == 1) {
                                score = 100
                            } else {
                                if (dice1 == 3 && dice2 == 1 && dice3 == 2) {
                                    score = 100
                                } else {
                                    if (dice1 == 3 && dice2 == 2 && dice3 == 1) {
                                        score = 100
                                    } else {
                                        score = dice1 + dice2 + dice3
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return score
    }
}
