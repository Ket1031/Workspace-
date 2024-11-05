#include <stdio.h>
#include <locale.h>

#define tam 10 

int main()
{
      setlocale (LC_ALL, "Portuguese");

    int v[tam];
    int j, temp;

    for (int i = 0; i < tam; i++)
    {
        printf("Digite um numero: ");
        scanf("%d",&v[i]);
    }

    for (int i = 0; i < tam; i++)
    {
        for(j = i + 1; j < tam; j++){
            if (v[j] < v[i])
                {
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }

        }
    }
    
    printf("Numeros ordenados: ");
    for (int i = 0; i < tam; i++)
    {
        printf("%d",v[i]);
    }
    

    return 0;
}
 