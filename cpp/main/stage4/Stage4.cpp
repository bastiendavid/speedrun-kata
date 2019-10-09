/**
 * Make this code clean.
 */

#include "Stage4.hpp"
double Stage4::compute(std::vector<double> c, bool v, bool b)
{
  double t = 0;
  for (size_t i = 0; i < c.size(); ++i) {
    t += c[i];
  }
  int d = compute(c.size(), b, v);
  double d2 = d * t / 100;
  return t + d2;
}

int Stage4::compute(int n, bool b1, bool b2) {
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
