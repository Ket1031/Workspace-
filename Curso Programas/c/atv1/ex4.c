#include <stdio.h>

int main()
{

float peso,altura,imc;

printf("Digite o peso: ");
scanf("%f",&peso);
printf("\nDigite sua altura: ");
scanf("%f",&altura);

imc = peso /(altura * altura);

printf("o imc corresponde a %.2f",imc);

return 0;

}
