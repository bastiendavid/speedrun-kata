package org.training.speedrun.stage5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class Stage5Test {

    private val stage5 = Stage5()

    @Test
    fun long_words_are_eligible_if_they_have_4_vowels() {
        assertThat(stage5.isEligible("azertyuiopqsdfg")).isTrue()
    }

    @Test
    fun long_words_are_eligible_if_they_have_at_least_3_special_letters() {
        assertThat(stage5.isEligible("rzmztypopqsdfg")).isTrue()
    }

    @Test
    fun short_words_are_eligible_if_they_have_at_least_5_letters_in_upper_case() {
        assertThat(stage5.isEligible("PlKZMZ")).isTrue()
    }

    @Test
    fun short_words_are_eligible_if_they_have_3_vowels() {
        assertThat(stage5.isEligible("aeio")).isTrue()
    }

    @ParameterizedTest
    @ValueSource(strings = ["pazof", "AOJGKFLDLFMG", "", "oplm", "lkoirp"])
    fun other_words_are_not_elligible(word: String) {
        assertThat(stage5.isEligible(word)).isFalse()
    }
}
