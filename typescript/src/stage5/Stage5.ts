//todo Refactor this code until all methods body is <= 5 lines, and you find the code clean.

export class Stage5 {
  isEligible(word: string): boolean {
    if (word.length >= 10) {
      const vowels: string[] = ['a', 'e', 'i', 'o', 'u', 'y'];
      const nbVowels: number = [...word].filter(c => vowels.includes(c)).length;
      if (nbVowels >= 4) {
        return true;
      } else {
        const specialLetters: string[] = ['p', 'm'];
        const nbSpecialLetters = [...word].filter(c => specialLetters.includes(c)).length;
        if (nbSpecialLetters >= 3) {
          return true;
        }
      }
    } else {
      const nbLettersInUpperCase = [...word].filter(c => /[A-Z]/.test(c)).length;
      if (nbLettersInUpperCase >= 5) {
        return true;
      } else {
        const vowels: string[] = ['a', 'e', 'i', 'o', 'u', 'y'];
        const nbVowels: number = [...word].filter(c => vowels.includes(c)).length;
        if (nbVowels >= 3) {
          return true;
        }
      }
    }
    return false;
  }
}
