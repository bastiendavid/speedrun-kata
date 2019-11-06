//todo Make this code clean.
export class Stage4 {
  compute(c: number[], v: boolean, b: boolean): number {
    let t = 0;
    for (let i = 0; i < c.length; ++i) {
      t += c[i];
    }
    const d = this.computeDiscount(c.length, b, v);
    const d2 = (d * t) / 100;
    return t - d2;
  }

  computeDiscount(n: number, b1: boolean, b2: boolean): number {
    let p = 0;
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
