using Microsoft.VisualStudio.TestTools.UnitTesting;
using SpeedrunKata.stage4;
using System.Collections.Generic;

namespace SpeedrunKata.Tests.stage4
{
    [TestClass]
    public class TestStage4
    {
        [TestMethod]
        [DynamicData(nameof(GenerateCart))]
        public void ComputeCartPrice(double[] c, bool v, bool b, double expectedPrice)
        {
            Stage4 stage4 = new Stage4();
            Assert.AreEqual(expectedPrice, stage4.Compute(c, v, b));
        }

        static IEnumerable<object[]> GenerateCart
        {
            get
            {
                return new[]
                {
                    new object[] { new double[]{}, false, false, 0 },
                    new object[] { new double[]{2, 3}, false, false, 5 },
                    new object[] { new double[]{10, 10}, true, true, 25 },
                    new object[] { new double[]{10, 10}, true, false, 21 },
                    new object[] { new double[]{10, 10}, false, true, 24 },
                    new object[] { new double[]{1, 1, 1, 1, 1}, false, false, 5.2 },
                    new object[] { new double[]{1, 1, 1, 1, 1}, true, false, 5.45 },
                    new object[] { new double[]{1, 1, 1, 1, 1}, false, true, 6.2 },
                    new object[] { new double[]{1, 1, 1, 1, 1}, true, true, 6.45 },
                    new object[] { new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, false, 22 },
                    new object[] { new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, false, 23 },
                    new object[] { new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, true, 26 },
                    new object[] { new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, true, 27 }
                };
            }
        }
    }
}
