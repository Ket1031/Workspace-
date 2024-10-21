#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    float d,total;
    int t;

    printf("Digite a distancia em Km: ");
    scanf("%f",&d);

    printf("Digite o tipo de viagem: ");
    scanf("%d",&t);

    if( t == 1)
    {
        total = d * 0.70;
        printf("\nQuilómetros percorridos (Kms):  %.2f",d);
        printf("\nTipo (1 ou 2): %d",t);
        printf("\nValor sem IVA (Euros): %.2f",total);
        total = total - (total * (23/100));
        printf("\n-------------------------------------------------------- ");
        printf("\nValor com IVA (Euros): %.2f",total);

    }
    else
    {
        total = d * 0.95;
        printf("\nQuilómetros percorridos (Kms):  %.2f",d);
        printf("\nTipo (1 ou 2): %d",t);
        printf("\nValor sem IVA (Euros): %.2f",total);
        total = total - (total * (23/100));
        printf("\n-------------------------------------------------------- ");
        printf("\nValor com IVA (Euros): %.2f",total);
    }


    return 0;
}