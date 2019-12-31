import { expect } from 'chai';
import { Stage4 } from '../../src/stage4/Stage4';

describe('Stage4', () => {
  const assertions: { input: { c: number[]; v: boolean; b: boolean }; expectedPrice: number }[] = [
    { input: { c: [], v: false, b: false }, expectedPrice: 0 },
    { input: { c: [2, 3], v: false, b: false }, expectedPrice: 5 },
    { input: { c: [10, 10], v: true, b: true }, expectedPrice: 15 },
    { input: { c: [10, 10], v: true, b: false }, expectedPrice: 19 },
    { input: { c: [10, 10], v: false, b: true }, expectedPrice: 16 },
    { input: { c: [1, 1, 1, 1, 1], v: false, b: false }, expectedPrice: 4.8 },
    { input: { c: [1, 1, 1, 1, 1], v: true, b: false }, expectedPrice: 4.55 },
    { input: { c: [1, 1, 1, 1, 1], v: false, b: true }, expectedPrice: 3.8 },
    { input: { c: [1, 1, 1, 1, 1], v: true, b: true }, expectedPrice: 3.55 },
    { input: { c: [2, 2, 2, 2, 2, 2, 2, 2, 2, 2], v: false, b: false }, expectedPrice: 18 },
    { input: { c: [2, 2, 2, 2, 2, 2, 2, 2, 2, 2], v: true, b: false }, expectedPrice: 17 },
    { input: { c: [2, 2, 2, 2, 2, 2, 2, 2, 2, 2], v: false, b: true }, expectedPrice: 14 },
    { input: { c: [2, 2, 2, 2, 2, 2, 2, 2, 2, 2], v: true, b: true }, expectedPrice: 13 },
  ];

  assertions.forEach(function(test, index) {
    it('should compute cart price for case ' + index, () => {
      const stage4 = new Stage4();
      const { c, v, b } = test.input;
      expect(stage4.compute(c, v, b)).to.equal(test.expectedPrice);
    });
  });
});
