#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");
    int numeros[10];

    printf("Digite 10 numeros: \n");
    for(int i = 1; i <= 10; i++) {
        scanf("%d",&numeros[i]);
    }

    printf("Numeros inversos: ");
    for (int i = 10; i > 0; i--)
    {
        printf("%d",numeros[i]);
    }
    
    
    

    return 0;
}
 