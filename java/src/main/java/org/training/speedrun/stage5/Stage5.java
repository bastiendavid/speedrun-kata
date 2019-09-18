package org.training.speedrun.stage5;

/**
 * Make this code clean.
 */
public class Stage5 {

    double compute(double[] c, boolean v, boolean b) {
        double t = 0;
        for (int i = 0; i < c.length; ++i) {
            t += c[i];
        }
        int d = compute(c.length, b, v);
        double d2 = d * t / 100;
        return t + d2;
    }

    int compute(int n, boolean b1, boolean b2) {
        int p = 0;
        if (n >= 5 && n < 10) {
            p += 4;
        } else if (n >= 10) {
            p += 10;
        }
        if (b1) {
            // black friday discount
            p += 20;
        }

        if (b2) {
            // vip client
            p += 5;
        }
        return p;
    }
}
