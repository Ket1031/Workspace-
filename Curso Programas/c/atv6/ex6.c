#include <stdio.h>



int main()
{
  int numeros[10];
  int cont = 0;
  int utl;

  printf("digite 10 numeros: \n");
  for(int i = 0; i < 10; i++) {
        scanf("%d",&numeros[i]);
  }

    printf("Diite um numero para verificacao: ");
    scanf("%d",&utl);

    for (int i = 0; i < 10; i++)
    {
        if (utl == numeros[i])
        {
            cont++;
        }
        
    }

    printf("vezes que o numero escolhido aparece: %d",cont);
    
   

    return 0;
}
 