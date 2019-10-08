using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SpeedrunKata.stage2;

namespace SpeedrunKata.Tests.stage2
{
    [TestClass]
    public class TestStage2
    {
        [TestMethod]
        public void Score_is_zero_if_all_the_dice_have_the_same_value()
        {
            Assert.AreEqual(Stage2.ComputeScore(1, 1, 1), 0);
            Assert.AreEqual(Stage2.ComputeScore(2, 2, 2), 0);
            Assert.AreEqual(Stage2.ComputeScore(3, 3, 3), 0);
            Assert.AreEqual(Stage2.ComputeScore(4, 4, 4), 0);
            Assert.AreEqual(Stage2.ComputeScore(5, 5, 5), 0);
            Assert.AreEqual(Stage2.ComputeScore(6, 6, 6), 0);
        }

        [TestMethod]
        public void Score_is_the_sum_of_dice_multiplied_by_2_if_2_dices_have_the_same_value()
        {
            Assert.AreEqual(Stage2.ComputeScore(1, 1, 3), 10);
            Assert.AreEqual(Stage2.ComputeScore(4, 3, 3), 20);
            Assert.AreEqual(Stage2.ComputeScore(2, 5, 5), 24);
            Assert.AreEqual(Stage2.ComputeScore(1, 4, 1), 12);
        }

        [TestMethod]
        public void Score_is_100_if_dice_are_1_2_3()
        {
            Assert.AreEqual(Stage2.ComputeScore(1, 2, 3), 100);
            Assert.AreEqual(Stage2.ComputeScore(1, 3, 2), 100);
            Assert.AreEqual(Stage2.ComputeScore(2, 1, 3), 100);
            Assert.AreEqual(Stage2.ComputeScore(2, 3, 1), 100);
            Assert.AreEqual(Stage2.ComputeScore(3, 1, 2), 100);
            Assert.AreEqual(Stage2.ComputeScore(3, 2, 1), 100);
        }

        [TestMethod]
        public void Score_is_the_sum_of_dice_if_no_specific_rules_apply()
        {
            Assert.AreEqual(Stage2.ComputeScore(1, 3, 4), 8);
            Assert.AreEqual(Stage2.ComputeScore(2, 5, 3), 10);
            Assert.AreEqual(Stage2.ComputeScore(4, 6, 2), 12);
        }
    }
}
