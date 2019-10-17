namespace SpeedrunKata.stage3
{
    /**
     * Remove all the code duplications.
     */
    public static class Stage3
    {
        public static string DoTheThing(string input)
        {
            string result;
            if (input.Length % 2 == 0)
            {
                result = input.Replace('A', 'a');
                result = result.Replace('E', 'e');
                string prefix = "even";
                result = result.Replace('I', 'i');
                result = result.Replace('O', 'o');
                result = result.Replace('U', 'u');
                result = result.Replace('Y', 'y');
                if (result.Length < 10)
                {
                    result = prefix + "_" + result;
                    result = "short" + "_" + result;
                }
                else
                {
                    result = prefix + "_" + result;
                    result = "long" + "_" + result;
                }
            }
            else
            {
                result = input.Replace('A', 'a');
                string prefix = "odd";
                result = result.Replace('E', 'e');
                result = result.Replace('I', 'i');
                result = result.Replace('O', 'o');
                result = result.Replace('U', 'u');
                result = result.Replace('Y', 'y');
                if (result.Length < 10)
                {
                    result = prefix + "_" + result;
                    result = "short_" + result;
                }
                else
                {
                    result = prefix + "_" + result;
                    result = "long_" + result;
                }
            }
            return result;
        }
    }
}
