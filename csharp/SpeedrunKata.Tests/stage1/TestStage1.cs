using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using static SpeedrunKata.stage1.Stage1;

namespace SpeedrunKata.Tests.stage1
{
    [TestClass]
    public class TestStage1
    {
        //[TestMethod]
        //[DynamicData(nameof(ProvideCarts))]
        //public void ComputePrice(Items[] cart, int expectedPrice)
        //{
        //    Stage1 stage1 = new Stage1();
        //    // When
        //    int price = stage1.ComputePrice(cart);
        //    // Then
        //    Assert.AreEqual(expectedPrice, price);
        //}

        static IEnumerable<object[]> ProvideCarts
        {
            get
            {
                return new[]
                {
                    new object[] { new Items[] { Items.APPLE, Items.TOMATO, Items.BANANA }, 6 },
                    new object[] { new Items[] { Items.POTATO, Items.POTATO }, 2 },
                    new object[] { new Items[] { Items.LETTUCE, Items.TOMATO, Items.POTATO }, 5 },
                    new object[] { new Items[] { Items.APPLE, Items.PEER, Items.BANANA, Items.PEER }, 8 },
                };
            }
        }
    }
}
