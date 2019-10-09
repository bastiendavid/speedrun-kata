#include <algorithm>
#include "Stage3.hpp"
/**
 * Remove all the code duplications.
 */
 std::string Stage3::doTheThing(const std::string& input) {

      std::string result = input;
      if (input.length() % 2 == 0) {
        std::replace(result.begin(), result.end(), 'A', 'a');
        std::replace(result.begin(), result.end(), 'E', 'e');
        std::string prefix = "even";
        std::replace(result.begin(), result.end(), 'I', 'i');
        std::replace(result.begin(), result.end(), 'O', 'o');
        std::replace(result.begin(), result.end(), 'U', 'u');
        std::replace(result.begin(), result.end(), 'Y', 'y');
        if (result.length() < 10) {
          result = prefix + "_" + result;
          result = "short_" + result;
        } else {
          result = prefix + "_" + result;
          result = "long_" + result;
        }
      } else {
        std::replace(result.begin(), result.end(), 'A', 'a');
        std::replace(result.begin(), result.end(), 'E', 'e');
        std::string prefix = "odd";
        std::replace(result.begin(), result.end(), 'I', 'i');
        std::replace(result.begin(), result.end(), 'O', 'o');
        std::replace(result.begin(), result.end(), 'U', 'u');
        std::replace(result.begin(), result.end(), 'Y', 'y');
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

