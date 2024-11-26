#include <stdio.h>
#include <locale.h>

int par(int n)
{
        if (n % 2 == 0)
        {
            return 1;
        }
        else 
            return 0;
}

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int numero,r;

    printf("Digite um numero inteiro: ");
    scanf("%d",&numero);

    r = par(numero);

    printf("\nr: %d",r);
    printf("\nO numero e %s." , numero == 1 ? "par" : "impar");

    return 0;
}
 