#include <stdio.h>

int main()
{
    float comp,lar,area;
    printf("Digite o comprimento: ");
    scanf("%f",&comp);

    printf("\nDigite a largura: ");
    scanf("%f",&lar);

    area = comp * lar;
    printf("\nA area do quadrado e igual a %.2f",area);

    return 0;

}