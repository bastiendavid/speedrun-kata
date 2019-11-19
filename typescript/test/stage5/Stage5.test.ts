import { expect } from 'chai';
import { Stage5 } from '../../src/stage5/Stage5';

describe('Stage5', () => {
  it('should define long words eligible if they have 4 vowels', () => {
    const stage5 = new Stage5();
    expect(stage5.isEligible('azertyuiopqsdfg')).to.be.true;
  });

  it('should define long words eligible if they have at least 3 special letters', () => {
    const stage5 = new Stage5();
    expect(stage5.isEligible('rzmztypopqsdfg')).to.be.true;
  });

  it('should define short words eligible if they have at least 5 letters in upper case', () => {
    const stage5 = new Stage5();
    expect(stage5.isEligible('PlKZMZ')).to.be.true;
  });

  it('should define short words eligible if they have 3 vowels 4 vowels', () => {
    const stage5 = new Stage5();
    expect(stage5.isEligible('aeio')).to.be.true;
  });

  const assertions: string[] = ['pazof', 'AOJGKFLDLFMG', '', 'oplm', 'lkoirp'];
  assertions.forEach(function(word) {
    it('should not define eligible the following other words: ' + word, () => {
      const stage5 = new Stage5();
      expect(stage5.isEligible(word)).to.be.false;
    });
  });
});
