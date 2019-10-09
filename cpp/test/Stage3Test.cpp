#include "../main/stage3/Stage3.hpp"
#include "gtest/gtest.h"

using namespace testing;

class Stage3Test: public TestWithParam<std::pair<std::string, std::string>> {};

using Arguments = std::pair<std::string, std::string>;
TEST_P(Stage3Test, doTheThing_transforms_the_input_string_parametrized) {
  ASSERT_STREQ(Stage3::doTheThing(GetParam().first).c_str(), GetParam().second.c_str());
}

INSTANTIATE_TEST_CASE_P(Stage3TestInstantiation,
        Stage3Test,
        Values(Arguments{ "aeiou", "short_odd_aeiou" },
               Arguments{ "AEIOUY", "short_even_aeiouy" },
               Arguments{ "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "long_even_aBCDeFGHiJKLMNoPQRSTuVWXyZ" },
               Arguments{ "kjqtrpmnz", "short_odd_kjqtrpmnz" },
               Arguments{ "kjqtrpmnzr", "long_even_kjqtrpmnzr" },
               Arguments{ "kjqtrApmnzsr", "long_even_kjqtrapmnzsr" }
               ) );

TEST(Stage3Test, doTheThing_transforms_an_empty_string) {
  ASSERT_STREQ(Stage3::doTheThing("").c_str(), "short_even_");
}

