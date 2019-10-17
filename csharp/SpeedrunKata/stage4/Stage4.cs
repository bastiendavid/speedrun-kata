namespace SpeedrunKata.stage4
{
    /**
     * Make this code clean.
     */
    public class Stage4
    {
        public double Compute(double[] c, bool v, bool b)
        {
            double t = 0;
            for (int i = 0; i < c.Length; ++i)
            {
                t += c[i];
            }
            int d = Compute(c.Length, b, v);
            double d2 = d * t / 100;
            return t + d2;
        }

        public int Compute(int n, bool b1, bool b2)
        {
            int p = 0;
            if (n >= 5 && n < 10)
            {
                p += 4;
            }
            else if (n >= 10)
            {
                p += 10;
            }
            if (b1)
            {
                // black friday discount
                p += 20;
            }

            if (b2)
            {
                // vip client
                p += 5;
            }
            return p;
        }
    }
}
