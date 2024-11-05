#include <stdio.h>



int main()
{
  int numeros[10];

  printf("digite 10 numeros: \n");
  for(int i = 0; i < 10; i++) {
        scanf("%d",&numeros[i]);
  }
    printf("Numeros: ");
    for(int i = 0; i < 10; i++) {
        printf("%d",numeros[i]);

    }

    return 0;
}
 