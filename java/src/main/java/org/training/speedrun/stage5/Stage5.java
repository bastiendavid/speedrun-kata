package org.training.speedrun.stage5;

import java.util.Arrays;
import java.util.List;

/**
 * Refactor this code until all methods body is <= 5 lines, and you find the code clean.
 */
public class Stage5 {

    boolean isEligible(String word) {
        if (word.length() >= 10) {
            List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
            long nbVowels = word.chars().mapToObj(c -> (char) c).filter(vowels::contains).count();
            if (nbVowels >= 4) {
                return true;
            } else {
                List<Character> specialLetters = Arrays.asList('p', 'm');
                long nbSpecialLetters = word.chars().mapToObj(c -> (char) c).filter(specialLetters::contains).count();
                if (nbSpecialLetters >= 3) {
                    return true;
                }
            }
        } else {
            long nbLettersInUpperCase = word.chars().filter(c -> c >= 'A' && c <= 'Z').count();
            if (nbLettersInUpperCase >= 5) {
                return true;
            } else {
                List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
                long nbVowels = word.chars().mapToObj(c -> (char) c).filter(vowels::contains).count();
                if (nbVowels >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
