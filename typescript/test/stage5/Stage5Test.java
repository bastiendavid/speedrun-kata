package org.training.speedrun.stage5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Stage5Test {

    private final Stage5 stage5 = new Stage5();

    @Test
    void long_words_are_eligible_if_they_have_4_vowels() {
        assertThat(stage5.isEligible("azertyuiopqsdfg")).isTrue();
    }

    @Test
    void long_words_are_eligible_if_they_have_at_least_3_special_letters() {
        assertThat(stage5.isEligible("rzmztypopqsdfg")).isTrue();
    }

    @Test
    void short_words_are_eligible_if_they_have_at_least_5_letters_in_upper_case() {
        assertThat(stage5.isEligible("PlKZMZ")).isTrue();
    }

    @Test
    void short_words_are_eligible_if_they_have_3_vowels() {
        assertThat(stage5.isEligible("aeio")).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"pazof", "AOJGKFLDLFMG", "", "oplm", "lkoirp"})
    void other_words_are_not_elligible(String word) {
        assertThat(stage5.isEligible(word)).isFalse();
    }
}
