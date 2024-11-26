#include <stdio.h>

int main()
{
    int total,horas,minutos,segundos;

    printf("Digite um valor em segundos: ");
    scanf("%d",&total);

    minutos = total / 60;
    segundos = total % 60;
    horas = minutos / 60;
    minutos = minutos - (horas * 60);
    

    printf("%d horas %d minutos e %d segundos",horas,minutos,segundos);



    return 0;
}