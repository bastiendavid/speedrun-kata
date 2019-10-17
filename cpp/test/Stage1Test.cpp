#include "../main/stage1/Stage1.hpp"
#include "gtest/gtest.h"

using namespace testing;

//using Arguments = std::pair<std::vector<Stage1>, int>;
//class Stage1Test: public TestWithParam<Arguments> {};
//TEST_P(Stage1Test, compute_prices_parametrized) {
//  ASSERT_EQ(Stage1::computePrice(GetParam().first), GetParam().second);
//}
//
//INSTANTIATE_TEST_CASE_P(Stage1TestInstantiation,
//                        Stage1Test,
//                        Values(Arguments{ { Stage1::APPLE, Stage1::TOMATO, Stage1::BANANA }, 6 },
//                               Arguments{ { Stage1::POTATO, Stage1::POTATO }, 2 },
//                               Arguments{ { Stage1::LETTUCE, Stage1::TOMATO, Stage1::POTATO }, 5 },
//                               Arguments{ { Stage1::APPLE, Stage1::PEER, Stage1::BANANA, Stage1::PEER }, 8 }
//                        ) );
