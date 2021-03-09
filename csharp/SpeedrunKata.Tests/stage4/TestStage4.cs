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
                    new object[] { new double[]{10, 10}, true, true, 15 },
                    new object[] { new double[]{10, 10}, true, false, 19 },
                    new object[] { new double[]{10, 10}, false, true, 16 },
                    new object[] { new double[]{1, 1, 1, 1, 1}, false, false, 4.8 },
                    new object[] { new double[]{1, 1, 1, 1, 1}, true, false, 4.55 },
                    new object[] { new double[]{1, 1, 1, 1, 1}, false, true, 3.8 },
                    new object[] { new double[]{1, 1, 1, 1, 1}, true, true, 3.55 },
                    new object[] { new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, false, 18 },
                    new object[] { new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, false, 17 },
                    new object[] { new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, true, 14 },
                    new object[] { new double[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, true, 13 }
                };
            }
        }
    }
}
