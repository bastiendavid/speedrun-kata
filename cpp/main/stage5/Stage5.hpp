#ifndef SPEEDRUN_KATA_STAGE5_HPP
#define SPEEDRUN_KATA_STAGE5_HPP


#include <string>

class Stage5 {
public:
    static bool isEligible(const std::string& word);
private:
    static int countChars(const std::string &word, const std::string &chars);
};


#endif //SPEEDRUN_KATA_STAGE5_HPP
