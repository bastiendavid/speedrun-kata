/**
 * Refactor until there is no else, you think the code is clean, and all the tests pass.
 */

pub fn compute_score(dice1: isize, dice2: isize, dice3: isize) -> isize
{
    let mut score: isize = dice1 + dice2 + dice3;
    if dice1 == dice2 && dice1 == dice3 {
        score = 0;
    } else if dice1 == dice2 || dice2 == dice3 || dice1 == dice3 {
        score *= 2;
    } else if score == 6 {
        score = 100;
    }
    score
}

#[test]
fn score_is_zero_if_all_the_dice_have_the_same_value()
{
    assert_eq!(compute_score(1, 1, 1), 0);
    assert_eq!(compute_score(2, 2, 2), 0);
    assert_eq!(compute_score(3, 3, 3), 0);
    assert_eq!(compute_score(4, 4, 4), 0);
    assert_eq!(compute_score(5, 5, 5), 0);
    assert_eq!(compute_score(6, 6, 6), 0);
}

#[test]
fn score_is_the_sum_of_dice_multiplied_by_2_if_2_dices_have_the_same_value()
{
    assert_eq!(compute_score(1, 1, 3), 10);
    assert_eq!(compute_score(4, 3, 3), 20);
    assert_eq!(compute_score(2, 5, 5), 24);
    assert_eq!(compute_score(1, 4, 1), 12);
}

#[test]
fn score_is_100_if_dice_are_1_2_3()
{
    assert_eq!(compute_score(1, 2, 3), 100);
    assert_eq!(compute_score(1, 3, 2), 100);
    assert_eq!(compute_score(2, 1, 3), 100);
    assert_eq!(compute_score(2, 3, 1), 100);
    assert_eq!(compute_score(3, 1, 2), 100);
    assert_eq!(compute_score(3, 2, 1), 100);
}

#[test]
fn score_is_the_sum_of_dice_if_no_specific_rules_apply()
{
    assert_eq!(compute_score(1, 3, 4), 8);
    assert_eq!(compute_score(2, 5, 3), 10);
    assert_eq!(compute_score(4, 6, 2), 12);
}
