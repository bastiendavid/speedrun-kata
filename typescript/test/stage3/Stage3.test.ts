import { expect } from 'chai';
import { Stage3 } from '../../src/stage3/Stage3';

describe('Stage3', () => {
  const assertions = [
    { input: 'aeiou', output: 'short_odd_aeiou' },
    { input: 'AEIOUY', output: 'short_even_aeiouy' },
    { input: 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', output: 'long_even_aBCDeFGHiJKLMNoPQRSTuVWXyZ' },
    { input: 'kjqtrpmnz', output: 'short_odd_kjqtrpmnz' },
    { input: 'kjqtrpmnzr', output: 'long_even_kjqtrpmnzr' },
    { input: 'kjqtrApmnzsr', output: 'long_even_kjqtrapmnzsr' },
  ];

  assertions.forEach(function(test, index) {
    it('should transform input string for case ' + index, () => {
      const stage3 = new Stage3();
      expect(stage3.doTheThing(test.input)).to.equal(test.output);
    });
  });

  it('should transforms an empty string', () => {
    const stage3 = new Stage3();
    expect(stage3.doTheThing('')).to.equal('short_even_');
  });
});
