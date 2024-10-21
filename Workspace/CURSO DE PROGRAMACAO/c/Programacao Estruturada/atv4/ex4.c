#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    float num1,num2;
    int op;

    printf("Digite dois numeros: \n");
    scanf("%f %f",&num1,&num2);

    printf("============================================");
    printf("\n\tDigite a opracao escolhida: \n");
    printf("\n1. Media dos numeros digitados. ");
    printf("\n2. Diferenca dos numeros digitados. ");
    printf("\n3. Produtos entre os numeros digitados. ");
    printf("\n4. Divisao do primeiro pelo segundo. \n");

    printf("\t\t\t\t\t: ");
    scanf("%d",&op);

    printf("\n============================================\n");

    switch (op)
    {
    case 1:
        printf("Media: %.2f\n", (num1 + num2) / 2);
        break;
    case 2:
        printf("Diferenca: %.2f\n", num1 - num2);
        break;
    case 3:
        printf("Produto: %.2f\n", num1 * num2);
        break;
    case 4:
        printf("Divisao: %.2f\n", num1 / num2);
        break;

    default:
        printf("Operacao invalida.\n");
        break;
    }
printf("\n============================================");

    return 0;
}
 