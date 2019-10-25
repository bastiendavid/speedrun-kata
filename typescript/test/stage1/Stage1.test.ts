import * as assert from "assert";
import { Item, Stage1 } from '../../src/stage1/Stage1';

const assertions: { cart: Item[], expectedPrice: number }[] = [
  {cart: [Item.APPLE, Item.TOMATO, Item.BANANA], expectedPrice: 6},
  {cart: [Item.POTATO, Item.POTATO], expectedPrice: 2},
  {cart: [Item.LETTUCE, Item.TOMATO, Item.POTATO], expectedPrice: 5},
  {cart: [Item.APPLE, Item.PEER, Item.BANANA, Item.PEER], expectedPrice: 8},
];

describe("Stage 1", () => {
  // assertions.forEach(function (test, index) {
  //   it("should compute the prices for provided cart " + index, () => {
  //     const stage1 = new Stage1();
  //     assert.strictEqual(stage1.computePrice(test.cart), test.expectedPrice);
  //   });
  // });
});
