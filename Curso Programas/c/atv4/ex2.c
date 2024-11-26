#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int num;

    printf("Digite um numero: ");
    scanf("%d",&num);

    num = num % 2;

    switch (num)
    {
    case 0:
        printf("O numero e par");
        break;
    
    default:
        printf("O numero e impar");
        break;
    }


    return 0;
}
 