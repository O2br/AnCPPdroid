

#ifndef NATIVE_ADDER_H
#define NATIVE_ADDER_H
#include <sys/types.h>

class Adder
{
    int i;
    int j;

public:
    Adder(int a, int b);
    int add();
};

#endif //NATIVE_ADDER_H
