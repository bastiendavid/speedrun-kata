using Microsoft.VisualStudio.TestTools.UnitTesting;
using SpeedrunKata.stage3;

namespace SpeedrunKata.Tests.stage3
{
    [TestClass]
    public class TestStage3
    {
        [DataRow("aeiou","short_odd_aeiou")]
        [DataRow("AEIOUY", "short_even_aeiouy")]
        [DataRow("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "long_even_aBCDeFGHiJKLMNoPQRSTuVWXyZ")]
        [DataRow("kjqtrpmnz", "short_odd_kjqtrpmnz")]
        [DataRow("kjqtrpmnzr", "long_even_kjqtrpmnzr")]
        [DataRow("kjqtrApmnzsr", "long_even_kjqtrapmnzsr")]
        [DataTestMethod]
        public void DoTheThing_transforms_the_input_string(string input, string output)
        {
            Assert.AreEqual(output, Stage3.DoTheThing(input));
        }

        [TestMethod]
        public void DoTheThing_transforms_an_empty_string()
        {
            Assert.AreEqual("short_even_", Stage3.DoTheThing(""));
        }
    }
}
