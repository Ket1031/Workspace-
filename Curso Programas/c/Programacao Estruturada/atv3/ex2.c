#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");
    float pera,maca,total;

    printf("PERA\nmenos 5kg 1.80.\nmais de 5kg 1.60.\nDigite a quantidade desejada: ");
    scanf("%f",&pera);

    printf("MACA\nmenos 5kg 1.90.\nmais de 5kg 1.70.\nDigite a quantidade desejada: ");
    scanf("%f",&maca);

    if(maca + pera > 5)
    {
         total = (maca * 1.70) + (pera * 1.60);
         total = total - (total * (8/100));
         printf("Total a pagar com desconto: %.2f",total);  
    }
    else
    {
         total = (maca * 1.90) + (pera * 1.80);
         printf("Total a pagar: %.2f",total);
    }


    return 0;


}