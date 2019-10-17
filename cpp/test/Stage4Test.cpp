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
                               Arguments{ {10, 10}, true, true, 15 },
                               Arguments{ {10, 10}, true, false, 19 },
                               Arguments{ {10, 10}, false, true, 16 },
                               Arguments{ {1, 1, 1, 1, 1}, false, false, 4.8F },
                               Arguments{ {1, 1, 1, 1, 1}, true, false, 4.55F },
                               Arguments{ {1, 1, 1, 1, 1}, false, true, 3.8F },
                               Arguments{ {1, 1, 1, 1, 1}, true, true, 3.55F },
                               Arguments{ {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, false, 18 },
                               Arguments{ {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, false, 17 },
                               Arguments{ {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, false, true, 14 },
                               Arguments{ {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, true, true, 13 }
                        ) );
