package org.training.speedrun.stage6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Stage6Test {

    @Test
    void long_words_are_eligible_if_they_have_4_vowels() {
        assertThat(new Stage6().isEligible("azertyuiopqsdfg")).isTrue();
    }

    @Test
    void long_words_are_eligible_if_they_have_at_least_3_special_letters() {
        assertThat(new Stage6().isEligible("rzmztypopqsdfg")).isTrue();
    }

    @Test
    void short_words_are_eligible_if_they_have_at_least_5_letters_in_upper_case() {
        assertThat(new Stage6().isEligible("PlKZMZ")).isTrue();
    }

    @Test
    void short_words_are_eligible_if_they_have_3_vowels() {
        assertThat(new Stage6().isEligible("aeio")).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"pazof", "AOJGKFLDLFMG", "", "oplm", "lkoirp"})
    void other_words_are_not_elligible(String word) {
        assertThat(new Stage6().isEligible(word)).isFalse();
    }
}
