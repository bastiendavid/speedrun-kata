using Microsoft.VisualStudio.TestTools.UnitTesting;
using SpeedrunKata.stage5;

namespace SpeedrunKata.Tests.stage5
{
    [TestClass]
    public class TestStage5
    {
        private readonly Stage5 stage5 = new Stage5();

        [TestMethod]
        public void LongWordsAreEligibleIfTheyHave_4Vowels()
        {
            Assert.IsTrue(stage5.IsEligible("azertyuiopqsdfg"));
        }

        [TestMethod]
        public void LongWordsAreEligibleIfTheyHaveAtLeast_3SpecialLetters()
        {
            Assert.IsTrue(stage5.IsEligible("rzmztypopqsdfg"));
        }

        [TestMethod]
        public void ShortWordsAreEligibleIfTheyHaveAtLeast_5LettersInUpperCase()
        {
            Assert.IsTrue(stage5.IsEligible("PlKZMZ"));
        }

        [TestMethod]
        public void ShortWordsAreEligibleIfTheyHave_3Vowels()
        {
            Assert.IsTrue(stage5.IsEligible("aeio"));
        }

        [DataRow("pazof")]
        [DataRow("AOJGKFLDLFMG")]
        [DataRow("")]
        [DataRow("oplm")]
        [DataRow("lkoirp")]
        [DataTestMethod]
        public void OtherWordsAreNotElligible(string word)
        {
            Assert.IsFalse(stage5.IsEligible(word));
        }
    }
}
