/**
 * Refactor this code until all methods body is <= 5 lines, and you find the code clean.
 */

#include <cstring>
#include "Stage5.hpp"

bool Stage5::isEligible(const std::string& word) {
  if (word.length() >= 10) {
    int charsNb = 0;
    const char *wordStr = word.c_str();
    while (*wordStr) {
      if (strspn(wordStr, "aeiouy")) {
        charsNb++;
      }
      wordStr++;
    }
    long nbVowels = charsNb;
    if (nbVowels >= 4) {
      return true;
    } else {
      int charsNb1 = 0;
      const char *wordStr1 = word.c_str();
      while (*wordStr1) {
        if (strspn(wordStr1, "pm")) {
          charsNb1++;
        }
        wordStr1++;
      }
      long nbSpecialLetters = charsNb1;;
      if (nbSpecialLetters >= 3) {
        return true;
      }
    }
  } else {
    int charsNb = 0;
    const char *wordStr = word.c_str();
    while (*wordStr) {
      if (strspn(wordStr, "ABCDEFGHIJKLMNOPQRSTUVWXYZ")) {
        charsNb++;
      }
      wordStr++;
    }
    long nbLettersInUpperCase = charsNb;
    if (nbLettersInUpperCase >= 5) {
      return true;
    } else {
      int charsNb1 = 0;
      const char *wordStr1 = word.c_str();
      while (*wordStr1) {
        if (strspn(wordStr1, "aeiouy")) {
          charsNb1++;
        }
        wordStr1++;
      }
      long nbVowels = charsNb1;
      if (nbVowels >= 3) {
        return true;
      }
    }
  }
  return false;
}
