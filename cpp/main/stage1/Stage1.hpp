#ifndef CPP_STAGE1_HPP
#define CPP_STAGE1_HPP
#include <vector>

class Stage1{
public:
    static const Stage1 POTATO;
    static const Stage1 TOMATO;
    static const Stage1 LETTUCE;
    static const Stage1 APPLE;
    static const Stage1 BANANA;
    static const Stage1 PEER;

    int getPrice() const;

private:
    int price;

    explicit Stage1(int price) {
      this->price = price;
    }
};

#endif //CPP_STAGE1_HPP
