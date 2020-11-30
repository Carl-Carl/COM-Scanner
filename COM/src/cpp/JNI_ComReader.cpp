#include "JNI_ComReader.h"

JNIEXPORT jint JNICALL Java_JNI_ComReader_sum(JNIEnv * Env, jobject obj, jint a, jint b) {
    return a + b;
}

int main()
{
    return 0;
}