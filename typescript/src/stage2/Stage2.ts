/**
 * Refactor until there is no else, you think the code is clean, and all the tests pass.
 */
export class Stage2 {
  computeScore(dice1: number, dice2: number, dice3: number): number {
    let score: number;
    if (dice1 == dice2 && dice1 == dice3) {
      score = 0;
    } else {
      if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
        score = (dice1 + dice2 + dice3) * 2;
      } else {
        if (dice1 == 1 && dice2 == 2 && dice3 == 3) {
          score = 100;
        } else {
          if (dice1 == 1 && dice2 == 3 && dice3 == 2) {
            score = 100;
          } else {
            if (dice1 == 2 && dice2 == 1 && dice3 == 3) {
              score = 100;
            } else {
              if (dice1 == 2 && dice2 == 3 && dice3 == 1) {
                score = 100;
              } else {
                if (dice1 == 3 && dice2 == 1 && dice3 == 2) {
                  score = 100;
                } else {
                  if (dice1 == 3 && dice2 == 2 && dice3 == 1) {
                    score = 100;
                  } else {
                    score = dice1 + dice2 + dice3;
                  }
                }
              }
            }
          }
        }
      }
    }
    return score;
  }
}
