/**
 * Uncomment the tests, and make them pass
 */

#include "Stage1.hpp"

const Stage1 Stage1::POTATO = Stage1(1);
const Stage1 Stage1::TOMATO = Stage1(2);
const Stage1 Stage1::LETTUCE = Stage1(2);
const Stage1 Stage1::APPLE = Stage1(1);
const Stage1 Stage1::BANANA = Stage1(3);
const Stage1 Stage1::PEER = Stage1(2);

int Stage1::getPrice() const {
  return price;
}
