//
// Created by eaton on 08/10/2019.
//

#include "../main/stage2/Stage2.hpp"
#include "gtest/gtest.h"
using namespace testing;

TEST(Stage2Test, score_is_zero_if_all_the_dice_have_the_same_value) {
  ASSERT_EQ(Stage2::computeScore(1, 1, 1), 0);
  ASSERT_EQ(Stage2::computeScore(2, 2, 2), 0);
  ASSERT_EQ(Stage2::computeScore(3, 3, 3), 0);
  ASSERT_EQ(Stage2::computeScore(4, 4, 4), 0);
  ASSERT_EQ(Stage2::computeScore(5, 5, 5), 0);
  ASSERT_EQ(Stage2::computeScore(6, 6, 6), 0);
}
TEST(Stage2Test, score_is_the_sum_of_dice_multiplied_by_2_if_2_dices_have_the_same_value) {
  ASSERT_EQ(Stage2::computeScore(1, 1, 3), 10);
  ASSERT_EQ(Stage2::computeScore(4, 3, 3), 20);
  ASSERT_EQ(Stage2::computeScore(2, 5, 5), 24);
  ASSERT_EQ(Stage2::computeScore(1, 4, 1), 12);
}
TEST(Stage2Test, score_is_100_if_dice_are_1_2_3) {
  ASSERT_EQ(Stage2::computeScore(1, 2, 3), 100);
  ASSERT_EQ(Stage2::computeScore(1, 3, 2), 100);
  ASSERT_EQ(Stage2::computeScore(2, 1, 3), 100);
  ASSERT_EQ(Stage2::computeScore(2, 3, 1), 100);
  ASSERT_EQ(Stage2::computeScore(3, 1, 2), 100);
  ASSERT_EQ(Stage2::computeScore(3, 2, 1), 100);
}
TEST(Stage2Test, score_is_the_sum_of_dice_if_no_specific_rules_apply) {
  ASSERT_EQ(Stage2::computeScore(1, 3, 4), 8);
  ASSERT_EQ(Stage2::computeScore(2, 5, 3), 10);
  ASSERT_EQ(Stage2::computeScore(4, 6, 2), 12);
}


int main(int argc, char **argv) {
  InitGoogleTest(&argc, argv);
  return RUN_ALL_TESTS();
}
