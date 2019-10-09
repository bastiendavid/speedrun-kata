use std::vec::Vec;

/**
 * Make this code clean.
 */
fn compute_price(c: &Vec<f64>, v: bool, b: bool) -> f64
{
  let mut t = 0f64;
  for value in c
  {
    t += value;
  }
  let d = compute_discount(c.len(), b, v);
  let d2 = (d as f64)*t / 100f64;
  t + d2
}

fn compute_discount(n: usize, b1: bool, b2: bool) -> usize
{
  let mut p = 0;
  if n >= 5 && n < 10
  {
    p += 4;
  }
  else if n >= 10
  {
    p += 10;
  }
  if b1 {
    //black friday discount
    p += 20;
  }
  if b2 {
    p += 5;
  }
  p
}

macro_rules! generate_cart
{
  ( $($name:ident: $value:expr,)*) =>
  {$(
    #[test]
    fn $name() {
      let (v, b1, b2, expected): (std::vec::Vec<f64>, bool, bool, f64) = $value;
      assert_eq!(compute_price(&v, b1, b2), expected);
    }
  )*}
}

generate_cart!
{
  cart0: (Vec::new(), false, false, 0f64),
  cart1: (vec![2f64, 3f64], false, false, 5f64),
  cart2: (vec![10f64, 10f64], true, true, 25f64),
  cart3: (vec![10f64, 10f64], true, false, 21f64),
  cart4: (vec![10f64, 10f64], false, true, 24f64),
  cart5: (vec![1f64, 1f64, 1f64, 1f64, 1f64], false, false, 5.2f64),
  cart6: (vec![1f64, 1f64, 1f64, 1f64, 1f64], true, false, 5.45f64),
  cart7: (vec![1f64, 1f64, 1f64, 1f64, 1f64], false, true, 6.2f64),
  cart8: (vec![1f64, 1f64, 1f64, 1f64, 1f64], true, true, 6.45f64),
  cart9: (vec![2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64], false, false, 22f64),
  cart10: (vec![2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64], true, false, 23f64),
  cart11: (vec![2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64], false, true, 26f64),
  cart12: (vec![2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64, 2f64], true, true, 27f64),
}
