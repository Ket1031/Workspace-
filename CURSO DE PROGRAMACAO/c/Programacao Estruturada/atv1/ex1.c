#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL,"Portuguese");

   int num1,num2,soma;
   
   printf("insira o primeiro numero: ");
   scanf("%d",&num1);
   printf("insira o segundo numero: ");
   scanf("%d",&num2);
   soma = num1 + num2;
   printf("O resultado da soma entre %d e %d e igual a %d",num1,num2,soma);
   
    return 0;

}