import { expect } from 'chai';
import { Stage2 } from '../../src/stage2/Stage2';

describe('Stage2', () => {
  const stage2 = new Stage2();

  it('should compute score zero if all the dice have the same value', () => {
    expect(stage2.computeScore(1, 1, 1)).to.equal(0);
    expect(stage2.computeScore(2, 2, 2)).to.equal(0);
    expect(stage2.computeScore(3, 3, 3)).to.equal(0);
    expect(stage2.computeScore(4, 4, 4)).to.equal(0);
    expect(stage2.computeScore(5, 5, 5)).to.equal(0);
    expect(stage2.computeScore(6, 6, 6)).to.equal(0);
  });

  it('should compute the sum of dice multiplied by 2 if 2 dices have the same value', () => {
    expect(stage2.computeScore(1, 1, 3)).to.equal(10);
    expect(stage2.computeScore(4, 3, 3)).to.equal(20);
    expect(stage2.computeScore(2, 5, 5)).to.equal(24);
    expect(stage2.computeScore(1, 4, 1)).to.equal(12);
  });

  it('should compute 100 if dice are 1 2 3', () => {
    expect(stage2.computeScore(1, 2, 3)).to.equal(100);
    expect(stage2.computeScore(1, 3, 2)).to.equal(100);
    expect(stage2.computeScore(2, 1, 3)).to.equal(100);
    expect(stage2.computeScore(2, 3, 1)).to.equal(100);
    expect(stage2.computeScore(3, 1, 2)).to.equal(100);
    expect(stage2.computeScore(3, 2, 1)).to.equal(100);
  });

  it('should compute the sum of dice if no specific rules apply', () => {
    expect(stage2.computeScore(1, 3, 4)).to.equal(8);
    expect(stage2.computeScore(2, 5, 3)).to.equal(10);
    expect(stage2.computeScore(4, 6, 2)).to.equal(12);
  });
});
