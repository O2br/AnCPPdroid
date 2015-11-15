
#include <jni.h>
#include "adder.h"


extern "C" {

JNIEXPORT jint JNICALL
        Java_com_telefuns_sample_calc_MainActivity_add(JNIEnv *env, jclass, jint, jint);

}


JNIEXPORT jint JNICALL
Java_com_telefuns_sample_calc_MainActivity_add(JNIEnv *env, jclass type, jint a, jint b) {

    Adder adder(a,b);
    return adder.add();
}

