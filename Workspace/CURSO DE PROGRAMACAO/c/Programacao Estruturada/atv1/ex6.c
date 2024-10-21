#include <stdio.h>

int main()
{
    int a = 125, b = 12345;
    long ax = 1234567890;
    short s = 4043;
    float x = 2.13459;
    double dx = 1.1415927;
    char c = 'W'; // 'W' corresponde ao valor ASCII 87
    unsigned long ux = 2541567890;

    // a + c
    printf("a + c : %d\n",a + c);
    // x + c
    printf("x + c : %f\n",a + x);
    // dx + x
    printf("dx + x : %f\n",dx + x);
    // ((int) dx) + ax
    printf("(int)dx + ax : %ld\n",((int)dx) + ax);
    // a + x
    printf("a + x : %f\n", a + x);
    // s + b
    printf("s + b : %d\n", s + b);
    // ax + b
    printf("ax + b : %ld\n", ax + b);
    // s + c
    printf("s + c : %d\n", s + c);
    // ax + c
    printf("ax + c : %ld\n", ax + c);
    // ax + ux
    printf("ax + ux: %lu\n", ax + ux);

    return 0;
}
