#include <stdio.h>



int main()
{
  int numeros[10];
  int maior,menor;

  printf("digite 10 numeros: \n");
  for(int i = 0; i < 10; i++) {
        scanf("%d",&numeros[i]);
  }

    maior = menor = numeros[0];

  for (int i = 0; i < 10; i++)
  {
    if(numeros[i] > maior)
    {
        maior = numeros[i];
    }

    if(numeros[i] < menor)
    {
        menor = numeros[i];
    }
    
  }
  
  printf("\nMaior numero: %d",maior);
  printf("\nMenor numero: %d",menor);
   

    return 0;
}
 