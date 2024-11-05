#include <stdio.h>

int main()
{
    int num1,num2,x;
    printf("Digite o primeiro numero: ");
    scanf("%d",&num1);
    printf("Digite o segundo numero: ");
    scanf("%d",&num2);

    x = num1;
    num1 = num2;
    num2 = x;

    printf("valores trocados entre %d e %d.",num1,num2);

    return 0;
}