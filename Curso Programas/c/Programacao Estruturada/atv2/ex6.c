#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    int n1, n2, n3;

    printf("Digite tres lados de um triangulo: \n");
    scanf("%d %d %d",&n1,&n2,&n3);

    if(n1 == n2 && n2 == n3)
        printf(" E um triangulo equilatero");
    
    else
        if (n1 == n2 || n1 == n3 || n2 == n3)
        {
            printf("E um triangulo isoceles");
        }
        else
            printf(" E um triangulo escaleno");
        



    return 0; 

}