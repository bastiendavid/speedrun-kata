package org.training.speedrun.stage3

/**
 * Remove all the code duplications.
 */
class Stage3 {

    fun doTheThing(input: String): String {

        var result: String
        if (input.length % 2 == 0) {
            result = input.replace('A', 'a')
            result = result.replace('E', 'e')
            val prefix = "even"
            result = result.replace('I', 'i')
            result = result.replace('O', 'o')
            result = result.replace('U', 'u')
            result = result.replace('Y', 'y')
            if (result.length < 10) {
                result = prefix + "_" + result
                result = "short_$result"
            } else {
                result = prefix + "_" + result
                result = "long_$result"
            }
        } else {
            result = input.replace('A', 'a')
            val prefix = "odd"
            result = result.replace('E', 'e')
            result = result.replace('I', 'i')
            result = result.replace('O', 'o')
            result = result.replace('U', 'u')
            result = result.replace('Y', 'y')
            if (result.length < 10) {
                result = prefix + "_" + result
                result = "short_" + result
            } else {
                result = prefix + "_" + result
                result = "long_" + result
            }
        }
        return result
    }
}
