export enum Item {
  POTATO = 1,
  TOMATO = 2,
  LETTUCE = 2,
  APPLE = 1,
  BANANA = 3,
  PEER = 2,
}

/**
 * Uncomment the tests, and make them pass
 */
export class Stage1 {
  getPrice(item: Item) {
    return item;
  }

  computePrice(items: Item[]) {
    return items.reduce((agg, cur: Item) => {
      return agg + this.getPrice(cur);
    }, 0);
  }
}
