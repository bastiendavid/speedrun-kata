package org.training.speedrun.stage5

import java.util.*

/**
 * Refactor this code until all methods body is <= 5 lines, and you find the code clean.
 */
class Stage5 {

    fun isEligible(word: String): Boolean {
        if (word.length >= 10) {
            val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
            val nbVowels = word.filter { vowels.contains(it) }.count()
            if (nbVowels >= 4) {
                return true
            } else {
                val specialLetters = listOf('p', 'm')
                val nbSpecialLetters = word.filter { specialLetters.contains(it) }.count()
                if (nbSpecialLetters >= 3) {
                    return true
                }
            }
        } else {
            val nbLettersInUpperCase = word.chars().filter { c -> c >= 'A'.toInt() && c <= 'Z'.toInt() }.count()
            if (nbLettersInUpperCase >= 5) {
                return true
            } else {
                val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
                val nbVowels = word.filter { vowels.contains(it) }.count()
                if (nbVowels >= 3) {
                    return true
                }
            }
        }
        return false
    }
}
