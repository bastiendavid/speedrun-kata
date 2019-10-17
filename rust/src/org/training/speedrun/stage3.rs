use std::string::String;

trait Replace
{
  fn replace(&self, origin: char, replacement: char) -> Self;
}

impl Replace for String
{
  fn replace(&self, origin: char, replacement: char) -> String
  {
    self.clone().chars().map(|c: char|
    {
      if c == origin
      {
        return replacement;
      }
      c
    }).collect()
  }
}

/**
 * Remove all the code duplications.
 */
pub fn do_the_thing(input: &String) -> String
{
  let shortness: String = if input.len() < 10 {
    String::from("short")
  } else {
    String::from("long")
  };
  let oddness: String = if input.len() % 2 == 0 {
    String::from("even")
  } else {
    String::from("odd")
  };

  shortness + &String::from("_") + &oddness + &String::from("_") + &input.replace('A', 'a')
    .replace('E', 'e')
    .replace('I', 'i')
    .replace('O', 'o')
    .replace('U', 'u')
    .replace('Y', 'y')
}

macro_rules! do_the_thing_transforms_the_input_string
{
  ( $($name:ident: $value:expr,)*) =>
  {$(
    #[test]
    fn $name() {
      let (s, expected): (&str, &str) = $value;
      assert_eq!(do_the_thing(&s.to_string()), expected.to_string());
    }
  )*}
}

do_the_thing_transforms_the_input_string! {
  set0: ("aeiou","short_odd_aeiou"),
  set1: ("AEIOUY","short_even_aeiouy"),
  set2: ("ABCDEFGHIJKLMNOPQRSTUVWXYZ","long_even_aBCDeFGHiJKLMNoPQRSTuVWXyZ"),
  set3: ("kjqtrpmnz","short_odd_kjqtrpmnz"),
  set4: ("kjqtrpmnzr","long_even_kjqtrpmnzr"),
  set5: ("kjqtrApmnzsr","long_even_kjqtrapmnzsr"),
  empty_string: ("","short_even_"),
}
