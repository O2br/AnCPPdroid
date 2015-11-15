
#include "adder.h"


Adder::Adder(int a, int b): i(a), j(b)
{

}

int Adder::add()
{
    return i+j;
}