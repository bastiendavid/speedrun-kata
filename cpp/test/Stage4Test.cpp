#include "../main/stage4/Stage4.hpp"
#include "gtest/gtest.h"

using namespace testing;

using Arguments = std::tuple<std::vector<double>, bool, bool, double>;
class Stage4Test: public TestWithParam<Arguments> {};

TEST_P(Stage4Test, compute_cart_price) {
  ASSERT_FLOAT_EQ(Stage4::compute(std::get<0>(GetParam()), std::get<1>(GetParam()), std::get<2>(GetParam())), std::get<3>(GetParam()));
}

INSTANTIATE_TEST_CASE_P(compute_cart_price,
                        Stage4Test,
                        Values(Arguments{ {}, false, false, 0 },
                               Arguments{ {2, 3}, false, false, 5 },
                               Arguments{ {10, 10}, true, true, 25 },
                               Arguments{ {10, 10}, true, false, 21 },
                               Arguments{ {10, 10}, false, true, 24 },
                               Arguments{ {1, 1, 1, 1, 1}, false, false, 5.2F },
                               Arguments{ {1, 1, 1, 1, 1}, true, false, 5.45F },
                               Arguments{ {1, 1, 1, 1, 1}, false, true, 6.2F },
                               Arguments{ {1, 1, 1, 1, 1}, true, true, 6.45F },
                               Arguments{ {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, false, 22 },
                               Arguments{ {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, false, 23 },
                               Arguments{ {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, true, 26 },
                               Arguments{ {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, true, 27 }
                        ) );