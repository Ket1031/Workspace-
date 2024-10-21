#include <stdio.h>

int main()
{
    int numero,total;
    int n100,n50,n20,n10,n5;

    printf("digite um valor: ");
    scanf("%d",&numero);
    
    n100 = numero/100;
    numero = numero%100;

    n50 = numero/50;
    numero = numero%50;

    n20 = numero/20;
    numero = numero%20;

    n10 = numero/10;
    numero = numero%10;

    n5 = numero/5;
    numero = numero%5;

    total = n100 + n50 + n20 + n10 + n5;

    printf("\nnumero total de notas: %d",total);
    printf("\nnumero de notas de 100: %d",n100);
    printf("\nnumero de notas de 50: %d",n50);
    printf("\nnumero de notas de 20: %d",n20);
    printf("\nnumero de notas de 10: %d",n10);
    printf("\nnumero de notas de 5: %d",n5);

    return 0;

}