#include "../main/stage5/Stage5.hpp"
#include "gtest/gtest.h"

using namespace testing;
TEST(Stage5Test, long_words_are_eligible_if_they_have_4_vowels) {
  ASSERT_TRUE(Stage5::isEligible("azertyuiopqsdfg"));
}

TEST(Stage5Test, long_words_are_eligible_if_they_have_at_least_3_special_letters) {
  ASSERT_TRUE(Stage5::isEligible("rzmztypopqsdfg"));
}

TEST(Stage5Test, short_words_are_eligible_if_they_have_at_least_5_letters_in_upper_case) {
  ASSERT_TRUE(Stage5::isEligible("PlKZMZ"));
}

TEST(Stage5Test, short_words_are_eligible_if_they_have_3_vowels) {
  ASSERT_TRUE(Stage5::isEligible("aeio"));
}

class Stage5Test: public TestWithParam<std::string> {};
TEST_P(Stage5Test, other_words_are_not_elligible) {
  ASSERT_FALSE(Stage5::isEligible(GetParam()));
}

INSTANTIATE_TEST_CASE_P(Stage5TestInstantiation,
                        Stage5Test,
                        Values("pazof", "AOJGKFLDLFMG", "", "oplm", "lkoirp" ) );


