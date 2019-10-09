/**
 * Refactor this code until all methods body is <= 5 lines, and you find the code clean.
 */

#include <cstring>
#include "Stage5.hpp"

/**
 * Returns the number of characters contained in @chars found in @word
 * @param word
 * @param chars
 * @return
 */
int Stage5::countChars(const std::string& word, const std::string& chars) {
  int charsNb = 0;
  const char* wordStr = word.c_str();
  while(*wordStr){
    if(strspn(wordStr, chars.c_str())) {
      charsNb++;
    }
    wordStr++;
  }
  return charsNb;
}

bool Stage5::isEligible(const std::string& word) {
  if (word.length() >= 10) {
    long nbVowels = countChars(word, "aeiouy");
    if (nbVowels >= 4) {
      return true;
    } else {
      long nbSpecialLetters = countChars(word, "pm");;
      if (nbSpecialLetters >= 3) {
        return true;
      }
    }
  } else {
    long nbLettersInUpperCase = countChars(word, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    if (nbLettersInUpperCase >= 5) {
      return true;
    } else {
      long nbVowels = countChars(word, "aeiouy");
      if (nbVowels >= 3) {
        return true;
      }
    }
  }
  return false;
}
