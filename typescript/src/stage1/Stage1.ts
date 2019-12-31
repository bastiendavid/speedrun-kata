export enum Item {
  POTATO = 1,
  TOMATO = 2,
  LETTUCE = 2,
  APPLE = 1,
  BANANA = 3,
  PEER = 2,
}

//todo Uncomment the tests, and make them pass

export class Stage1 {
  getPrice(item: Item) {
    return item;
  }
}
