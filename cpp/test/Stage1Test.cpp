#include "../main/stage1/Stage1.hpp"
#include "gtest/gtest.h"

TEST(Stage1Test, compute_prices) {
  EXPECT_EQ(Stage1::computePrice({ Stage1::APPLE, Stage1::TOMATO, Stage1::BANANA }), 6);
  EXPECT_EQ(Stage1::computePrice({ Stage1::POTATO, Stage1::POTATO }), 2);
  EXPECT_EQ(Stage1::computePrice({ Stage1::LETTUCE, Stage1::TOMATO, Stage1::POTATO }), 5);
  EXPECT_EQ(Stage1::computePrice({ Stage1::APPLE, Stage1::PEER, Stage1::BANANA, Stage1::PEER }), 8);
}
