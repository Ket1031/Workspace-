#include <stdio.h>

int main()
{
    float c,f;
    printf("Digite a temperatura em c :");
    scanf("%f", &c);

    f = (1.8 * c) +32;

    printf("\na temperatura em Fahrenheit e igual a %.2f F ",f);

    return 0;


}