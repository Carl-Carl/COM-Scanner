#include "JNI_ComReader.h"

JNIEXPORT jdouble JNICALL Java_jni_ComReader_sum(JNIEnv * env, jobject obj, jdouble a, jdouble b) {
    return a + b;
}

int main()
{
    return 0;
}