package org.training.speedrun.stage1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Stage1Test {

    @Test
    void fizzbuzz_for_22() {
        String fizzBuzzFor22 = new Stage1().fizzBuzz(22);
        assertThat(fizzBuzzFor22).isEqualTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz,Fizz,22");
    }
}
