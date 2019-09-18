package org.training.speedrun.stage4;

/**
 * Remove all the code duplications.
 */
public class Stage4 {

    public String doTheThing(String input) {

        String result;
        if (input.length() % 2 == 0) {
            result = input.replace('A', 'a');
            result = result.replace('E', 'e');
            String prefix = "even";
            result = result.replace('I', 'i');
            result = result.replace('O', 'o');
            result = result.replace('U', 'u');
            result = result.replace('Y', 'y');
            if (result.length() < 10) {
                result = prefix + "_" + result;
                result = "short" + "_" + result;
            } else {
                result = prefix + "_" + result;
                result = "long" + "_" + result;
            }
        } else {
            result = input.replace('A', 'a');
            String prefix = "odd";
            result = result.replace('E', 'e');
            result = result.replace('I', 'i');
            result = result.replace('O', 'o');
            result = result.replace('U', 'u');
            result = result.replace('Y', 'y');
            if (result.length() < 10) {
                result = prefix + "_" + result;
                result = "short_" + result;
            } else {
                result = prefix + "_" + result;
                result = "long_" + result;
            }
        }
        return result;
    }
}
