cmake_minimum_required(VERSION 3.14)
project(speedrun-kata)

set(CMAKE_CXX_STANDARD 17)
include(GoogleTest)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -Wextra -Wpedantic -Werror")
add_executable(tests
        test/main.cpp
        main/stage1/Stage1.cpp main/stage1/Stage1.hpp test/Stage1Test.cpp
        main/stage2/Stage2.cpp main/stage2/Stage2.hpp test/Stage2Test.cpp test/Stage3Test.cpp main/stage3/Stage3.cpp main/stage3/Stage3.hpp)
target_link_libraries(tests gtest)