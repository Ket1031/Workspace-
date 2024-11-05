#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");
    int numero;

    printf("Digite um numero: ");
    scanf("%d",&numero);

    if(numero % 2 == 0)
    {
        printf("\nO numero é par");
        if(numero > 15)
            printf("\nO numero é maior que 15");
        else
            printf("\nO numero é menor que 15");
    }
    else 
    {
        printf("\nO numero é impar");
         if(numero > 15)
            printf("\nO numero é maior que 50");
        else
            printf("\nO numero é menor que 50");
        

    }
    return 0;
}