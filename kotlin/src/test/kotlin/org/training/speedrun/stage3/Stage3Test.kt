package org.training.speedrun.stage3

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class Stage3Test {

    private val stage3 = Stage3()

    @ParameterizedTest
    @CsvSource(
        "aeiou,short_odd_aeiou",
        "AEIOUY,short_even_aeiouy",
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ,long_even_aBCDeFGHiJKLMNoPQRSTuVWXyZ",
        "kjqtrpmnz,short_odd_kjqtrpmnz",
        "kjqtrpmnzr,long_even_kjqtrpmnzr",
        "kjqtrApmnzsr,long_even_kjqtrapmnzsr"
    )
    fun doTheThing_transforms_the_input_string(input: String, output: String) {
        assertThat(stage3.doTheThing(input)).isEqualTo(output)
    }

    @Test
    fun doTheThing_transforms_an_empty_string() {
        assertThat(stage3.doTheThing("")).isEqualTo("short_even_")
    }
}

