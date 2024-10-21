#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int numero;


    printf("Digite um numero: ");
    scanf("%d",&numero);

    if( numero % 2 == 0)
        printf("O numero %d e um numero Par.",numero);

    else 
        printf("o numero nao e um numero par, o numero par subsequente a ele e %d",numero + 1);



    return 0;
}