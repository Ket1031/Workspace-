#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int n1, n2, n3;

    printf("Digite tres numeros: \n");
    scanf("%d %d %d",&n1,&n2,&n3);

    if(n1 > n2 && n1 > n3)
        printf(" o  numero %d e o maior numero",n1);
    
    else
        if (n2 > n1 && n2 > n3)
        {
            printf("o numero %d e o maior numero",n2);
        }
        else
            printf(" o numero %d e o maior numero",n3);
        


    return 0;
}