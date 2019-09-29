package org.training.speedrun.stage2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Stage2Test {

    private val stage2 = Stage2()

    @Test
    fun score_is_zero_if_all_the_dice_have_the_same_value() {
        assertThat(stage2.computeScore(1, 1, 1)).isEqualTo(0)
        assertThat(stage2.computeScore(2, 2, 2)).isEqualTo(0)
        assertThat(stage2.computeScore(3, 3, 3)).isEqualTo(0)
        assertThat(stage2.computeScore(4, 4, 4)).isEqualTo(0)
        assertThat(stage2.computeScore(5, 5, 5)).isEqualTo(0)
        assertThat(stage2.computeScore(6, 6, 6)).isEqualTo(0)
    }

    @Test
    fun score_is_the_sum_of_dice_multiplied_by_3_if_2_dices_have_the_same_value() {
        assertThat(stage2.computeScore(1, 1, 3)).isEqualTo(10)
        assertThat(stage2.computeScore(4, 3, 3)).isEqualTo(20)
        assertThat(stage2.computeScore(2, 5, 5)).isEqualTo(24)
        assertThat(stage2.computeScore(1, 4, 1)).isEqualTo(12)
    }

    @Test
    fun score_is_100_if_dice_are_1_2_3() {
        assertThat(stage2.computeScore(1, 2, 3)).isEqualTo(100)
        assertThat(stage2.computeScore(1, 3, 2)).isEqualTo(100)
        assertThat(stage2.computeScore(2, 1, 3)).isEqualTo(100)
        assertThat(stage2.computeScore(2, 3, 1)).isEqualTo(100)
        assertThat(stage2.computeScore(3, 1, 2)).isEqualTo(100)
        assertThat(stage2.computeScore(3, 2, 1)).isEqualTo(100)
    }

    @Test
    fun score_is_the_sum_of_dice_if_no_specific_rules_apply() {
        assertThat(stage2.computeScore(1, 3, 4)).isEqualTo(8)
        assertThat(stage2.computeScore(2, 5, 3)).isEqualTo(10)
        assertThat(stage2.computeScore(4, 6, 2)).isEqualTo(12)
    }
}

