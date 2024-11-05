#include <stdio.h>
#include <locale.h>


int maior(int vetor[10])
{
 int num_maior = vetor[0];

    for(int i = 0; i < 10; i++)
    
        if( vetor[i] > num_maior)
        {
        num_maior = vetor[i];
        }

    return num_maior;
 
}

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int vet[10];
    int m;

    for(int i = 0 ; i < 10; i++)
     {
        printf("Numero %d: ",i+1);
        scanf("%d",&vet[i]);
     }


    m = maior(vet);
    printf("maior numero: %d",m);

    return 0;
}
 