#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale (LC_ALL, "Portuguese");

    float n1,n2,n3,m;

    printf("Digite tres notas: \n");
    scanf("\n%f\n%f\n%f",&n1,&n2,&n3);

    m = (n1 + n2 + n3)/3;

    if(m > 9.5)
        printf("Aprovado");

    else 
        if (m > 8 )
        {
            printf("O aluno devera realizar exame de recurso.");
        }
        else 
            printf("reprovado");


    return 0;
}