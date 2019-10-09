use std::ops::Add;

#[derive(Clone,Copy)]
pub enum Items
{
  Potato,
  Tomato,
  Lettuce,
  Apple,
  Banana,
  Peer
}

impl Items
{
  pub fn get_price(&self) -> i32
  {
    match self
    {
      &Items::Potato => 1,
      &Items::Tomato => 2,
      &Items::Lettuce => 2,
      &Items::Apple => 1,
      &Items::Banana => 3,
      &Items::Peer => 2,
    }
  }
}

fn compute_price(v: &std::vec::Vec<Items>) -> i32
{
    v.iter().map(Items::get_price).fold(0i32, Add::add)
}

macro_rules! provide_carts
{
  ( $($name:ident: $value:expr,)*) =>
  {$(
    #[test]
    fn $name() {
      let (v, expected): (std::vec::Vec<Items>, i32) = $value;
      assert_eq!(compute_price(&v), expected);
    }
  )*}
}

provide_carts! {
  cart0: (vec![Items::Apple, Items::Tomato, Items::Banana], 6),
  cart1: (vec![Items::Potato, Items::Potato], 2),
  cart2: (vec![Items::Lettuce, Items::Tomato, Items::Potato], 5),
  cart3: (vec![Items::Apple, Items::Peer, Items::Banana, Items::Peer], 8),
}
