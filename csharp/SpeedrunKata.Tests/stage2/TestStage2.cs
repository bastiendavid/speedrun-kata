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
            Assert.AreEqual(0, Stage2.ComputeScore(1, 1, 1));
            Assert.AreEqual(0, Stage2.ComputeScore(2, 2, 2));
            Assert.AreEqual(0, Stage2.ComputeScore(3, 3, 3));
            Assert.AreEqual(0, Stage2.ComputeScore(4, 4, 4));
            Assert.AreEqual(0, Stage2.ComputeScore(5, 5, 5));
            Assert.AreEqual(0, Stage2.ComputeScore(6, 6, 6));
        }

        [TestMethod]
        public void Score_is_the_sum_of_dice_multiplied_by_2_if_2_dices_have_the_same_value()
        {
            Assert.AreEqual(10, Stage2.ComputeScore(1, 1, 3));
            Assert.AreEqual(20, Stage2.ComputeScore(4, 3, 3));
            Assert.AreEqual(24, Stage2.ComputeScore(2, 5, 5));
            Assert.AreEqual(12, Stage2.ComputeScore(1, 4, 1));
        }

        [TestMethod]
        public void Score_is_100_if_dice_are_1_2_3()
        {
            Assert.AreEqual(100, Stage2.ComputeScore(1, 2, 3));
            Assert.AreEqual(100, Stage2.ComputeScore(1, 3, 2));
            Assert.AreEqual(100, Stage2.ComputeScore(2, 1, 3));
            Assert.AreEqual(100, Stage2.ComputeScore(2, 3, 1));
            Assert.AreEqual(100, Stage2.ComputeScore(3, 1, 2));
            Assert.AreEqual(100, Stage2.ComputeScore(3, 2, 1));
        }

        [TestMethod]
        public void Score_is_the_sum_of_dice_if_no_specific_rules_apply()
        {
            Assert.AreEqual(8, Stage2.ComputeScore(1, 3, 4));
            Assert.AreEqual(10, Stage2.ComputeScore(2, 5, 3));
            Assert.AreEqual(12, Stage2.ComputeScore(4, 6, 2));
        }
    }
}
