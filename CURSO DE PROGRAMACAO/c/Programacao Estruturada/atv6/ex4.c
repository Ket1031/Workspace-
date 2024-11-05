#include <stdio.h>

int main()
{
  int numeros[10]; 
  int soma = 0;
  int produto = 0;
  float media;

  printf("digite 10 numeros: \n");
  for(int i = 0; i < 10; i++) {
        scanf("%d",&numeros[i]);
  }
   
    for (int i = 0; i < 10; i++)
    {
        soma = soma + numeros[i];
        produto = produto * numeros[i];
    }

    media = soma/10;

    printf("\nsoma: %d",soma);
    printf("\nproduto: %d",produto);
    printf("\nmedia: %.2f",media);


    

    return 0;
}
 