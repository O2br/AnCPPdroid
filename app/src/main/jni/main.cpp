#include <jni.h>

extern "C" JNIEXPORT jint JNICALL  Java_com_telefuns_sample_calc_NativeServiceHandler_start(JNIEnv *aEnv, jclass aType, jlong aValue)
{
    return aValue+1;
}

extern "C" JNIEXPORT jint JNICALL  Java_com_telefuns_sample_calc_NativeServiceHandler_stop(JNIEnv *aEnv, jclass aType, jlong aValue)
{
    return aValue-1;
}
