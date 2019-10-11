package org.training.speedrun.stage4

/**
 * Make this code clean.
 */
class Stage4 {

    fun compute(c: DoubleArray, v: Boolean, b: Boolean): Double {
        var t = 0.0
        for (i in c.indices) {
            t += c[i]
        }
        val d = compute(c.size, b, v)
        val d2 = d * t / 100
        return t - d2
    }

    private fun compute(n: Int, b1: Boolean, b2: Boolean): Int {
        var p = 0
        if (n in 5..9) {
            p += 4
        } else if (n >= 10) {
            p += 10
        }
        if (b1) {
            // black friday discount
            p += 20
        }

        if (b2) {
            // vip client
            p += 5
        }
        return p
    }
}
