#include "../main/stage3/Stage3.hpp"
#include "gtest/gtest.h"

using namespace testing;

class Stage3Test: public TestWithParam<std::pair<std::string, std::string>> {};

TEST_P(Stage3Test, doTheThing_transforms_the_input_string_parametrized) {
  ASSERT_STREQ(Stage3::doTheThing(GetParam().first).c_str(), GetParam().second.c_str());
}

INSTANTIATE_TEST_CASE_P(Stage3TestInstantiation,
        Stage3Test,
        Values(std::pair<std::string, std::string>{ "aeiou", "short_odd_aeiou" },
               std::pair<std::string, std::string>{ "AEIOUY", "short_even_aeiouy" },
               std::pair<std::string, std::string>{ "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "long_even_aBCDeFGHiJKLMNoPQRSTuVWXyZ" },
               std::pair<std::string, std::string>{ "kjqtrpmnz", "short_odd_kjqtrpmnz" },
               std::pair<std::string, std::string>{ "kjqtrpmnzr", "long_even_kjqtrpmnzr" },
               std::pair<std::string, std::string>{ "kjqtrApmnzsr", "long_even_kjqtrapmnzsr" }
               ) );

TEST(Stage3Test, doTheThing_transforms_an_empty_string) {
  ASSERT_STREQ(Stage3::doTheThing("").c_str(), "short_even_");
}

