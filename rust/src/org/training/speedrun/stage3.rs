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

pub fn do_the_thing(input: &String) -> String
{
  let mut result: String;
  if input.len() % 2 == 0 {
    result = input.replace('A', 'a');
    result = result.replace('E', 'e');
    let prefix = String::from("even");
    result = result.replace('I', 'i');
    result = result.replace('O', 'o');
    result = result.replace('U', 'u');
    result = result.replace('Y', 'y');
    if result.len() < 10 {
      result = prefix + &String::from("_") + &result;
      result = String::from("short") + &String::from("_") + &result;
    } else {
      result = prefix + &String::from("_") + &result;
      result = String::from("long") + &String::from("_") + &result;
    }
  } else {
    result = input.replace('A', 'a');
    let prefix = String::from("odd");
    result = result.replace('E', 'e');
    result = result.replace('I', 'i');
    result = result.replace('O', 'o');
    result = result.replace('U', 'u');
    result = result.replace('Y', 'y');
    if result.len() < 10 {
      result = prefix + &String::from("_") + &result;
      result = String::from("short_") + &result;
    } else {
      result = prefix + &String::from("_") + &result;
      result = String::from("long_") + &result;
    }
  }
  result
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
