use std::string::String;

/**
 * Refactor this code until all functions body is <= 5 lines, and you find the code clean.
 */
fn is_eligible(word: &String) -> bool {
  if word.len() >= 10 {
    let vowels = vec!['a', 'e', 'i', 'o', 'u', 'y'];
    let nb_vowels = word.chars().filter(|c| vowels.contains(c)).count();
    if nb_vowels >= 4
    {
      return true;
    }
    else
    {
      let special_letters = vec!['p', 'm'];
      let nb_special_letters = word.chars().filter(|c| special_letters.contains(c)).count();
      if nb_special_letters >= 3 {
        return true;
      }
    }
  }
  else
  {
    let nb_letters_in_upper_case = word.chars().filter(|c| c >= &'A' && c <= &'Z').count();
    if nb_letters_in_upper_case >= 5 {
      return true;
    }
    else
    {
      let vowels = vec!['a', 'e', 'i', 'o', 'u', 'y'];
      let nb_vowels = word.chars().filter(|c| vowels.contains(c)).count();
      if nb_vowels >= 3 {
        return true;
      }
    }
  }
  false
}

macro_rules! generate_tests
{
  ( $($name:ident: $value:expr,)*) =>
  {$(
    #[test]
    fn $name() {
      let (s, expected): (&str, bool) = $value;
      assert_eq!(is_eligible(&s.to_string()), expected);
    }
  )*}
}

generate_tests!
{
  long_words_are_eligible_if_they_have_4_vowels: ("azertyuiopqsdfg", true),
  long_words_are_eligible_if_they_have_at_least_3_special_letters: ("rzmztypopqsdfg", true),
  short_words_are_eligible_if_they_have_at_least_5_letters_in_upper_case: ("PlKZMZ", true),
  short_words_are_eligible_if_they_have_3_vowels: ("aeio", true),
  other_words_are_not_elligible_0: ("pazof", false),
  other_words_are_not_elligible_1: ("AOJGKFLDLFMG", false),
  other_words_are_not_elligible_2: ("", false),
  other_words_are_not_elligible_3: ("oplm", false),
  other_words_are_not_elligible_4: ("lkoirp", false),
}
