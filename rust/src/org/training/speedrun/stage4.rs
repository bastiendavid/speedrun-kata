use std::vec::Vec;
use std::ops::Add;

/**
 * Make this code clean.
 */
fn compute_price(cart: &Vec<f64>, vip_client: bool, black_friday: bool) -> f64
{
  let total = cart.iter().fold(0f64, Add::add);
  let discount = (compute_discount(cart.len(), black_friday, vip_client) as f64)*total / 100f64;
  total + discount
}

fn compute_discount(size: usize, black_friday: bool, vip_client: bool) -> usize
{
  let mut percent = 0;
  if size >= 5 && size < 10
  {
    percent += 4;
  }
  else if size >= 10
  {
    percent += 10;
  }
  if black_friday {
    //black friday discount
    percent += 20;
  }
  if vip_client {
    //vip client
    percent += 5;
  }
  percent
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
